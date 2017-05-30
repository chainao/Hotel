/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbproject.systay.controllers;

import com.dbproject.systay.beans.Funcionario;
import com.dbproject.systay.beans.Login;
import com.dbproject.systay.fachadas.FuncionarioFachada;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author johny
 */
@Controller
public class LoginController {
    
    @Autowired
    DataSource datasource;
    
    @Autowired
    FuncionarioFachada funcionarioFachada;
    
    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("login") Login login) {
        ModelAndView mav = null;
        boolean user = funcionarioFachada.validarUsuario(login);
        if (user) {
            mav = new ModelAndView("welcome");
            mav.addObject("firstname", "ok");
        } else {
            mav = new ModelAndView("login");
            mav.addObject("message", "Nome de usuário ou a senha estão errados!");
        }
        return mav;
    }
}

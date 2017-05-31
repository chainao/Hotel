/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbproject.systay.fachadas;

import com.dbproject.systay.beans.Funcionario;
import com.dbproject.systay.beans.Login;
import com.dbproject.systay.dao.impl.FuncionarioDaoImpl;
import com.dbproject.systay.dao.interfaces.FuncionarioDao;

/**
 *
 * @author johny
 */
public class FuncionarioFachada {

    FuncionarioDao funcionarioDao = new FuncionarioDaoImpl();
    
    public boolean validarUsuario(Login login) {
        return funcionarioDao.validarUsuario(login);
    }
    
}

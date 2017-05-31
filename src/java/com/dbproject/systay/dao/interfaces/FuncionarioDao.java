/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbproject.systay.dao.interfaces;

import com.dbproject.systay.beans.Funcionario;
import com.dbproject.systay.beans.Login;

/**
 *
 * @author johny
 */
public interface FuncionarioDao {
    void cadastrar(Funcionario funcionario);
    boolean validarUsuario(Login login);
}

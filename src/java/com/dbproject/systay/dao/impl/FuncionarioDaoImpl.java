/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbproject.systay.dao.impl;

import com.dbproject.systay.beans.Funcionario;
import com.dbproject.systay.beans.Login;
import com.dbproject.systay.dao.interfaces.FuncionarioDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author johny
 */
public class FuncionarioDaoImpl implements FuncionarioDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void cadastrar(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarUsuario(Login login) {
        /*String sql = "select * from tb_login where username='" + login.getUsername() + "' and senha='" + login.getSenha()+ "'";
        
        List<Login> logins = jdbcTemplate.query(sql, new LoginMapper());
        
        if (logins.size() > 0)
            logins.get(0);
        */
        return true;
    }
    
    class FuncionarioMapper implements RowMapper<Funcionario> {
        public Funcionario mapRow(ResultSet rs, int arg1) throws SQLException {
            Funcionario funcionario = new Funcionario();
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setDataAdmissao(rs.getDate("data_admissao"));
            funcionario.setDataDemissao(rs.getDate("data_admissao"));

            Login l = new Login(rs.getString("username"), rs.getString("senha"));
            funcionario.setLogin(l);
            
            return funcionario;
        }
    }
    
    class LoginMapper implements RowMapper<Login> {
        public Login mapRow(ResultSet rs, int arg1) throws SQLException {
            Login login = new Login();
            login.setUsername(rs.getString("username"));
            login.setSenha(rs.getString("senha"));
            return login;
        }
    }
    
}

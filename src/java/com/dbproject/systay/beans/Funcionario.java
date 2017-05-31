/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbproject.systay.beans;

import java.util.Date;
import java.util.List;

/**
 *
 * @author johny
 */
public class Funcionario extends Pessoa{
    
    private double salario;
    private Date dataAdmissao;
    private Date dataDemissao;
    private String pathFoto;
    private Login login;

    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, Endereco endereco, Date data_nascimento, List telefones) {
        super(cpf, nome, endereco, data_nascimento, telefones);
    }  

    public Funcionario(double salario, Date dataAdmissao, String pathFoto, String cpf, String nome, Endereco endereco, Date data_nascimento, List telefones) {
        super(cpf, nome, endereco, data_nascimento, telefones);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.pathFoto = pathFoto;
    }

    public Funcionario(double salario, Date dataAdmissao, Login login, String cpf, String nome, Endereco endereco, Date data_nascimento, List telefones) {
        super(cpf, nome, endereco, data_nascimento, telefones);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.login = login;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
   
}

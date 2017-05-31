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
public class Pessoa {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private Date data_nascimento;
    private List telefones;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, Date data_nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }

    public Pessoa(String cpf, String nome, Endereco endereco, Date data_nascimento, List telefones) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.data_nascimento = data_nascimento;
        this.telefones = telefones;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public List getTelefones() {
        return telefones;
    }

    public void setTelefones(List telefones) {
        this.telefones = telefones;
    }
    
}

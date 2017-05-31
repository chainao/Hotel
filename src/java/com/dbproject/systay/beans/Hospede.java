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
public class Hospede extends Pessoa {
    private String observacao;

    public Hospede() {
    }
    
    public Hospede(String observacao, String cpf, String nome, Endereco endereco, Date data_nascimento, List telefones) {
        super(cpf, nome, endereco, data_nascimento, telefones);
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}

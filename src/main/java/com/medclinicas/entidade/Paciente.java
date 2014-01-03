/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medclinicas.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author 01932121102
 */
@Entity
@Table(name = "paciente")
public class Paciente implements Serializable{
    @Id
    @Column(name = "id_paciente")
    @GeneratedValue
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private int senha;

    @Column(name = "dataNascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNasciment;
   
        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
        public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
        public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the telefone
     */
        public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
        public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
        public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the dataNasciment
     */
        public Date getDataNasciment() {
        return dataNasciment;
    }

    /**
     * @param dataNasciment the dataNasciment to set
     */
    public void setDataNasciment(Date dataNasciment) {
        this.dataNasciment = dataNasciment;
    }
    
    
}

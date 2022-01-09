/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author momog
 */
public class Administrativo {
    /**
     * nome do administrativo
     */
    private String nome;
    /**
     * email do administrativo
     */
    private String email;
    /**
     * construtor completo
     * @param nome nome do administrativo
     * @param email email do administrativo
     */
    public Administrativo(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    /**
     * 
     * @return nome do administrativo
     */
    public String getNome() {
        return nome;
    }
    /**
     * altera o nome
     * @param nome nome novo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return o email do administrativo
     */
    public String getEmail() {
        return email;
    }
    /**
     * altera o email
     * @param email email novo
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "Administrativo{" + "nome=" + nome + ", email=" + email + '}';
    }
    
}

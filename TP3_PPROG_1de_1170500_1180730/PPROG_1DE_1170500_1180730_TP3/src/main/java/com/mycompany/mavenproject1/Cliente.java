/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author momog
 */
public class Cliente {
    /**
     * nome do cliente
     */
    private String nome;
    /**
     * nif do cliente
     */
    private int nif;
    /**
     * email do cliente
     */
    private String email;
    /**
     * lista de endereços postais do cliente
     */
    private List<EnderecoPostal> ListaDeEnderecos;
    /**
     * construtor completo
     * @param nome nome do cliente
     * @param nif nif do cliente
     * @param email email do cliente
     */
    public Cliente(String nome, int nif, String email) {
        this.nome = nome;
        this.nif = nif;
        this.email = email;
        this.ListaDeEnderecos = new ArrayList<>();
    }
    /**
     * 
     * @return o nome do cliente
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
     * @return o nif do cliente 
     */
    public int getNif() {
        return nif;
    }
    /**
     * altera o nif
     * @param nif o nif novo
     */
    public void setNif(int nif) {
        this.nif = nif;
    }
    /**
     * 
     * @return o email 
     */
    public String getEmail() {
        return email;
    }
    /**
     * altera o email do cliente
     * @param email email novo
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 
     * @return a lista dos endereços
     */
    public List<EnderecoPostal> getListaDeEnderecos() {
        return ListaDeEnderecos;
    }
    /**
     * altera a lista dos endereços
     * @param ListaDeEnderecos lista nova
     */
    public void setListaDeEnderecos(List<EnderecoPostal> ListaDeEnderecos) {
        this.ListaDeEnderecos = ListaDeEnderecos;
    }
    /**
     * adiciona um endereço á lista
     * @param endereco rua do endereço
     * @param localidade localidade do endereço
     * @param parcelaUm primeira parcela do codigo postal
     * @param parcelaDois segunda parcela do codigo postal
     */
    public void addEndereco(String endereco, String localidade, int parcelaUm, int parcelaDois){
        EnderecoPostal endAux = new EnderecoPostal(endereco, localidade, parcelaUm, parcelaDois);
        ListaDeEnderecos.add(endAux);
    }
    /**
     * adiciona um endereço á lista
     * @param endereco endereço a ser adicionado
     */
    public void addEndereco(EnderecoPostal endereco){        
        ListaDeEnderecos.add(endereco);
    }
    /**
     * encontra um email pelo seu index
     * @param index index do email
     * @return 
     */
    public EnderecoPostal encontraEmailByID(int index){
        return ListaDeEnderecos.get(index);
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", Nif=" + nif + ", email=" + email + ", ListaDeEnderecos=" + ListaDeEnderecos + '}';
    }
    
    
}


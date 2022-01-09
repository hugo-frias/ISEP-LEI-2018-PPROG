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
public class EnderecoPostal {
    /**
     * rua do endereço
     */
    private String endereco;
    /**
     * localidade do endereço
     */
    private String localidade;
    /**
     * codigo postal do endereço
     */
    private CodigoPostal codPostal;
    /**
     * construtor completo
     * @param endereco rua do endereço
     * @param localidade localidade do endereço
     * @param codPostal codigo postal do endereço
     */
    public EnderecoPostal(String endereco, String localidade, CodigoPostal codPostal) {
        this.endereco = endereco;
        this.localidade = localidade;
        this.codPostal = codPostal;
    }
    /**
     * construtor completo
     * @param endereco rua do endereço
     * @param localidade localidade do endereço
     * @param parcelaUm primeira parcela do codigo postal
     * @param parcelaDois segunda parcela do codigo postal
     */
    public EnderecoPostal(String endereco, String localidade, int parcelaUm, int parcelaDois) {
        this.endereco = endereco;
        this.localidade = localidade;
        this.codPostal = new CodigoPostal(parcelaUm,parcelaDois);
    }    
    /**
     * 
     * @return o endereço
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * altera o endereço
     * @param endereco endereço novo
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * 
     * @return a localidade
     */
    public String getLocalidade() {
        return localidade;
    }
    /**
     * altera a localidade
     * @param localidade localidade nova
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    /**
     * 
     * @return o codigo postal
     */
    public CodigoPostal getCodPostal() {
        return codPostal;
    }
    /**
     * altera o codigo postal
     * @param codPostal codigo postal novo
     */
    public void setCodPostal(CodigoPostal codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "EnderecoPostal{" + "endereco=" + endereco + ", localidade=" + localidade + ", codPostal=" + codPostal + '}';
    }
    
    
}
   


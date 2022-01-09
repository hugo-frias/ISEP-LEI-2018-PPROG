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
public class AreaGeografica {
    /**
     * descrição da area geografica
     */
    private String descricao;
    /**
     * custo da deslocação
     */
    private double custoDeslocacao;
    /**
     * codigo postal     */

    private CodigoPostal codigoPostal;
    /**
     * construtor completo
     * @param descricao descrição da area geografica
     * @param custoDeslocacao custo da deslocação
     * @param codigoPostal codigo postal
     */
    public AreaGeografica(String descricao, double custoDeslocacao, CodigoPostal codigoPostal) {
        this.descricao = descricao;
        this.custoDeslocacao = custoDeslocacao;
        this.codigoPostal = codigoPostal;
    }
    /**
     * construtor completo
     * @param areaGeografica area geografica
     */
    public AreaGeografica(AreaGeografica areaGeografica) {
        this.descricao = areaGeografica.getDescricao();
        this.custoDeslocacao = areaGeografica.getCustoDeslocacao();
        this.codigoPostal = areaGeografica.getCodigoPostal();
    }

/**
 * construtor completo
 * @param descricao descrição da area geografica
 * @param custoDeslocacao custo da deslocação
 * @param parcelaUm primeira parcela do codigo postal
 * @param parcelaDois segunda parcela do codigo postal
 */
    public AreaGeografica(String descricao, double custoDeslocacao, int parcelaUm, int parcelaDois) {
        this.descricao = descricao;
        this.custoDeslocacao = custoDeslocacao;
        codigoPostal = new CodigoPostal(parcelaUm, parcelaDois);
    }
    /**
     * 
     * @return a descrição
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * altera a descrição
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * 
     * @return custo da deslocação
     */
    public double getCustoDeslocacao() {
        return custoDeslocacao;
    }    
    /**
     * altera o custo da deslocação
     * @param custoDeslocacao custo da deslocação
     */
    public void setCustoDeslocacao(double custoDeslocacao) {
        this.custoDeslocacao = custoDeslocacao;
    }
    /**
     * 
     * @return codigo postal
     */
    public CodigoPostal getCodigoPostal() {
        return codigoPostal;
    }
    /**
     * altera o codigo postal
     * @param codigoPostal codigo postal
     */
    public void setCodigoPostal(CodigoPostal codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "AreaGeografica{" + "descricao=" + descricao + ", custoDeslocacao=" + custoDeslocacao + ", codigoPostal=" + codigoPostal + '}';
    }
}

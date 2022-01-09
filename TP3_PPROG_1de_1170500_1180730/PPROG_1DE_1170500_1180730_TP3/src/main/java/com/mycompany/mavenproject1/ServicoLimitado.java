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
public class ServicoLimitado implements Servicos{
    /**
     * id do serviço
     */
    private int id;
    /**
     * descrição breve do serviço
     */
    private String dBreve;
    /**
     * descrição completa do serviço
     */
    private String dCompleta;
    /**
     * custo/hora do serviço
     */
    private double custoHora;

    /**
     * construtor completo
     * @param id id do serviço
     * @param dBreve descrição breve do serviço
     * @param dCompl descrição completa do serviço
     * @param custoHora custo/hora do serviço
     */
    public ServicoLimitado (int id, String dBreve, String dCompl, double custoHora){
        this.id = id;
        this.dBreve = dBreve;
        this.dCompleta = dCompl;
        this.custoHora = custoHora;
    }
    
    /**
     * altera o id
     * @param id novo id
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return a descrição breve
     */
    @Override
    public String getdBreve() {
        return dBreve;
    }
    /**
     * altera a descrição breve
     * @param dBreve nova descrição
     */
    @Override
    public void setdBreve(String dBreve) {
        this.dBreve = dBreve;
    }
    /**
     * 
     * @return descrição completa
     */
    @Override
    public String getdCompleta() {
        return dCompleta;
    }
    /**
     * altera a descrição completa
     * @param dCompleta nova descrição
     */
    @Override
    public void setdCompleta(String dCompleta) {
        this.dCompleta = dCompleta;
    }

    

    /**
     * altera o custo/hora
     * @param custoHora novo custo/hora
     */
    @Override
    public void setCustoHora(double custoHora) {
        this.custoHora = custoHora;
    }
    /**
     * 
     * @return custo hora
     */
    @Override
    public double getCustoHora() {
        return custoHora;
    }
    /**
     * 
     * @return tipo de serviço
     */
    @Override
    public String getTipoDeServico() {
        return Servicos.L;
    }
    /**
     * 
     * @return o id
     */
    @Override
    public int getId() {
        return id;
    }
    /**
     * 
     * @return booleano a dizer se possui outros atributos
     */
    @Override
    public boolean possuiAtributos() {
        return false;
    }
    
      @Override
      /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "ServicoLimitado{" + "id=" + id + ", descBreve=" + dBreve + ", descCompl=" + dCompleta + ", custoHora=" + custoHora + '}';
    }


}
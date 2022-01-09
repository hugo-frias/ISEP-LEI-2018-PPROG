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
public interface Servicos {
    /**
     * terminação do tipo de serviço limitado
     */
    public static final String L = "Limitado";
    /**
     * terminação do tipo de serviço fixo
     */
    public static final String F = "Fixo";
    /**
     * terminação do tipo de serviço expansivel
     */
    public static final String E = "Expansivel";
    /**
     * 
     * @return o custo/hora do serviço
     */
    public double getCustoHora();
    /**
     * 
     * @return o tipo de serviço
     */
    public String getTipoDeServico();
    /**
     * 
     * @return o id do serviço
     */
    public int getId();
    /**
     * 
     * @return um boolean a referir se o serviço possui atributos extra (duração pre-determinada)
     */
    
    public boolean possuiAtributos();
    /**
     * altera o custo/hora
     * @param custoHora novo custo/hora
     */
    public void setCustoHora(double custoHora); 
     /**
     * altera a descrição completa
     * @param dCompleta nova descrição
     */
    public void setdCompleta(String dCompleta);
    /**
     * 
     * @return descrição completa
     */
    public String getdCompleta();
    /**
     * altera a descrição breve
     * @param dBreve nova descrição
     */
    public void setdBreve(String dBreve);
    /**
     * 
     * @return a descrição breve
     */
    public String getdBreve();
    /**
     * altera o id
     * @param id novo id
     */
    public void setId(int id);
    
        
    }

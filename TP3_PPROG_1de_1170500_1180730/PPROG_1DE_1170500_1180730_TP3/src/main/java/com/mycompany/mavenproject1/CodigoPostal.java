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
public class CodigoPostal {
    /**
     * primeira parcela do codigo postal
     */
    private int parcelaUm;
    /**
     * segunda parcela do codigo de postal
     */
    private int parcelaDois;    
    /**
     * construtor completo
     * @param parcelaUm primeira parcela do codigo postal
     * @param parcelaDois segunda parcela do codigo de postal
     */
    public CodigoPostal(int parcelaUm, int parcelaDois) {
        this.parcelaUm = parcelaUm;
        this.parcelaDois = parcelaDois;
    }
    /**
     * construtor completo
     * @param codigoPostal codigo postal em String 
     */
   public CodigoPostal(String codigoPostal){
       String[] aux = codigoPostal.split("-");
       parcelaUm = Integer.parseInt(aux[0]);
       parcelaDois = Integer.parseInt(aux[1]);
   }
   /**
    * construtor completo
    * @param codigoPostal codigo postal em objeto
    */
   public CodigoPostal(CodigoPostal codigoPostal){       
       parcelaUm = codigoPostal.getParcelaUm();
       parcelaDois = codigoPostal.getParcelaDois();
   }
   /**
    * 
    * @return primeira parcela
    */
    public int getParcelaUm() {
        return parcelaUm;
    }
    /**
     * altera a primeira parcela
     * @param parcelaUm pvalor novo
     */
    public void setParcelaUm(int parcelaUm) {
        this.parcelaUm = parcelaUm;
    }
    /**
     * 
     * @return a segunda parcela
     */
    public int getParcelaDois() {
        return parcelaDois;
    }
    /**
     * altera a segunda parcela
     * @param parcelaDois valor novo
     */
    public void setParcelaDois(int parcelaDois) {
        this.parcelaDois = parcelaDois;
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "CodigoPostal{" + "parcelaUm=" + parcelaUm + ", parcelaDois=" + parcelaDois + '}';
    }
   
    
    
}


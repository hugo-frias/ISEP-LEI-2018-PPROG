/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Vera Pinto
 */
public class DisponibilidadeDiaria {
    /**
     * Data de inicio da disponibilidade diaria
     */
    private Data dataIni;
    /**
     * Hora de inicio da disponibilidade diaria
     */
    private Tempo horaIni;
    /**
     * Data de fim da disponibilidade diaria
     */
    private Data dataFim;
    /**
     * Hora de fim da disponibilidade diaria
     */
    private Tempo horaFim;

    /**
     * Construtor completo 
     * @param dataI Data de inicio da disponibilidade diaria
     * @param horaI Hora de inicio da disponibilidade diaria
     * @param dataF Data de fim da disponibilidade diaria
     * @param horaF Hora de fim da disponibilidade diaria
     */
    public DisponibilidadeDiaria(Data dataI, Tempo horaI, Data dataF, Tempo horaF) {
        this.dataIni = new Data(dataI);
        this.horaIni = new Tempo(horaI);
        this.dataFim = new Data(dataF);
        this.horaFim = new Tempo(horaF);
    }
    /**
     * Metodo para obter a data de inicio da disponibilidade diaria
     * @return data de inicio da disponibilidade diaria
     */
    public Data getDataIni() {
        return dataIni;
    }
    /**
     * Metodo para obter a hora de inicio da disponibilidade diaria
     * @return hora de inicio da disponibilidade diaria
     */
    public Tempo getHoraIni() {
        return horaIni;
    }
    /**
     * Metodo para obter a data de fim da disponibilidade diaria
     * @return data de fim da disponibilidade diaria
     */
    public Data getDataFim() {
        return dataFim;
    }
    /**
     * Metodo para obter a hora de fim da disponibilidade diaria
     * @return hora de fim da disponibilidade diaria
     */
    public Tempo getHoraFim() {
        return horaFim;
    }
    /**
     * Metodo para alterar a data de inicio da disponibilidade diaria
     * @param dataIni nova data de inicio da disponibilidade diaria
     */
    public void setDataIni(Data dataIni) {
        this.dataIni = dataIni;
    }
    /**
     * Metodo para alterar a hora de inicio da disponibilidade diaria
     * @param horaIni nova hora de inicio da disponibilidade diaria
     */
    public void setHoraIni(Tempo horaIni) {
        this.horaIni = horaIni;
    }
    /**
     * Metodo para alterar a data de fim da disponibilidade diaria
     * @param dataFim nova data de fim da disponibilidade diaria
     */
    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }
    /**
     * Metodo para alterar a hora de fim da disponibilidade diaria
     * @param horaFim nova hora de fim da disponibilidade diaria
     */
    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }
    /**
     * Metodo para imprimir as disponibilidades diarias
     * @return
     */
    @Override
    public String toString(){
        return String.format("Data Inicial: %s%n, Hora de Entrada: %s%n, Data Final: %s%n, Hora de Saida: %s%n", getDataIni(), getHoraIni(), getDataFim(), getHoraFim());
    }
}

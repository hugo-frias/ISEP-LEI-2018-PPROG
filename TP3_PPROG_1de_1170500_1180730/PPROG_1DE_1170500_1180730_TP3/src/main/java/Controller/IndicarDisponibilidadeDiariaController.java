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
public class IndicarDisponibilidadeDiariaController {
    
    /**
     * Metodo para criar uma disponibilidade diaria
     * @param dataI data de inicio da disponibilidade
     * @param horaI hora de inicio da disponibilidade
     * @param dataF data de fim da disponibilidade
     * @param horaF hora de fim da disponibilidade
     * @return 
     */
    public static DisponibilidadeDiaria novaDisponibilidade(Data dataI, Tempo horaI, Data dataF, Tempo horaF){
        DisponibilidadeDiaria disp= new DisponibilidadeDiaria(dataI, horaI, dataF, horaF);
        return disp;
    }
    
}

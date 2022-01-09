/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico2;

/**
 *
 * @author Hugo
 */
public interface InterfaceAtleta {
    /**
     * variavel para o género masculino
     */
    public static final String MASCULINO = "Masculino";
    /**
     * variavel para o genero feminino
     */
    public static final String FEMININO = "Feminino";
    /**
     * variavel para a categoria caminhada
     */
    public static final String CAMINHADA = "Caminhada";
    /**
     * variavel para a categoria corrida
     */
    public static final String CORRIDA = "Corrida";
    /**
     * variavel para a categoria ciclismo
     */
    public static final String CICLISMO = "Ciclismo";
    /**
     * variavel para a categoria natação
     */
    public static final String NATACAO = "Natação";
    /**
     * intensidade de treino para queima de gordura
     */
    public static final float IT1 = 0.6f;
    /**
     * intensidade de treino para capacidade cardiorespiratória
     */
    public static final float IT2 = 0.75f; 
    /**
     * Frequencia cardiaca em repouso padrão
     */
    public static final float FCRPadrao = 80f;
    /**
     * valor do IRS
     */
    double IRS = 0.1;
    /**
     * método para calcular o valor mensal com IRS
     * @return o valor mensal com IRS
     */
    public double ValorDoIRS();
    
}
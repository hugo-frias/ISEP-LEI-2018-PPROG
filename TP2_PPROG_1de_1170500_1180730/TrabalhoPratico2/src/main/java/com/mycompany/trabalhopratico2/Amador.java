/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico2;

/**
 *
 * @author Vera Pinto
 */
    public class Amador extends NaoProfissional {
    /**
     * Percentagem que é igual para todos os atletas
     */
    private static double percentagemIgual = 0.7;
    /**
     * pagamento minimo a receber pelos atletas
     */
    private static double pagamentoMinimo = 5;
    /**
     * número total de atletas amadores
     */
    private static int totalAmador = 0;

    /**
     * Construtor Completo
     *
     * @param nome nome do atleta
     * @param ID ID do atleta
     * @param genero género do atleta
     * @param idade idade do atleta
     * @param atividade atividade praticada pelo atleta
     * @param valorMensal valor mensal a receber pelo atleta
     * @param antiguidade antiguidade do atleta
     */
    public Amador(String nome, int ID, String genero, int idade, String atividade, int valorMensal, int antiguidade) {
        super(nome, ID, genero, idade, atividade, valorMensal, antiguidade);
        totalAmador++;
    }

    /**
     * Construtor Vazio
     */
    public Amador() {
        super();
        totalAmador++;
    }
 /**
     * Metodo para imprimir os dados de um atleta
     * @return 
     */
    @Override
    public String toString(){
        return super.toString();
    }
    /**
     * Metodo para calcular o pagamento mensal de um atleta amador
     * @return
     */
    @Override
    public double calcularPagamentoMensal() {
        return getValorMensal()*determinarPercentagem()+getValorMensal()* getPercentagemIgual();
    }
    /**
     * Permite visualizar a percentagem que é igual para qualquer atleta amador
     *
     * @return percentagem Igual para qualquer atleta amador
     */
    public static double getPercentagemIgual() {
        return percentagemIgual;
    }

    /**
     * Permite visualizar o pagamento mínimo que é igual para qualquer atleta
     * amador
     *
     * @return pagamento minimo
     */

    public static double getPagamentoMinimo() {
        return pagamentoMinimo;
    }

    /**
     * Permite visualizar o numero total de Atletas Amadores
     *
     * @return
     */
    public static int getTotalAmador() {
        return totalAmador;
    }
    /**
     * Permite atualizar a percentagem que é igual para qualquer atleta
     * @param percentagemIgual 
     */
            
    public static void setPercentagemIgual(double percentagemIgual) {
        Amador.percentagemIgual = percentagemIgual;
    }
/**
 * Permite atualizar o payment mínimo que é igual para qualquer atleta
 * @param pagamentoMinimo 
 */
    public static void setPagamentoMinimo(double pagamentoMinimo) {
        Amador.pagamentoMinimo = pagamentoMinimo;
    }

    
   
}

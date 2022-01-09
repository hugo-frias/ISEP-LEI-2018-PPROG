/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico1;

/**
 *
 * @author Vera Pinto
 */
public class Amador extends NaoProfissional {

    private static double percentagemIgual = 0.7;
    private static double pagamentoMinimo = 5;
    private static int totalAmador = 0;

    /**
     * Construtor Completo
     *
     * @param nome
     * @param ID
     * @param genero
     * @param idade
     * @param atividade
     * @param valorMensal
     * @param antiguidade
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
}

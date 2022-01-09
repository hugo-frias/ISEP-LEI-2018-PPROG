/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico1;

/**
 *
 * @author Hugo .
 */
public class Profissional extends Atleta {

    private double parcelaFixa;
    private static double parcelaVariavel = 0.2;
    private static int totalProfissionais = 0;
    private static final double PARCELAFIXA_BY_OMISSION = 0;
    /**
     * Construtor completo
     * @param nome - nome do atleta
     * @param ID - ID do atleta
     * @param genero - género do atleta
     * @param idade - idade do atleta
     * @param atividade - atividade que o atleta pratica
     * @param valorMensal - valor mensal em prémios recebido pelo atleta
     * @param parcelaFixa - parcela fixa recebida pelo atleta
     */
    public Profissional (String nome, int ID, String genero, int idade, String atividade, double valorMensal, double parcelaFixa){
        super(nome, ID, genero, idade, atividade, valorMensal);
        this.parcelaFixa = parcelaFixa;
        totalProfissionais++;
    }
    /**
     * Construtor vazio
     */
    public Profissional(){
        super();
        parcelaFixa = PARCELAFIXA_BY_OMISSION;
    }
    /**
     * Método para obter o valor da parcela fixa
     * @return a parcelaFixa
     */
    public double getParcelaFixa() {
        return parcelaFixa;
    }
    /**
     * Método para obter o valor da parcela variavel
     * @return a parcelaVariavel
     */
    public static double getParcelaVariavel() {
        return parcelaVariavel;
    }
    /**
     * Método para obter o número total de profissionais
     * @return o número de profissionais
     */
    public static int getTotalProfissionais(){
        return totalProfissionais;
    }
    /**
     * Método para alterar o valor da parcela fixa
     * @param parcelaFixa - valor final da parcelaFixa
     */
    public void setParcelaFixa(double parcelaFixa) {
        this.parcelaFixa = parcelaFixa;
    }
    /**
     * Método para alterar o valor da parcela variavel
     * @param aParcelaVariavel - valor final da parcela variavel
     */
    public static void setParcelaVariavel(double aParcelaVariavel) {
        parcelaVariavel = aParcelaVariavel;
    }
    /**
     * Método para imprimir um atleta profissional
     * @return String a imprimir
     */
    public String toString(){
        return super.toString() + "parcela fixa = "+parcelaFixa;
    }
    

    /**
     *Método para calcular o valor de pagamento mensal
     * @return o valor do pagamento mensal
     */
    @Override
    public double calcularPagamentoMensal() {
        return parcelaFixa + getValorMensal() * parcelaVariavel;
    }

    

    

    

    

}

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
public class Profissional extends Atleta implements InterfaceAtleta {
    /**
     * parcela fixa que os atletas recebem
     */
    private double parcelaFixa;
    /**
     * parcela fixa por omissão
     */
    private static final double PARCELAFIXA_BY_OMISSION = 0;
    /**
     * parcela variável que os atletas recebem
     */    
    private static double parcelaVariavel = 0.2;
    /**
     * Número total de atletas profissionais
     */
    private static int totalProfissionais = 0;
    
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
        totalProfissionais++;
    }

    /**
     * Método para obter o valor da parcela fixa
     * @return a parcelaFixa
     */
    public double getParcelaFixa() {
        return parcelaFixa;
    }
    /**
     * Método para alterar o valor da parcela fixa
     * @param parcelaFixa - valor final da parcelaFixa
     */
    public void setParcelaFixa(double parcelaFixa) {
        this.parcelaFixa = parcelaFixa;
    }
    /**
     *Método para calcular o valor de pagamento mensal
     * @return o valor do pagamento mensal
     */
    @Override
    public double calcularPagamentoMensal() {
        return parcelaFixa + getValorMensal() * parcelaVariavel;
    }
/**
 * Método para calcular o pagamento mensal incluindo o IRS
 * @return 
 */
    @Override
    public double ValorDoIRS() {
        return parcelaFixa*IRS;
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
    @Override
    public String toString(){
        return super.toString() + "parcela fixa = "+parcelaFixa;
    }
    

    

    

    

    

    

}


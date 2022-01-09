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
public class SemiProfissional extends NaoProfissional {

    private static double parcelaFixa=1500;
    private static int totalSemiProfissional=0;
/**
 * Construtor Completo
 * @param nome
 * @param ID
 * @param genero
 * @param idade
 * @param atividade
 * @param valorMensal
 * @param antiguidade 
 */
    public SemiProfissional(String nome, int ID, String genero, int idade, String atividade, int valorMensal, int antiguidade) {
        super(nome, ID, genero, idade, atividade, valorMensal, antiguidade);
        totalSemiProfissional++;
    }
/**
 * Construtor Vazio
 */
    public SemiProfissional() {
        super();
        totalSemiProfissional++;
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
 * Metodo para obter o total de atletas semi-profissionais
 * @return total de atletas semi profissionais
 */
    public static int getTotalSemiProfissional() {
        return totalSemiProfissional;
    }
    

    /**
     * Metodo para retornar parcela fixa atual
     * @return valor da parcela fixa atual
     */
    public static double getParcelaFixa() {
        return parcelaFixa;
    }

    /**
     * Metodo para alterar a parcela fixa 
     * @param parcelaFixa nova parcela fixa
     */
    public static void setParcelaFixa(double parcelaFixa) {
        SemiProfissional.parcelaFixa = parcelaFixa;
    }

    /**
     *Método para calcular o pagamento de um atleta semi-profissional
     * @return
     */
    @Override
    public double calcularPagamentoMensal() {
        return determinarPercentagem()*parcelaFixa+parcelaFixa;
    }

}

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
public class SemiProfissional extends NaoProfissional implements InterfaceAtleta {
    /**
     * Parcela fixa que o atleta recebe
     */
    private static double parcelaFixa=1500;
    /**
     * número total de atletas semi-profissionais
     */
    private static int totalSemiProfissional=0;
/**
 * Construtor Completo
 * @param nome - nome do atleta
 * @param ID - ID do atleta
 * @param genero - Género do atleta
 * @param idade - idade do atleta
 * @param atividade - atividade que o atleta pratica
 * @param valorMensal - valor mensal recebido pelo atleta
 * @param antiguidade - antiguidade do atleta
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
    
    /**
     * método para calcular o valor mensal com IRS
     * @return o valor mensal com IRS
     */
    @Override
    public double ValorDoIRS() {
         return parcelaFixa*IRS;
    }


}

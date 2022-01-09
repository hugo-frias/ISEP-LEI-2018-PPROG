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
public abstract class NaoProfissional extends Atleta {

    private int antiguidade;
    private static final int ANTIGUIDADE_POR_OMISSAO = 0;

    private static double percentagem1 = 0.02;
    private static double percentagem2 = 0.08;
    private static double percentagem3 = 0.2;
    private static int totalNaoProfissionais = 0;

    /**
     * Construtor completo
     *
     * @param nome nome do atleta
     * @param ID id do atleta
     * @param genero genero do atleta
     * @param idade idade do atleta
     * @param atividade atividade do atleta
     * @param antiguidade antiguidade do atleta
     */
    public NaoProfissional(String nome, int ID, String genero, int idade, String atividade,int valorMensal, int antiguidade) {
        super(nome, ID, genero, idade, atividade, valorMensal);
        this.antiguidade = antiguidade;
        totalNaoProfissionais++;
    }

    /**
     * Construtor com apenas antiguidade
     *
     * @param antiguidade antiguidade do atleta
     */
    public NaoProfissional() {
        super();
        this.antiguidade = ANTIGUIDADE_POR_OMISSAO;
        totalNaoProfissionais++;
    }

    /**
     * Retorna a antiguidade do atleta
     *
     * @return Antiguidade do atleta
     */
    public int getAntiguidade() {
        return antiguidade;
    }

    /**
     * Altera o valor da antiguidade do atleta
     *
     * @param antiguidade nova antiguidade do atleta
     */
    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    /**
     * Metodo para imprimir os dados de um atleta
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" com %d anos de antiguidade", antiguidade);
    }

    /**
     * Método para calcular a percentagem mediante a antiguidade do atleta
     * não-profissional
     *
     * @return a percentagem tendo em conta a antiguidade
     */
    public double determinarPercentagem() {
        if (antiguidade >= 5 && antiguidade <= 10) {
            return percentagem1;
        } else if (antiguidade > 10 && antiguidade <= 20) {
            return percentagem2;
        }
        return percentagem3;
    }

    /**
     * Metodo que sera desenvolvido por todas as subclasses que determinará o
     * pagamento do atleta
     *
     * @return
     */
    @Override
    public abstract double calcularPagamentoMensal();

    /**
     * Metodo para obter a percentagem dos 5 aos 10 anos de antiguidade
     *
     * @return
     */
    public static double getPercentagem1() {
        return percentagem1;
    }

    /**
     * Metodo para obter a percentagem dos 10 aos 20 anos de antiguidade
     *
     * @return
     */
    public static double getPercentagem2() {
        return percentagem2;
    }

    /**
     * Metodo para obter a percentagem para mais de 20 de antiguidade
     *
     * @return
     */
    public static double getPercentagem3() {
        return percentagem3;
    }

    /**
     * Metodo para obter o total de Atletas nao profissionais
     *
     * @return
     */
    public static int getTotalNaoProfissionais() {
        return totalNaoProfissionais;
    }

    /**
     * Metodo para alterar a percentagem dos 5 aos 10 anos de antiguidade
     *
     * @param percentagem1
     */
    public static void setPercentagem1(double percentagem1) {
        NaoProfissional.percentagem1 = percentagem1;
    }

    /**
     * Metodo para alterar a percentagem dos 10 aos 20 anos de antiguidade
     *
     * @param percentagem2
     */
    public static void setPercentagem2(double percentagem2) {
        NaoProfissional.percentagem2 = percentagem2;
    }

    /**
     * Metodo para alterar a percentagem depois dos 20 anos de antiguidade
     *
     * @param percentagem3
     */
    public static void setPercentagem3(double percentagem3) {
        NaoProfissional.percentagem3 = percentagem3;
    }

}

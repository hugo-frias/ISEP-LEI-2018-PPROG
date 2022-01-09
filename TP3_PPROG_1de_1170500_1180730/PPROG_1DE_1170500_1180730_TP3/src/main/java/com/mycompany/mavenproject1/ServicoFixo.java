/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author momog
 */
public class ServicoFixo implements Servicos {

    /**
     * id do serviço
     */
    private int id;
    /**
     * descrição breve
     */
    private String dBreve;
    /**
     * descrição completa
     */
    private String dCompleta;
    /**
     * custo por hora
     */
    private double custoHora;
    /**
     * duração pre determinada do serviço
     */
    private double duracaoPreDeterminada;

    /**
     * construtor completo
     *
     * @param id id do serviço
     * @param dBreve descrição breve
     * @param dCompleta descrição completa
     * @param custoHora custo hora do serviço
     * @param duracaoPreDeterminada duração pre determinada do serviço
     */
    public ServicoFixo(int id, String dBreve, String dCompleta, double custoHora, double duracaoPreDeterminada) {
        this.id = id;
        this.dBreve = dBreve;
        this.dCompleta = dCompleta;
        this.custoHora = custoHora;
        this.duracaoPreDeterminada = duracaoPreDeterminada;
    }
    /**
     *
     * @return duração predeterminada
     */
    public double getDuracaoPreDeterminada() {
        return duracaoPreDeterminada;
    }

    /**
     * altera a duração pre determinada
     *
     * @param duracaoPreDeterminada duração pre determinada
     */
    public void setDuracaoPreDeterminada(double duracaoPreDeterminada) {
        this.duracaoPreDeterminada = duracaoPreDeterminada;
    }
    /**
     *
     * @return descrição breve
     */
    @Override
    public String getdBreve() {
        return dBreve;
    }

    /**
     * altera a descrição breve
     *
     * @param dBreve descrição breve
     */
    @Override
    public void setdBreve(String dBreve) {
        this.dBreve = dBreve;
    }

    /**
     *
     * @return descrição completa
     */
    @Override
    public String getdCompleta() {
        return dCompleta;
    }

    /**
     * altera a descrição completa
     *
     * @param dCompleta descrição completa
     */
    @Override
    public void setdCompleta(String dCompleta) {
        this.dCompleta = dCompleta;
    }

   

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "ServicoFixo{" + "id=" + id + ", descBreve=" + dBreve + ", descCompl=" + dCompleta + ", custoHora=" + custoHora + ", duracaoPreDeterminada=" + duracaoPreDeterminada + '}';
    }

    /**
     *
     * @return o custo hora
     */
    @Override
    public double getCustoHora() {
        return custoHora;
    }

    /**
     *
     * @return o tipo de serviço
     */
    @Override
    public String getTipoDeServico() {
        return Servicos.F;
    }

    /**
     *
     * @return o id
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     *
     * @return um booleano a dizer se possui ou não atributos
     */
    @Override
    public boolean possuiAtributos() {
        return true;
    }

    @Override
    public void setCustoHora(double custoHora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

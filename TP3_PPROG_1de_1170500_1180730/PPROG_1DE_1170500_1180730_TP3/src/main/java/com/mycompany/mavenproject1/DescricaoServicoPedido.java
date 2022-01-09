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
public class DescricaoServicoPedido {    
    /**
     * custo do pedido
     */
    private double custo;
    /**
     * serviço do pedido
     */
    private Servicos servico;
    /**
     * descrição do pedido
     */
    private String descricao;
    /**
     * duração do pedido
     */
    private double duracao;
    /**
     * construtor completo
     * @param servico serviço do pedido
     * @param descricao descrição do pedido
     * @param duracao duração do pedido
     */
    public DescricaoServicoPedido(Servicos servico, String descricao, double duracao) {
        this.duracao = duracao;
        this.servico = servico;
        this.descricao = descricao;
    }
    /**
     * 
     * @return o custo
     */
    public double getCusto() {
        return custo;
    }
    /**
     * altera o custo
     * @param custo custo novo 
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }
    /**
     * 
     * @return serviço
     */
    public Servicos getServico() {
        return servico;
    }
    /**
     * altera o serviço
     * @param servico serviço novo
     */
    public void setServico(Servicos servico) {
        this.servico = servico;
    }
    /**
     * 
     * @return descrição
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * altera a descrição
     * @param descricao descrição nova
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * 
     * @return a duração
     */
    public double getDuracao() {
        return duracao;
    }
    /**
     * altera a duração
     * @param duracao duração nova
     */
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    /**
     * calcula o custo do pedido
     * @return o custo do pedido
     */
    public double calcularCusto() {
        if(!servico.possuiAtributos()) {
            custo = (duracao / 60) * servico.getCustoHora();
        } else {
            ServicoFixo aux = (ServicoFixo) servico;
            custo = (aux.getDuracaoPreDeterminada() / 60) * servico.getCustoHora();
        }
        return custo;
    }
    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "ServicoPedido{" + "custo=" + custo + ", servico=" + servico + ", descricao=" + descricao + ", duracao=" + duracao + '}';
    }
    
}


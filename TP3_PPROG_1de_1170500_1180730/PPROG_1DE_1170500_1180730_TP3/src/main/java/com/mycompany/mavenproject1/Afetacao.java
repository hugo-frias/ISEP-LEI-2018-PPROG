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
public class Afetacao {
/**
 * variavel que guarda um prestador de serviços
 */
    private PrestadorServico prestador;
    /**
     * variavel que guarda a descrição de um pedido de prestação de serviços
     */
    private DescricaoServicoPedido dPedido;
    /**
     * construtor
     * @param prestador - prestador de serviços
     * @param dPedido
     */
    public Afetacao(PrestadorServico prestador, DescricaoServicoPedido dPedido) {
        this.prestador = prestador;
        this.dPedido = dPedido;
    }
    public Afetacao(Afetacao af){
        this.prestador = af.getPrestador();
        this.dPedido = af.getDescricaoPedido();
    }
    /**
     * metodo para retornar um prestador
     * @return prestador de serviços
     */
    public PrestadorServico getPrestador() {
        return prestador;
    }
    /**
     * metodo para alterar um prestador
     * @param prestador prestador de serviços
     */
    public void setPrestador(PrestadorServico prestador) {
        this.prestador = prestador;
    }
    /**
     * metodo para retornar uma descrição de um pedido
     * @return descrição de um pedido
     */
    public DescricaoServicoPedido getDescricaoPedido() {
        return dPedido;
    }
    /**
     * metodo para alterar uma descrição de um pedido
     * @param dPedido
     */
    public void setDescricaoPedido(DescricaoServicoPedido dPedido) {
        this.dPedido = dPedido;
    }
    
    
}

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
public class Empresa {
    /**
     * Classe que guarda as listas dos clientes
     */
    private RegistoClientes registoClientes;
    /**
     * classe que guarda as listas dos administrativos
     */
    private RegistoAdministrativo registoAdministrativo;
    /**
     * classe que guarda as listas das categorias
     */
    private RegistoCategorias registoCategorias;
    /**
     * classe que guarda as listas dos serviços
     */
    private RegistoServicos registoServicos;
    /**
     * classe que guarda as listas dos pedidos de prestação de serviços
     */
    private RegistoPedidoPrestacaoServico registoPedidoPrestacaoServico;
    /**
     * classe que guarda as listas das areas geograficas
     */
    private RegistoAreasGeograficas registoAreasGeograficas;
    /**
     * classe que guarda as listas dos prestadores de serviços
     */
    private RegistoPrestadorServico registoPrestadorServico;
    /**
     * classe que guarda as listas das afetações
     */
    private RegistoAfetacao registoAfetacao;
    /**
     * construtor vazio
     */
    public Empresa(){
    registoClientes = new RegistoClientes();
    registoCategorias = new RegistoCategorias();
    registoPedidoPrestacaoServico = new RegistoPedidoPrestacaoServico();
    registoAreasGeograficas = new RegistoAreasGeograficas();
    registoServicos = new RegistoServicos();
    registoPrestadorServico = new RegistoPrestadorServico();
    registoAdministrativo = new RegistoAdministrativo();
    registoAfetacao = new RegistoAfetacao();
    } 
    /**
     * 
     * @return o registo dos clientes
     */
    public RegistoClientes getRegistoClientes() {
        return registoClientes;
    }
    /**
     * altera o registo dos clientes
     * @param registoClientes registo novo
     */
    public void setRegistoClientes(RegistoClientes registoClientes) {
        this.registoClientes = registoClientes;
    }
    /**
     * 
     * @return o registo dos prestadores de serviços
     */
    public RegistoPrestadorServico getRegistoPrestadorServico() {
        return registoPrestadorServico;
    }
    /**
     * altera o registo dos prestadores de serviços
     * @param registoPrestadorServico registo novo
     */
    public void setRegistoPrestadorServico(RegistoPrestadorServico registoPrestadorServico) {
        this.registoPrestadorServico = registoPrestadorServico;
    }
    /**
     * 
     * @return o registo das categorias
     */
    public RegistoCategorias getRegistoCategorias() {
        return registoCategorias;
    }
    /**
     * 
     * @return o registo dos administrativos
     */
    public RegistoAdministrativo getRegistoAdministrativo() {
        return registoAdministrativo;
    }
    /**
     * altera o registo dos administrativos
     * @param registoAdministrativo registo novo
     */
    public void setRegistoAdministrativo(RegistoAdministrativo registoAdministrativo) {
        this.registoAdministrativo = registoAdministrativo;
    }
    /**
     * altera o registo das categorias
     * @param registoCategorias registo novo
     */
    public void setRegistoCategorias(RegistoCategorias registoCategorias) {
        this.registoCategorias = registoCategorias;
    }
    /**
     * 
     * @return registo de serviços
     */
    public RegistoServicos getRegistoServicos() {
        return registoServicos;
    }
    /**
     * altera o registo dos serviços
     * @param registoServicos registo dos serviços
     */
    public void setRegistoServicos(RegistoServicos registoServicos) {
        this.registoServicos = registoServicos;
    }
    /**
     * 
     * @return o registo dos pedidos de prestação de serviços
     */
    public RegistoPedidoPrestacaoServico getRegistoPedidoPrestacaoServico() {
        return registoPedidoPrestacaoServico;
    }
    /**
     * altera o registo dos pedidos de prestação de serviços
     * @param registoPedidoPrestacaoServico registo novo
     */
    public void setRegistoPedidoPrestacaoServico(RegistoPedidoPrestacaoServico registoPedidoPrestacaoServico) {
        this.registoPedidoPrestacaoServico = registoPedidoPrestacaoServico;
    }
    /**
     * 
     * @return o registo das areas geograficas
     */
    public RegistoAreasGeograficas getRegistoAreasGeograficas() {
        return registoAreasGeograficas;
    }
    /**
     * altera o registo das areas geograficas
     * @param registoAreasGeograficas registo novo
     */
    public void setRegistoAreasGeograficas(RegistoAreasGeograficas registoAreasGeograficas) {
        this.registoAreasGeograficas = registoAreasGeograficas;
    }
    /**
     * 
     * @return registo afetacao
     */
    public RegistoAfetacao getRegistoAfetacao() {
        return registoAfetacao;
    }
    /**
     * altera o registo afetacao
     * @param registoAfetacao 
     */
    public void setRegistoAfetacao(RegistoAfetacao registoAfetacao) {
        this.registoAfetacao = registoAfetacao;
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "Empresa{" + "registoClientes=" + registoClientes + ", registoCategorias=" + registoCategorias + ", registoServicos=" + registoServicos + ", registoPedidosServicosPrestados=" + registoPedidoPrestacaoServico + ", registoAreasGeograficas=" + registoAreasGeograficas + '}';
    }

    
}
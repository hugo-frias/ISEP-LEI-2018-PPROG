/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.List;


/**
 *
 * @author momog
 */
public class Controller_UC6 {
    /**
     * pedido auxiliar
     */
    private static PedidoPrestacaoServico pedAux;
    /**
     * retorna a lista dos endereços postais de um cliente
     * @param empresa empresa
     * @param email email do cliente
     * @return lista de endereços postais
     */
    public static List<EnderecoPostal> getEndPostais(Empresa empresa, String email){
        RegistoClientes rc = empresa.getRegistoClientes();
        Cliente cliente = rc.getClienteByEmail(email);
        return cliente.getListaDeEnderecos();        
    }
    /**
     * define o endereço postal de um pedido
     * @param id posição do email na lista impressa 
     * @param cliente 
     */
    public static void setEndPostal(int id, Cliente cliente){
        EnderecoPostal enderecoPostal = cliente.encontraEmailByID(id);        
        pedAux = new PedidoPrestacaoServico(cliente, enderecoPostal);
        
    }
    /**
     * obtem a lista das categorias
     * @param empresa empresa
     * @return lista das categorias
     */
    public static List<Categoria> getCategorias(Empresa empresa){
        RegistoCategorias rcat = empresa.getRegistoCategorias();
        return rcat.getCategorias();
    }
    /**
     * obtem os serviços de uma determinada categoria
     * @param empresa empresa
     * @param id id da categoria
     * @return lista dos serviços da categoria em questão
     */
    public static List<Servicos> getServicosDeCategoria(Empresa empresa, int id){
        RegistoCategorias rcat = empresa.getRegistoCategorias();
        return rcat.getServicosDeCategoria(id);
    }
    /**
     * adiciona um serviço ao pedido
     * @param empresa empresa
     * @param id id do serviço
     * @param descricao descrição do serviço
     * @param duracao duração do serviço
     * @return a descrição do serviço pedido
     */
    public static DescricaoServicoPedido addServicoPedido (Empresa empresa, int id, String descricao, int duracao){
        RegistoServicos rs = empresa.getRegistoServicos();
        Servicos servico = rs.getServicosById(id);
        DescricaoServicoPedido descAux = new DescricaoServicoPedido(servico, descricao, duracao);
        descAux.setCusto(descAux.calcularCusto());
        pedAux.addPedidoServico(descAux); 
        return descAux;
    }
    /**
     * adiciona um horario ao pedido
     * @param data dia do pedido
     * @param hora hora do pedido
     */
    public static void addHorario(Data data, Tempo hora) {
        Horario horario = new Horario(data, hora);
        pedAux.addHorario(horario);
    }
    /**
     * imprime o pedido para o ecrã
     * @param empresa empresa
     * @throws FileNotFoundException 
     */
    public static void apresentarPedido(Empresa empresa) throws FileNotFoundException{
        System.out.println("Pedido:");
        double custoTotal = pedAux.custoTotal(empresa);
        System.out.println("custo : "+custoTotal);
        UI_UC6.mostrarLista(pedAux.getListaDescricoes());
        UI_UC6.mostrarLista(pedAux.getListaHorarios());
    }
    /**
     * guarda o pedido num ficheiro binário
     * @param emp
     */
    public static void guardarPedido(Empresa emp){
        emp.getRegistoPedidoPrestacaoServico().registaPedido(pedAux);
        String nomeFich = "DadosPedidos";
        PedidoPrestacaoServico.guardar(nomeFich, pedAux);
    }
    }



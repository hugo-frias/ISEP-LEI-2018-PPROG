/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author momog
 */
public class PedidoPrestacaoServico implements Serialization {
    /**
     * total do custo do pedido
     */
    private double total;
    /**
     * cliente que fez o pedido
     */
    private Cliente cliente;
    /**
     * endereço postal do cliente
     */
    private EnderecoPostal enderecoPostal;
    /**
     * lista de descrições dos pedidos
     */
    private List<DescricaoServicoPedido> listaDescricoes;
    /**
     * lista dos horarios dos pedidos
     */
    private List<Horario> listaHorarios;
    /**
     *  numero do pedido
     */
    private int numDoPedido;
    /**
     * construtor completo
     * @param cliente cliente que fez o pedido
     * @param endPostal  endereço postal do cliente
     */
    public PedidoPrestacaoServico(Cliente cliente, EnderecoPostal endPostal) {
        this.cliente = cliente;
        this.enderecoPostal = endPostal;
        this.listaDescricoes = new ArrayList<>();
        this.listaHorarios = new ArrayList<>();
    }
    /**
     * 
     * @return o cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * altera o cliente
     * @param cliente cliente novo
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * 
     * @return o endereço postal
     */
    public EnderecoPostal getEnderecoPostal() {
        return enderecoPostal;
    }
    /**
     * altera o endereço postal
     * @param enderecoPostal endereço postal novo
     */
    public void setEnderecoPostal(EnderecoPostal enderecoPostal) {
        this.enderecoPostal = enderecoPostal;
    }
    /**
     * 
     * @return a lista das descrições dos pedidos
     */
    public List<DescricaoServicoPedido> getListaDescricoes() {
        return listaDescricoes;
    }
    /**
     * altera a lista das descriçoes dos pedidos
     * @param listaDescricoes lista nova
     */
    public void setListaDescricoes(List<DescricaoServicoPedido> listaDescricoes) {
        this.listaDescricoes = listaDescricoes;
    }
    /**
     * 
     * @return a lista dos horarios dos pedidos
     */
    public List<Horario> getListaHorarios() {
        return listaHorarios;
    }
    /**
     * altera a lista dos horarios dos pedidos
     * @param listaHorarios lista nova
     */
    public void setListaHorarios(List<Horario> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }
    /**
     * gera um numero de pedido aleatório (até 20 pedidos)
     */
    public void geraNumPedidoAleatório(){
        Random rand = new Random();
        int numdoPedido = rand.nextInt(20);      
    }
    /**
     * 
     * @return o numero do pedido
     */
    public int getNumDoPedido() {
        return numDoPedido;
    }
    /**
     * altera o numero do pedido
     * @param numDoPedido numero do pedido novo
     */
    public void setNumDoPedido(int numDoPedido) {
        this.numDoPedido = numDoPedido;
    }
    /**
     * adiciona um pedido de serviço á lista
     * @param servico serviço a realizar
     * @param descricao descrição do serviço
     * @param duracao duração do serviço
     */
    public void addPedidoServico(Servicos servico, String descricao, int duracao) {
        DescricaoServicoPedido aux = new DescricaoServicoPedido(servico, descricao, duracao);
        listaDescricoes.add(aux);
    }
    /**
     * adiciona um pedido de serviço á lista
     * @param descricaoServicoPedido descrição do serviço a adicionar
     */
    public void addPedidoServico(DescricaoServicoPedido descricaoServicoPedido) {        
        listaDescricoes.add(descricaoServicoPedido);
    }
    /**
     * adiciona um horario á lista
     * @param horario horario a adicionar
     */

    public void addHorario(Horario horario) {
        listaHorarios.add(horario);
    }

    /**public double outrosCustos(Empresa emp) throws FileNotFoundException {
        return enderecoPostal.getCodPostal().custoMinimo(emp);
    }*/
    /**
     * calcula o custo total dos pedidos
     * @param emp empresa
     * @return o custo total dos pedidos
     * @throws FileNotFoundException 
     */
    public double custoTotal(Empresa emp) throws FileNotFoundException {
        double custoTotal = 0;
        for (DescricaoServicoPedido desc : listaDescricoes) {
            custoTotal += desc.getCusto();
        }
        /*custoTotal += outrosCustos(emp);
        if(custoTotal != 0) {
            total = custoTotal;
        }*/        
        return custoTotal;
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "PedidoPrestacaoServico{" + "total=" + total + ", cliente=" + cliente + ", enderecoPostal=" + enderecoPostal + ", listaDescricoes=" + listaDescricoes + ", listaHorarios=" + listaHorarios + ", numDoPedido=" + numDoPedido + '}';
    }
    /**
     * guarda os pedidos num ficheiro binário
     * @param ficheiro nome do ficheiro
     * @param pps pedidos de prestação de serviços
     */
    public static void guardar(String ficheiro, PedidoPrestacaoServico pps) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ficheiro));
            try {
                out.writeObject(pps);
            } finally {
                out.close();
            }            
        } catch (IOException ex) {            
        }
    }
    /**
     * lê os pedidos de prestação de serviços de um ficheiro
     * @param ficheiro nome do ficheiro que contem os dados
     * @return um pedido de prestação de serviços
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public PedidoPrestacaoServico ler(String ficheiro) throws FileNotFoundException, IOException {
        PedidoPrestacaoServico pps;
        try { 
           ObjectInputStream in = new ObjectInputStream(new FileInputStream(ficheiro));
            try {
                pps = (PedidoPrestacaoServico) in.readObject();
            } finally {
                in.close();
            }
            return pps;
        } catch(IOException | ClassNotFoundException ex) {
            return new PedidoPrestacaoServico(cliente, enderecoPostal);
        }
    }

    @Override
    public String encoding() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

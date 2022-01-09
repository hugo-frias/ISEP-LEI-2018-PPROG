/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author momog
 */
public class RegistoPedidoPrestacaoServico {
    private List<PedidoPrestacaoServico> listaPedidos;
    
    public RegistoPedidoPrestacaoServico () {
        listaPedidos = new ArrayList<>();
    }
    
    public  List<PedidoPrestacaoServico> getListaPedidos() {
        return new ArrayList(listaPedidos);
    }
    
    public void registaPedido(PedidoPrestacaoServico pedido) {
        int num = geraNumeroDoPedido();
        pedido.setNumDoPedido(num);
        listaPedidos.add(pedido);
        // notificaCliente(pedido);        
    }
    
    public int geraNumeroDoPedido() {
        return (int) Math.random();
    }
    
    public void notificaCliente(PedidoPrestacaoServico pedido) {
        System.out.println(pedido);
    }
}


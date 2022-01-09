/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

public class Controller_UC10 {

    /**
     * afeta os pedidos de prestação de serviços aos prestadores de serviço
     *
     * @param emp empresa
     * @param admin administrador
     * @param pedido pedido de prestação de serviços
     * @param lp lista de pedidos de prestação de serviços
     * @return sucesso
     */
    public static boolean afetarPedido(Empresa emp, Administrativo admin, PedidoPrestacaoServico pedido, List<PedidoPrestacaoServico> lp) {

        List<PrestadorServico> listPres = emp.getRegistoPrestadorServico().getListaDePrestadoresServico();
        List<DescricaoServicoPedido> listaDesc = pedido.getListaDescricoes();
        for (DescricaoServicoPedido desc : listaDesc) {
            for (PrestadorServico prestador : listPres) {
                if (prestador.getListaCategorias().contains(emp.getRegistoCategorias().getCategoriaByServico(desc.getServico()))) {
                    Afetacao af = new Afetacao(prestador, desc);
                    emp.getRegistoAfetacao().addAfetacao(af);
                }
            }
        }
        lp.remove(pedido);
        return true;
    }

}

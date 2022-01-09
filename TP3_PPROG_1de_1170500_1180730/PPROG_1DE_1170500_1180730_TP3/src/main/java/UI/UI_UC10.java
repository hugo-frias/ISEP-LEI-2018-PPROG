/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class UI_UC10 {
    /**
     * UI que comunica com o utilizador
     * @param emp empresa
     * @param admin administrador
     * @throws FileNotFoundException 
     */
    public static void UI_uc10(Empresa emp, Administrativo admin) throws FileNotFoundException {
        String verificador;
        RegistoPedidoPrestacaoServico rp = emp.getRegistoPedidoPrestacaoServico();
        List<PedidoPrestacaoServico> lp = rp.getListaPedidos();
        do {
            Scanner ler = new Scanner(System.in);
            String op;
            System.out.println("Lista de pedidos de prestação de serviços:");            
            UI_UC6.mostrarLista(lp);            
            System.out.println("Selecione o pedido a afetar.");
            op = ler.next();
            if (Controller_UC10.afetarPedido(emp, admin, lp.get(Integer.parseInt(op)-1),lp)) {
                System.out.println("Afetação criada.");               
            } else {
                System.out.println("Não foi possivel afetar o pedido.");
            }
            System.out.println("Pretende afetar mais pedidos? (s/n)");
            verificador = ler.next();
        } while (verificador.equalsIgnoreCase("s") || !lp.isEmpty());
            Main.menuAdministrador(emp, admin);
    }

    

}

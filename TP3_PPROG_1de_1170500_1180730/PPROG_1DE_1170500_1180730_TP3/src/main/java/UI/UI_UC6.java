/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author momog
 */
public class UI_UC6 {
    /**
     * UI que comunica com o utilizador
     * @param empresa empresa
     * @param cliente cliente a usar a aplicação
     * @throws FileNotFoundException 
     */
    public static void UC6_UI(Empresa empresa, Cliente cliente) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        String op, endereco, localidade, descricao, data, hora;
        String duracao;
        int opAux;

        List<EnderecoPostal> lep = Controller_UC6.getEndPostais(empresa, cliente.getEmail());
        mostrarLista(lep);
        do{
        System.out.println("Deseja adicionar mais algum endereço? (s/n)");
        op = ler.nextLine();
        if(!op.equalsIgnoreCase("s") && !op.equalsIgnoreCase("n")){
            System.out.println("Introduza uma letra válida!");
        } else if (op.equalsIgnoreCase("s") || lep.isEmpty()) {
            System.out.println("Introduza o endereço");
            endereco = ler.next();
            System.out.println("Introduza a localidade");
            localidade = ler.next();
            System.out.println("Introduza o codigo postal separado por um traço (ex: 1111-111)");

            String[] codPostal = ler.next().split("-");
            cliente.addEndereco(endereco, localidade, Integer.parseInt(codPostal[0]), Integer.parseInt(codPostal[1]));
            System.out.println("Lista atualizada");
            lep = Controller_UC6.getEndPostais(empresa, cliente.getEmail());
            mostrarLista(lep);
        }}while(!op.equalsIgnoreCase("s") && !op.equalsIgnoreCase("n"));

        System.out.println("Introduza o número correspondente ao endereço postal que pretende");
        opAux = Integer.parseInt(ler.next());
        Controller_UC6.setEndPostal(opAux-1, cliente);

        do {
            List<Categoria> lc = Controller_UC6.getCategorias(empresa);
            mostrarLista(lc);
            System.out.println("Indique o número da categoria pretendida");
            opAux = Integer.parseInt(ler.next());
            List<Servicos> ls = Controller_UC6.getServicosDeCategoria(empresa, opAux-1);
            mostrarLista(ls);
            System.out.println("Indique o número do serviço pretendido");            
            opAux = Integer.parseInt(ler.next())-1;
            

            if (!ls.get(opAux).possuiAtributos()) {
                
                System.out.println("Qual é a duração (em minutos) do serviço?");
                duracao = ler.next();
                System.out.println("Indique uma descrição da tarefa");
                descricao = ler.next();                
                DescricaoServicoPedido auxDesc = Controller_UC6.addServicoPedido(empresa, ls.get(opAux).getId(), descricao, Integer.parseInt(duracao));
                System.out.println("Custo do serviço: "+auxDesc.getCusto());
                    
            } else {                
                duracao = "0";
                System.out.println("Indique uma descrição da tarefa");
                descricao = ler.next();                
                DescricaoServicoPedido auxDesc = Controller_UC6.addServicoPedido(empresa, ls.get(opAux).getId(), descricao, Integer.parseInt(duracao)); 
                System.out.println("Custo do serviço: "+auxDesc.getCusto());
            }

            System.out.println("Pretende adicionar outro serviço? (s/n)?");
            op = ler.next();
        } while (op.equalsIgnoreCase("s"));

        do {
            System.out.println("Digite a data para a realização do serviço (AAAA/MM/DD)");
            data = ler.next();
            try {
                String[] aux = data.split("/");
                int ano = Integer.parseInt(aux[0]);
                int mes = removeZero(aux[1]);
                int dia = removeZero(aux[2]);
                Data dataaux = new Data(ano, mes, dia);
                System.out.println("Digite um horário (HH:MM)");
                hora = ler.next();
                String[] aux2 = hora.split(":");
                Tempo tempo = new Tempo(Integer.parseInt(aux2[0]), Integer.parseInt(aux2[1]));
                Controller_UC6.addHorario(dataaux, tempo);
            } catch (DiaInvalidoException e) {

            } catch (MesInvalidoException e) {
            }
            System.out.println("Deseja adicionar outro horário? (s/n)");
            op = ler.next();
        } while (op.equalsIgnoreCase("s"));
        Controller_UC6.apresentarPedido(empresa);
        System.out.println("Confirma? (s/n)");
        op = ler.next();
        if (op.equalsIgnoreCase("s")) {
            System.out.println("Pedidos de serviço registados.");            
            Controller_UC6.guardarPedido(empresa);
        } else{
            System.out.println("Reenicie o programa e preencha novamente!");
            System.exit(0);
        }
        
    }
    /**
     * imprime listas
     * @param list lista a imprimir
     */
    public static void mostrarLista(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                System.out.println((i + 1) + "-" + list.get(i).toString());
            }
        }
    }
    /**
     * remove zeros "á esquerda" do número
     * @param S numero a ser alterado
     * @return numero alterado
     */
    private static int removeZero(String S) {
        int v = Integer.parseInt(S);
        int v1 = v / 10;
        int v2 = v % 10;
        if (v1 == 0) {
            return v2;
        }
        return v;
    }

}

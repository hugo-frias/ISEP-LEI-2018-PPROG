/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Vera Pinto
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {        
        Empresa empresa = LerFicheiros.adicionarInfo();
        RegistoClientes rc = empresa.getRegistoClientes();
        RegistoAdministrativo ra = empresa.getRegistoAdministrativo();
        RegistoPrestadorServico rp = empresa.getRegistoPrestadorServico();
        login(rc, ra, empresa, rp);
    }

    /**
     * menu com as opções de cliente
     *
     * @param empresa empresa que guarda os registos
     * @param cliente cliente a usar a aplicação
     * @param rc
     * @param ra
     * @param rp
     * @throws FileNotFoundException
     */
    public static void menuCliente(Empresa empresa, Cliente cliente, RegistoClientes rc, RegistoAdministrativo ra, RegistoPrestadorServico rp) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        int op;
        do {
            System.out.println("1- Efetuar pedido de serviço\n2- voltar ao login inicial\n3- fechar o programa");
            System.out.println("Escolha uma opção:");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    UI_UC6.UC6_UI(empresa, cliente);
                    break;
                case 2:
                    login(rc, ra, empresa, rp);
                case 3:                    
                    System.out.println("Até á próxima! Obrigado por usar o nosso programa!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 2);
    }

    /**
     * menu para os prestadores de serviços
     *
     * @param empresa empresa
     * @param prestadorServico prestador a usar a aplicação
     * @throws FileNotFoundException
     */
    public static void menuPrestadorServicos(Empresa empresa, PrestadorServico prestadorServico) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        int op;
        do {
            System.out.println("1- Indicar disponibilidade diária de prestação de serviços \n2- fechar o programa");
            System.out.println("Escolha uma opção:");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    IndicarDisponibilidadeUI.indicarDisponibilidadeUI();
                    break;
                case 2:
                    System.out.println("Até á próxima! Obrigado por usar o nosso programa!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 2);
    }

    /**
     * menu com as opções de administrador
     *
     * @param empresa empresa que possui os registos
     * @param adm administrador a usar a aplicação
     * @throws FileNotFoundException
     */
    public static void menuAdministrador(Empresa empresa, Administrativo adm) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        int op;
        do {
            System.out.println("1- Afetar os pedidos de prestação de serviços aos prestadores \n2- fechar o programa");
            System.out.println("Escolha uma opção:");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    UI_UC10.UI_uc10(empresa, adm);
                    break;
                case 2:
                    System.out.println("Até á próxima! Obrigado por usar o nosso programa!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 2);
    }

    /**
     * login
     *
     * @param rc Registo de Clientes
     * @param ra Registo de administrativos
     * @param empresa empresa que guarda os registos
     * @param rp registo prestador de serviços
     */
    public static void login(RegistoClientes rc, RegistoAdministrativo ra, Empresa empresa, RegistoPrestadorServico rp) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Iniciar o login como cliente, administrativo ou prestador de serviços? (c/a/p)");
        String actor = ler.next();        
            if (actor.equalsIgnoreCase("c")) {
                Cliente cliente = rc.getClienteByEmail(loginCliente(rc));
                menuCliente(empresa, cliente, rc, ra, rp);
            } else if (actor.equalsIgnoreCase("a")) {
                Administrativo adm = ra.getAdministrativoByEmail(loginAdministrativo(ra));
                menuAdministrador(empresa, adm);

            } else if (actor.equalsIgnoreCase("p")) {
                PrestadorServico prestador = rp.getPrestadorServicoByEmail(loginPrestador(rp));
                menuPrestadorServicos(empresa, prestador);                
            } else{
                System.out.println("Resposta Inválida!");
                login(rc, ra, empresa, rp);
            }
         
        }
    

    /**
     * login para os clientes
     *
     * @param rc registo dos clientes
     * @return email do cliente a usar a aplicação
     */
    public static String loginCliente(RegistoClientes rc) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor introduza o e-mail: ");
        String email = ler.nextLine();
        try {
            if (rc.getClienteByEmail(email) == null) {
                throw new Exception();
            } else {
                Cliente cli = rc.getClienteByEmail(email);                
                System.out.println("Bem-vindo(a).");
                return email;
            }
        } catch (Exception ClienteInvalido) {
            System.out.println("Não existe um cliente com esse email! Tente novamente");
            loginCliente(rc);
        }
        return email;
    }

    /**
     * login para os administrativos
     *
     * @param ra registo dos administrativos
     * @return o email do administrativo a usar a aplicação
     */
    public static String loginAdministrativo(RegistoAdministrativo ra) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor introduza o e-mail: ");
        String email = ler.nextLine();
        try {
            if (ra.getAdministrativoByEmail(email) == null) {
                throw new Exception();
            } else {
                Administrativo adm = ra.getAdministrativoByEmail(email);                
                System.out.println("Bem-vindo(a).");
                return email;
            }
        } catch (Exception AdministrativoInvalido) {
            System.out.println("Não existe um Administrativo com esse email! Tente novamente");
            loginAdministrativo(ra);
        }
        return email;
    }

    /**
     * login para os prestadores de serviços
     *
     * @param rp registo dos prestadores
     * @return email do prestador
     */
    public static String loginPrestador(RegistoPrestadorServico rp) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor introduza o e-mail: ");
        String email = ler.nextLine();
        try {
            if (rp.getPrestadorServicoByEmail(email) == null) {
                throw new Exception();
            } else {
                PrestadorServico prestador = rp.getPrestadorServicoByEmail(email);                
                System.out.println("Bem-vindo(a).");
                return email;
            }
        } catch (Exception AdministrativoInvalido) {
            System.out.println("Não existe um Prestador de serviços com esse email! Tente novamente");
            loginPrestador(rp);
        }
        return email;
    }

}

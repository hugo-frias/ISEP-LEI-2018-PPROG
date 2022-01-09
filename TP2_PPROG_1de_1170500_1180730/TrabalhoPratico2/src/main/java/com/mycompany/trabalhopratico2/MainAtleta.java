/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico2;

import static com.mycompany.trabalhopratico2.InterfaceAtleta.CAMINHADA;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.CICLISMO;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.CORRIDA;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.FEMININO;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.MASCULINO;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.NATACAO;

/**
 *
 * @author Hugo
 */
public class MainAtleta {

    public static void main(String[] args) {
        /**
         * valor total a pagar
         */
        double totalAPagar = 0;
        /**
         * valor total a pagar a profissionais
         */
        double totalAPagarProfissionais = 0;
        /**
         * valor total a pagar a amadores
         */
        double totalAPagarAmadores = 0;
        /**
         * valor total a pagar a semi profissionais
         */
        double totalAPagarSemiProfissionais = 0;

        Profissional P1 = new Profissional("José Augusto", 12345, MASCULINO, 19, CORRIDA, 2000, 10);
        Profissional P2 = new Profissional("Maria Clara", 12346, FEMININO, 19, CAMINHADA, 2000, 10);
        Profissional P3 = new Profissional("Marta Dias", 99999999, FEMININO, 1, NATACAO, 1500, 99);
        Amador A1 = new Amador("Zé tó", 12347, MASCULINO, 19, CORRIDA, 2000, 8);
        Amador A2 = new Amador("Maria Josefina", 12348, FEMININO, 19, CAMINHADA, 2500, 9);
        Amador A3 = new Amador("Vera Pinto", 99999999, FEMININO, 1, CICLISMO, 1700, 41);
        SemiProfissional S1 = new SemiProfissional("Artur Mário", 123459, MASCULINO, 19, CICLISMO, 2500, 10);
        SemiProfissional S2 = new SemiProfissional("Julieta Marquês", 123450, FEMININO, 19, CICLISMO, 3000, 10);
        SemiProfissional S3 = new SemiProfissional("Joana Monteiro", 123250, FEMININO, 19, NATACAO, 1500, 20);

        Atleta[] Atletas = new Atleta[7];
        Atletas[0] = P1;
        Atletas[1] = P2;
        Atletas[2] = S1;
        Atletas[3] = S2;
        Atletas[4] = S3;
        Atletas[5] = A1;
        Atletas[6] = A2;

        System.out.println("Listagem nº1 - Nome, FCM e FCT");
        for (int i = 0; i < Atletas.length; i++) {
            if (Atletas[i].getClass() != Profissional.class) {
                System.out.println("Nome: " + Atletas[i].getNome() + ", FCM: " + Atletas[i].calcFCM() + " e FCT: " + Atletas[i].calcFCT());
            }
        }
        System.out.println("Listagem nº2 - nome e valor a pagar");
        for (int i = 0; i < Atletas.length; i++) {
            System.out.println("Nome: " + Atletas[i].getNome() + " e valor a pagar: " + Atletas[i].calcularPagamentoMensal());
        }

        System.out.println("Número de atletas profissionais: " + Profissional.getTotalAtletas());
        System.out.println("Número de atletas amadores: " + Amador.getTotalAtletas());

        System.out.println("Listagem nº3 - valores a pagar por cada tipo de atleta");
        for (int i = 0; i < Atletas.length; i++) {
            if (Atletas[i].getClass() == Profissional.class) {
                totalAPagarProfissionais += Atletas[i].calcularPagamentoMensal();
            } else if (Atletas[i].getClass() == Amador.class) {
                totalAPagarAmadores += Atletas[i].calcularPagamentoMensal();
            } else if (Atletas[i].getClass() == SemiProfissional.class) {
                totalAPagarSemiProfissionais += Atletas[i].calcularPagamentoMensal();
            }
        }

        totalAPagar = totalAPagarAmadores + totalAPagarProfissionais + totalAPagarSemiProfissionais;
        System.out.println("Valor total a pagar a atletas do tipo profissional: " + totalAPagarProfissionais);
        System.out.println("Valor total a pagar a atletas do tipo amador: " + totalAPagarAmadores);
        System.out.println("Valor total a pagar a atletas do tipo semi-profissional: " + totalAPagarSemiProfissionais);
        System.out.println("Valor total a pagar: " + totalAPagar);

//Segunda Iteração
        Data d1 = new Data(2000, 11, 12);
        ClubeDesportivo CD1 = new ClubeDesportivo("Porto", d1);
        System.out.println("1. Retornar o nome do clube");
        System.out.println("\n Nome do Clube:" + CD1.getNome() + "\n");
        System.out.println("2. Inserir um novo atleta no contentor (associado por composição)");
        System.out.println("\n Listagem antes da adição de um atleta: \n");
        CD1.addAtleta(A1);
        CD1.addAtleta(A2);
        CD1.addAtleta(A3);
        CD1.addAtleta(S1);
        CD1.addAtleta(S2);
        CD1.addAtleta(S3);
        CD1.addAtleta(P2);
        CD1.addAtleta(P3);
        CD1.listarAtletas();
        System.out.println("\n Listagem depois da adição de um atleta: \n");
        CD1.addAtleta(P1);
        CD1.listarAtletas();
        System.out.println("3. Retornar uma lista de atletas, ordenada alfabeticamente por nome");
        System.out.println("\n Antes: \n");
        CD1.listarAtletas();
        CD1.ordenarAlfabeticamente();
        System.out.println("\n Depois \n");
        CD1.listarAtletas();
        System.out.println("4. Retornar uma lista de atletas, ordenada inversamente pelo valor dos prémios");
        System.out.println("\n Listagem Decrescente de Prémios: \n");
        System.out.println("\n Antes: \n");
        CD1.listarAtletas();
        System.out.println("\n Depois: \n");
        CD1.ordenarIPremios();
        CD1.listarAtletas();
        System.out.println("5. Retornar o valor total, para efeitos de IRS, da totalidade dos atletas;");
        System.out.println(CD1.calcularIRSTotal());
        System.out.println("6. Retornar uma lista de atletas do clube, ordenada alfabeticamente por categoria, modalidade e\n"
                + "nome;");
        System.out.println("\n Antes: \n");
        CD1.listarAtletas();
        System.out.println("\n Depois: \n");
        CD1.ordenarCompleto();
        CD1.listarAtletas();

    }
}

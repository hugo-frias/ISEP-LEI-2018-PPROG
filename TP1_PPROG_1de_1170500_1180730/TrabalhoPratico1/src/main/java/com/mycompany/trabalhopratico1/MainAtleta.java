/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico1;

/**
 *
 * @author Olga
 */
public class MainAtleta {
    public static void main(String[] args){
        double totalAPagar = 0;
        double totalAPagarProfissionais = 0;
        double totalAPagarAmadores = 0;
        double totalAPagarSemiProfissionais = 0;
        
        Profissional P1 = new Profissional("José Augusto", 12345, "masculino", 19, "Corrida", 2000, 10);
        Profissional P2 = new Profissional("Maria Clara", 12346, "feminino", 19, "Caminhada", 2000, 10);
        Amador A1 = new Amador("Zé tó", 12347, "masculino", 19, "Corrida", 2000, 8);
        Amador A2 = new Amador("Maria Josefina", 12348, "feminino", 19, "Caminhada", 2500, 9);
        SemiProfissional S1 = new SemiProfissional("Artur Mário", 123459, "masculino", 19, "Ciclismo", 2500, 10);
        SemiProfissional S2 = new SemiProfissional("Julieta Marquês", 123450, "feminino", 19, "Ciclismo", 3000, 10);
        SemiProfissional S3 = new SemiProfissional("Joana Monteiro", 123250, "feminino", 19, "Ciclismo", 1500, 20);
        
        Atleta[] Atletas = new Atleta[6];
        Atletas[1] = P1;
        Atletas[2] = P2; 
        Atletas[3] = S1;
        Atletas[4] = S2;
        Atletas[5] = S3;
        Atletas[6] = A1; 
        Atletas[7] = A2;
        
        System.out.println("Listagem nº1 - Nome, FCM e FCT");
        for (int i = 0; i< Atletas.length; i++){
            if (Atletas[i].getClass() != Profissional.class){
                System.out.println("Nome: "+Atletas[i].getNome() + ", FCM: "+ Atletas[i].calcFCM()+" e FCT: "+ Atletas[i].calcFCT(0.6));
            }
        }
        System.out.println("Listagem nº2 - nome e valor a pagar");
        for (int i=0; i<Atletas.length; i++){
            System.out.println("Nome: "+ Atletas[i].getNome() + " e valor a pagar: "+Atletas[i].calcularPagamentoMensal());
        }
        
        System.out.println("Número de atletas profissionais: "+ Profissional.getTotalAtletas());
        System.out.println("Número de atletas amadores: "+ Amador.getTotalAtletas());
        
        System.out.println("Listagem nº3 - valores a pagar por cada tipo de atleta");
        for (int i = 0; i<Atletas.length; i++){
            if(Atletas[i].getClass() == Profissional.class){
                totalAPagarProfissionais += Atletas[i].calcularPagamentoMensal();
            } else if(Atletas[i].getClass() == Amador.class){
                totalAPagarAmadores+= Atletas[i].calcularPagamentoMensal();
            }else if (Atletas[i].getClass() == SemiProfissional.class){
                totalAPagarSemiProfissionais += Atletas[i].calcularPagamentoMensal();
            }
        }
        
        totalAPagar = totalAPagarAmadores + totalAPagarProfissionais + totalAPagarSemiProfissionais;
        System.out.println("Valor total a pagar a atletas do tipo profissional: "+totalAPagarProfissionais);
        System.out.println("Valor total a pagar a atletas do tipo amador: "+totalAPagarAmadores);
        System.out.println("Valor total a pagar a atletas do tipo semi-profissional: "+totalAPagarSemiProfissionais);
        System.out.println("Valor total a pagar: "+totalAPagar);
    }
    
    
}


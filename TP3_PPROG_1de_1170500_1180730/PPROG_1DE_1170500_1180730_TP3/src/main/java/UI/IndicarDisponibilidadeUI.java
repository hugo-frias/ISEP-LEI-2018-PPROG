/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vera Pinto
 */
public class IndicarDisponibilidadeUI {

    /**
     * Metodo "main" do UC9( Indicar disponibilidade diaria) que permite indicar disponibilidades diarias
     */
    public static void indicarDisponibilidadeUI() {
        Scanner ler = new Scanner(System.in);
        String data, hora, op;
        RegistoDisponibilidadeDiaria listaDisp = new RegistoDisponibilidadeDiaria();
        do {
            op = "não";
            boolean isDone = false;
            while (!isDone) {
                System.out.println("Introduza a data de inicio da sua disponibilidade? (AAAA/MM/DD)");
                data = ler.nextLine();
                Data dataIni = createData(data);
                if (dataIni == null) {
                    break;
                }
                boolean validacao = RegistoDisponibilidadeDiaria.validarDataComHoje(dataIni);
                if (validacao == true) {
                    System.out.println("Introduza a hora de inicio da sua disponibilidade? (HH:MM)");
                    hora = ler.nextLine();
                    Tempo horaIni = createHora(hora);
                    if (horaIni == null) {
                    break;
                }
                    System.out.println("Introduza a data de fim da sua disponibilidade? (AAAA/MM/DD)");
                    data = ler.nextLine();
                    Data dataFim = createData(data);
                    if (dataFim == null) {
                    break;
                }
                    boolean validacao1 = RegistoDisponibilidadeDiaria.validarDataComHoje(dataFim);
                    boolean validacao2 = RegistoDisponibilidadeDiaria.compararData(dataIni, dataFim);
                    if (validacao1 == true && validacao2 == true) {
                        System.out.println("Introduza a hora de fim da sua disponibilidade? (HH:MM)");
                        hora = ler.nextLine();
                        Tempo horaFim = createHora(hora);
                        if (horaFim == null) {
                    break;
                }
                        boolean validacao3;
                        validacao3 = RegistoDisponibilidadeDiaria.compararTempoDoMesmoDia(horaIni, horaFim, dataIni, dataFim);
                        if (validacao3 == true) {
                            DisponibilidadeDiaria disp = IndicarDisponibilidadeDiariaController.novaDisponibilidade(dataIni, horaIni, dataFim, horaFim);
                            listaDisp.add(disp);
                            isDone = true;
                        }
                    } else {
                        System.out.println("Data Inválida");
                    }

                } else {
                    System.out.println("Data Inválida");
                }
            }

            System.out.println("Deseja adicionar uma disponibilidade? (s ou n)");
            op = ler.nextLine();

        } while (op.equalsIgnoreCase("s"));
    }

    /**
     * Metodo para criar datas
     *
     * @param dataInput data que o utilizador inseriu
     * @return data criada atraves da classe Data
     */
    public static Data createData(String dataInput) {
        String[] dataSplit = dataInput.split("/");
        if (dataSplit.length == 3) {
            int ano = Integer.parseInt(dataSplit[0]);
            int mes = Integer.parseInt(dataSplit[1]);
            int dia = Integer.parseInt(dataSplit[2]);
            Data data = new Data(ano, mes, dia);
            return data;
        } else {
            return null;
        }
    }

    /**
     * Metodo para criar horas
     *
     * @param horaInput hora que o utilizador inseriu
     * @return hora criada atraves da classe Tempo
     */
    public static Tempo createHora(String horaInput) {
        String[] horaSplit = horaInput.split(":");
        if(horaSplit.length==2){
          int horas = Integer.parseInt(horaSplit[0]);
        int minutos = Integer.parseInt(horaSplit[1]);
        Tempo hora = new Tempo(horas, minutos);
        return hora;
        }else{
            return null;
        }
        
        
    }

}

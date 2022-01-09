/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Vera Pinto
 */
public class RegistoDisponibilidadeDiaria {

    /**
     * Lista das disponibilidades diarias do prestador de serviço
     */
    private List<DisponibilidadeDiaria> listaDisponibilidade;

    /**
     * Construtor
     */
    public RegistoDisponibilidadeDiaria() {
        listaDisponibilidade = new ArrayList<>();
    }

    /**
     * Metodo para adicionar uma disponibilidade diaria à lista de disponibilidades
     *
     * @param disp disponibilidade diaria a adicionar
     */
    public void add(DisponibilidadeDiaria disp) {
        listaDisponibilidade.add(disp);
    }

    /**
     * Metodo para validar a data
     *
     * @param data
     * @return validação da disponibilidade (true se estiver correta, false se não)
     */
    public static boolean validarDataComHoje(Data data) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        String a = dateFormat.format(cal.getTime());
        String[] dataSplit = a.split("/");
        int ano = Integer.parseInt(dataSplit[0]);
        int mes = Integer.parseInt(dataSplit[1]);
        int dia = Integer.parseInt(dataSplit[2]);
        Data dataHoje = new Data(ano,mes,dia);
        if (data.equals(dataHoje)) {
            return false;
        } else {
            if (data.isMaior(dataHoje)) {
                return true;
            } else {
                System.out.println("Data invalida");
                return false;
            }
        }
    }

    public static boolean compararData(Data data1, Data data2) {
        if (data1.equals(data2)) {
            return true;
        } else {
            if (data2.isMaior(data1)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean compararTempoDoMesmoDia(Tempo horaI, Tempo horaF, Data dataI, Data dataF) {
        if (dataI.equals(dataF)) {
            if (horaI.isMaior(horaF)) {
                System.out.println("Disponibilidade inválida");
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}

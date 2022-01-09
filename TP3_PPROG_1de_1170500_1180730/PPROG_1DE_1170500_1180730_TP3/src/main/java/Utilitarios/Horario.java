/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author momog
 */
public class Horario {

    /**
     * data do horario
     */
    private Data data;
    /**
     * hora do horario
     */
    private Tempo hora;

    /**
     * construtor completo
     *
     * @param data data do horario
     * @param hora hora do horario
     */
    public Horario(Data data, Tempo hora) {
        this.data = data;
        this.hora = hora;
    }

    /**
     * construtor vazio
     */
    public Horario() {
        this.data = new Data();
        this.hora = new Tempo();
    }

    /**
     *
     * @return a data
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * @return a hora hora
     */
    public Tempo getHora() {
        return hora;
    }

    /**
     * altera a data
     *
     * @param data data nova
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * altera a hora
     *
     * @param hora hora nova
     */
    public void setHora(Tempo hora) {
        this.hora = hora;
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "Horario{" + "data=" + data + ", hora=" + hora + '}';
    }

}

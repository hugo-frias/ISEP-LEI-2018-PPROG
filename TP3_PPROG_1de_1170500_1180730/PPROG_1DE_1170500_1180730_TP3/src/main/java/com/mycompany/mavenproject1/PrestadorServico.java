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
 * @author Vera Pinto
 */
public class PrestadorServico {

    /**
     * Numero mecanografico do prestador de serviço
     */
    private int nrMecanografico;
    /**
     * Nome completo do prestador de serviço
     */
    private String nomeCompleto;
    /**
     * Nome abreviado do prestador de serviço
     */
    private String nomeAbreviado;
    /**
     * Email do prestador de serviço
     */
    private String email;
    /**
     * Lista de disponibilidades do prestador de serviço
     */
    private RegistoDisponibilidadeDiaria listaDeDisponibilidades;
    /**
     * Lista de categorias do prestador de serviço
     */
    private List<Categoria> listaCategorias;
    /**
     * Lisyta de areas geograficas onde o prestador pode atuar
     */
    private List<AreaGeografica> listaAreaGeografica;

    /**
     * Construtor completo
     *
     * @param nrMecanografico numero mecanografico do prestador de serviço
     * @param nomeCompleto nome completo do prestador de serviço
     * @param nomeAbreviado nome abreviado do prestador de serviço
     * @param email email do prestador de serviço
     * @param listaDeDisponibilidades lista de disponibilidades do prestador de serviço
     * @param listaCategorias lista de categorias do prestador de serviço
     */
    public PrestadorServico(int nrMecanografico, String nomeCompleto, String nomeAbreviado, String email) {
        this.nrMecanografico = nrMecanografico;
        this.nomeCompleto = nomeCompleto;
        this.nomeAbreviado = nomeAbreviado;
        this.email = email;
        this.listaDeDisponibilidades = new RegistoDisponibilidadeDiaria();
        this.listaCategorias = new ArrayList();
        this.listaAreaGeografica = new ArrayList();
    }

    /**
     * Metodo para obter a lista de Areas Geograficas em que o prestador atua
     *
     * @return lista de areas geograficas
     */
    public List<AreaGeografica> getListaAreaGeografica() {
        return listaAreaGeografica;
    }

    /**
     * Metodo para obter a lista de disponibilidades do prestador de serviço
     *
     * @return lista de disponibilidades do prestador de serviço
     */
    public RegistoDisponibilidadeDiaria getListaDeDisponibilidades() {
        return listaDeDisponibilidades;
    }

    /**
     * Metodo para obter a lista de categorias do prestador de serviço
     *
     * @return lista de categorias do prestador de serviço
     */
    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    /**
     * Metodo para obter o numero mecanografico do prestador de serviço
     *
     * @return numero mecanografico do prestador de serviço
     */
    public int getNrMecanografico() {
        return nrMecanografico;
    }

    /**
     * Metodo para obter o nome completo do prestador
     *
     * @return nome completo do prestador
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Metodo para obter o nome abreviad do prestador de serviço
     *
     * @return nome abreviado do prestador de serviço
     */
    public String getNomeAbreviado() {
        return nomeAbreviado;
    }

    /**
     * Metodo para obter o email do prestador de serviço
     *
     * @return email do prestador de serviço
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para alterar o numero mecanografico do prestador de serviço
     *
     * @param nrMecanografico novo numero mecanografico do prestador de serviço
     */
    public void setNrMecanografico(int nrMecanografico) {
        this.nrMecanografico = nrMecanografico;
    }

    /**
     * Metodo para alterar o nome completo do prestador de serviço
     *
     * @param nomeCompleto novo nome completo do prestador de serviço
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * Metodo para alterar o nome abreviado do prestador de serviço
     *
     * @param nomeAbreviado novo nome abreviado do prestador de serviço
     */
    public void setNomeAbreviado(String nomeAbreviado) {
        this.nomeAbreviado = nomeAbreviado;
    }

    /**
     * Metodo para alterar o email do prestador de serviço
     *
     * @param email novo email do prestador de serviço
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Metodo para associar areas geograficas ao prestador de serviço
     * @param areaGeografica area geografica a associar
     */
    public void adicionarAreaGeografica(AreaGeografica areaGeografica) {
        listaAreaGeografica.add(areaGeografica);
    }

    /**
     * Metodo para associar categorias ao prestador de serviço
     *
     * @param cat categoria a associar
     */
    public void adicionarCategoria(Categoria cat) {
        listaCategorias.add(cat);
    }
    /**
     * Metodo para adicionar uma disponibilidade diaria a lista do prestador
     * @param disp disponibilidade 
     */
    public void adicionarDisponibilidadeDiaria(DisponibilidadeDiaria disp){
        listaDeDisponibilidades.add(disp);
    }

//    /**
//     * 
//     * @return 
//     */
//    @Override
//    public String toString() {
//        return "PrestadorServico{" + "nrMecanografico=" + nrMecanografico + ", nomeCompleto=" + nomeCompleto + ", nomeAbreviado=" + nomeAbreviado + ", email=" + email + 
//                ", listaDeDisponibilidades=" + listaDeDisponibilidades + ", listaCategorias=" + listaCategorias + '}';
//    }
//    
}

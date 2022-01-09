/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vera Pinto
 */
public class RegistoPrestadorServico {
    /**
     * Lista com todos os prestadores de serviço
     */
    private List<PrestadorServico> listaDePrestadoresServico;
    
    /**
     * Construtor para criar uma lista nova
     */
    public RegistoPrestadorServico(){
        listaDePrestadoresServico= new ArrayList<>();
    }
    /**
     * Metodo para obter a lista de prestadores
     * @return lista de prestadores
     */
    public List<PrestadorServico> getListaDePrestadoresServico() {
        return listaDePrestadoresServico;
    }
    /**
    * Metodo para alterar a lista de prestadores de servico
    * @param listaDePrestadoresServico lista de prestadores
    */
    public void setListaDePrestadoresServico(List<PrestadorServico> listaDePrestadoresServico) {
        this.listaDePrestadoresServico = listaDePrestadoresServico;
    }
    /**
     * Metodo para adicionar um prestador à lista
     * @param prestador prestador a adicionar
     */
    public void addPrestadorServico(PrestadorServico prestador){
        listaDePrestadoresServico.add(prestador);
    }
    
    /**
     * Metodo para obter o prestador atraves do email
     * @param email email do prestador a procurar
     * @return prestador
     */
    public PrestadorServico getPrestadorServicoByEmail(String email){
        for (PrestadorServico prestador : listaDePrestadoresServico){
            
            if(prestador.getEmail().equals(email)){
                return prestador;
            }
        }
        return null;
    } 
}

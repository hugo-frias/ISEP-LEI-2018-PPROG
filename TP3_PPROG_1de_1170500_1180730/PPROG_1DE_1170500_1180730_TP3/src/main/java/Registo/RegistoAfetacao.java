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
 * @author momog
 */
public class RegistoAfetacao {
     /**
     * lista de administrativos
     */
    private List<Afetacao> listaAfetacoes;
    /**
     * cria a lista de administrativos
     */
    public RegistoAfetacao(){
        listaAfetacoes = new ArrayList<>();
    }
    /**
     * adiciona um administrativo á lista
     * @param adm administrativo a adicionar
     */
    public void addAfetacao(Afetacao af){
        listaAfetacoes.add(af);
    }
    public List<Afetacao> getListaAfetacoes(){
        return listaAfetacoes;
    }

    
    
    /**
     * encontra um administrativo pelo email
     * @param email email do administrativo a encontrar
     * @return o administrativo
     */
    
}

    


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
public class RegistoAdministrativo {
    /**
     * lista de administrativos
     */
    private List<Administrativo> listaDeAdministrativos;
    /**
     * cria a lista de administrativos
     */
    public RegistoAdministrativo(){
        listaDeAdministrativos = new ArrayList<>();
    }
    /**
     * adiciona um administrativo á lista
     * @param adm administrativo a adicionar
     */
    public void addAdministrativo(Administrativo adm){
        listaDeAdministrativos.add(adm);
    }
    /**
     * encontra um administrativo pelo email
     * @param email email do administrativo a encontrar
     * @return o administrativo
     */
    public Administrativo getAdministrativoByEmail(String email){
        for (Administrativo adm : listaDeAdministrativos){
            if (adm.getEmail().equals(email)){
                return adm;
            }
        }
        return null;
    }
}

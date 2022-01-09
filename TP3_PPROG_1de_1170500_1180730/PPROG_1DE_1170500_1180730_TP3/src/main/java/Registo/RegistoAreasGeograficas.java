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
public class RegistoAreasGeograficas {
    /**
     * lista das áreas geograficas
     */
    private List<AreaGeografica> listaAreasGeograficas;
    /**
     * cria a lista das areas geograficas
     */
    public RegistoAreasGeograficas () {
        listaAreasGeograficas = new ArrayList<>();
    }
    /**
     * 
     * @return lista das areas geograficas
     */
    public List<AreaGeografica> getListaAreasGeograficas() {
        return listaAreasGeograficas;
    }
    /**
     * adiciona areas geograficas á lista
     * @param area area geografica a adicionar á lista
     */
    public void addAreaGeografica(AreaGeografica area){
        listaAreasGeograficas.add(area);
    }
    /**
     * encontra uma area geografica pelo codigo postal
     * @param codigoPostal codigo postal a procurar
     * @return uma area geografica
     */
    public AreaGeografica getAreaGeograficaByCodigoPostal(CodigoPostal codigoPostal) {
        AreaGeografica areaAux = null;
        for(AreaGeografica area : listaAreasGeograficas) {
            if(area.getCodigoPostal().getParcelaUm() == codigoPostal.getParcelaUm()&& area.getCodigoPostal().getParcelaDois() == codigoPostal.getParcelaDois()) {
                areaAux = new AreaGeografica(area);
            }
        }
        return areaAux;
    }
}

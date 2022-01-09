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
public class RegistoCategorias {  
    /**
     * lista das categorias
     */
    private List<Categoria> listaDeCategorias;
    /**
     * Construtor que cria a lista
     */
    public RegistoCategorias(){
        listaDeCategorias = new ArrayList<>();
    }
    /**
     * adiciona uma categoria á lista
     * @param categoria categoria a adicionar
     */
    public void addCategoria(Categoria categoria){
        listaDeCategorias.add(categoria);
    }
    /**
     * 
     * @return a lista das categorias
     */
    public List<Categoria> getCategorias() {
        return new ArrayList(listaDeCategorias);
    }
    /**
     * 
     * @param index index da categoria
     * @return os serviços englobados numa certa categoria
     */
    public List<Servicos> getServicosDeCategoria(int index) {        
        if (listaDeCategorias.get(index) != null) {
            return listaDeCategorias.get(index).getListaDeServicos();
        }
        return null;
    }
    /**
     * 
     * @param id id da categoria
     * @return a categoria com o determinado id
     */
    public Categoria getCategoriaByID(int id){
        for (Categoria cat : listaDeCategorias){
            if(cat.getCodigo()==id){
                return cat;
            }
        }
        return null;
    }
    public Categoria getCategoriaByServico (Servicos serv) {
        for(Categoria cat : listaDeCategorias) {
            if(cat != null && cat.getListaDeServicos().contains(serv)) {
                return cat;
            }
        }
        return null;
    }
    
}

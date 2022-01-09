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
public class Categoria {
    /**
     * código da categoria
     */
    private int codigo;
    /**
     * descrição da categoria
     */
    private String descricao;
    /**
     * lista de serviços praticados por esta categoria
     */
    private List<Servicos> listaDeServicos;
    /**
     * construtor completo
     * @param codigo codigo da categoria
     * @param descricao descrição da categoria
     */
    public Categoria(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        listaDeServicos = new ArrayList<>();
    }
    /**
     * 
     * @return o codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * altera o codigo
     * @param codigo codigo novo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * 
     * @return a descrição 
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * altera a descrição
     * @param descricao descrição nova
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * 
     * @return a lista de serviços da categoria
     */
    public List<Servicos> getListaDeServicos() {
        return listaDeServicos;
    }
    /**
     * altera a lista de serviços
     * @param listaDeServicos lista de serviços nova
     */
    public void setListaDeServicos(List<Servicos> listaDeServicos) {
        this.listaDeServicos = listaDeServicos;
    }
    /**
     * adiciona um serviço á lista
     * @param servico serviço a adicionar
     */
    public void addServico(Servicos servico) {
        listaDeServicos.add(servico);
    }
    /**
     * retorna um serviço com base no seu index
     * @param i index do serviço
     * @return o serviço
     */
    public Servicos getServicoByIndex(int i) {
        return listaDeServicos.get(i);
    }

    @Override
    /**
     * imprime os dados da classe para a consola
     */
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + ", descricao=" + descricao + ", listaDeServicos=" + listaDeServicos + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Vera Pinto
 */
public class ClubeDesportivo {
    /**
     * Nome do Clube Desportivo
     */
    private String nome;
    /**
     * Data de fundação do clube desportivo
     */
    private Data dataDeFundacao;
    /**
     * Array List com os atletas pertencentes ao clube
     */
    private List<Atleta> atletas = new ArrayList<>();
    
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final Data DATA_POR_OMISSAO= new Data (0,1,1);
    
    /**
     * Construtor Completo
     * @param nome Nome do Clube Desportivo
     * @param dataDeFundacao Data de fundação do clube desportivo     
     */
    public ClubeDesportivo(String nome, Data dataDeFundacao) {
        this.nome = nome;
        this.dataDeFundacao = dataDeFundacao;
        
    }
    /**
     * construtor vazio
     */
    public ClubeDesportivo() {
        this.nome = NOME_POR_OMISSAO;
        this.dataDeFundacao= DATA_POR_OMISSAO;
        
    }
    /**
     * Método para obter o nome do clube
     * @return o nome do clube
     */
    public String getNome() {
        return nome;
    }
    /**
     * método para obter a data de fundação
     * @return data de fundação
     */
    public Data getDataDeFundacao() {
        return dataDeFundacao;
    }
    /**
     * método para obter o contentor dos atletas
     * @return o contetor dos atletas
     */
    public List<Atleta> getAtletas() {
        return atletas;
    }
    /**
     * método para alterar o nome do clube
     * @param nome nome do clube "novo"
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * método para alterar a data de fundação
     * @param dataDeFundacao data de fundação "nova"
     */
    public void setDataDeFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }
    /**
     * método para alterar o contentor de atletas
     * @param atletas contentor de atletas "novo"
     */
    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }
    /**
     * método para adicionar um atleta ao contentor
     * @param A2 atleta a adicionar
     */
    public void addAtleta(Atleta A2) {
        if (A2.getClass() == Profissional.class) {
            Profissional A3 = (Profissional) A3;
            atletas.add(A3);
        } else if (A2.getClass() == SemiProfissional.class) {
            SemiProfissional A3 = (SemiProfissional)A2;
            atletas.add(A3);
        } else if (A2.getClass() == Amador.class) {
            Amador A3 = (Amador) A2;
            atletas.add(A3);
        }
    }
    /**
     * método para ordenar os atletas alfabeticamente por categoria, modalidade e nome
     */
     public void ordenarCompleto() {

        Comparator<Atleta> criterio2 = new Comparator<Atleta>() {

            @Override
            public int compare(Atleta A1, Atleta A2) {

                if (A1.getClass() != A2.getClass()) {
                    return determinarCategoria(A1).compareToIgnoreCase(determinarCategoria(A2));

                } else if (A1.getAtividade() != A2.getAtividade()) {
                    return A1.getAtividade().compareToIgnoreCase(A2.getAtividade());

                }
                return A1.getNome().compareToIgnoreCase(A2.getNome());

            }

        };
        Collections.sort(atletas, criterio2);
    }
    /**
     * método para determinar a classe dos atletas
     * @param A1 atleta
     * @return a classe do atleta
     */
    public String determinarCategoria(Atleta A1) {
        if (A1.getClass() == Profissional.class) {
            return "Profissional";
        } else if (A1.getClass() == Amador.class) {
            return "Amador";
        }
        return "Semi-Professional";
    }
    /**
     * método para ordenar os atletas alfabéticamente
     */
    public void ordenarAlfabeticamente() {
        if (atletas.size() > 0) {
     Collections.sort(atletas, new Comparator<Atleta>() {
      @Override
      public int compare(final Atleta atleta1, final Atleta atleta2) {
          return atleta1.getNome().compareTo(atleta2.getNome());
      }
  });
        }
    }
    
    /**
     * método para ordenar os atletas de modo inverso pelo seu valor de premios
     */
    public void ordenarIPremios() {
        Comparator<Atleta> criterio1 = new Comparator<Atleta>() {

            @Override
            public int compare(Atleta A1, Atleta A2) {
                double PA1 = A1.getValorMensal();
                double PA2 = A2.getValorMensal();

                if (PA1 > PA2) {
                    return -1;
                } else if (PA1 < PA2) {
                    return 1;
                } else {
                    return 0;
                }
            } 
        };

        Collections.sort(atletas, criterio1);
    }
    /**
     * método para calcular o valor de IRS total
     * @return o valor total do IRS
     */
    public double calcularIRSTotal() {
        double totalIRS = 0;
        for(Atleta a : atletas) {
           if(a.getClass() == Profissional.class) {
               Profissional b = (Profissional) a;
               totalIRS += b.ValorDoIRS();
           } if(a.getClass() == SemiProfissional.class) {
               SemiProfissional b = (SemiProfissional) a;
               totalIRS += b.ValorDoIRS();
           }
            
        }
        return totalIRS;
    }
    /**
     * método para listar os atletas
     */
    public void listarAtletas() {
        for (Atleta a : atletas) {
            System.out.println(a);
        }
    }

}


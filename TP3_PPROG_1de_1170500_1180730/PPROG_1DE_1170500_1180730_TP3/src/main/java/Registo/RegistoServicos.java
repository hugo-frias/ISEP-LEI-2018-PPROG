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
public class RegistoServicos {
    private List<Servicos> listaDeServicos;

    
    public RegistoServicos() {
        listaDeServicos = new ArrayList<>();
    }
    
    public void addServico(Servicos ser){
        listaDeServicos.add(ser);
    }
    
    public Servicos getServicosById(int idServ) {
        
        Servicos servAux = null;
        for(Servicos s : listaDeServicos) {
            if (s.getClass() == ServicoFixo.class) {
                ServicoFixo s1 = (ServicoFixo) s;
                if(s1.getId() == idServ) {
                    servAux = s;
                    return servAux;
                }
            }
            if (s.getClass() == ServicoLimitado.class) {
                ServicoLimitado s1 = (ServicoLimitado) s;
                if(s1.getId() == idServ) {
                    servAux = s;
                    return servAux;
                }
            }
            if (s.getClass() == ServicoExpansivel.class) {
                ServicoExpansivel s1 = (ServicoExpansivel) s;
                if(s1.getId() == idServ) {
                    servAux = s;
                    return servAux;
                }
            }
        }
        return servAux;    
}
    
}

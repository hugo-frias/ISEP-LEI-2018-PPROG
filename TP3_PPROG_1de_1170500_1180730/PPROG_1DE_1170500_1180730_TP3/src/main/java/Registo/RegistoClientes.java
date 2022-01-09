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
public class RegistoClientes {
    private List<Cliente> listaDeClientes;
    
    public RegistoClientes(){
        listaDeClientes = new ArrayList<>();
    }
    public void addCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }
    public Cliente getClienteByEmail(String email){
        for (Cliente cliente : listaDeClientes){
            if (cliente.getEmail().equals(email)){
                return cliente;
            }
        }
        return null;
    }
}

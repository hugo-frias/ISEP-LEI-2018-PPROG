/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Vera Pinto
 */
public class RegistoPrestadorServicoTest {
    
    public RegistoPrestadorServicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaDePrestadoresServico method, of class RegistoPrestadorServico.
     */
    @Ignore
    public void testGetListaDePrestadoresServico() {
        System.out.println("getListaDePrestadoresServico");
        RegistoPrestadorServico instance = new RegistoPrestadorServico();
        List<PrestadorServico> expResult = null;
        List<PrestadorServico> result = instance.getListaDePrestadoresServico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDePrestadoresServico method, of class RegistoPrestadorServico.
     */
    @Ignore
    public void testSetListaDePrestadoresServico() {
        System.out.println("setListaDePrestadoresServico");
        List<PrestadorServico> listaDePrestadoresServico = null;
        RegistoPrestadorServico instance = new RegistoPrestadorServico();
        instance.setListaDePrestadoresServico(listaDePrestadoresServico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPrestadorServico method, of class RegistoPrestadorServico.
     */
    @Ignore
    public void testAddPrestadorServico() {
        System.out.println("addPrestadorServico");
        PrestadorServico prestador = null;
        RegistoPrestadorServico instance = new RegistoPrestadorServico();
        instance.addPrestadorServico(prestador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestadorServicoByEmail method, of class RegistoPrestadorServico.
     */
    @Ignore
    public void testGetPrestadorServicoByEmail() {
        System.out.println("getPrestadorServicoByEmail");
        String email = "";
        RegistoPrestadorServico instance = new RegistoPrestadorServico();
        PrestadorServico expResult = null;
        PrestadorServico result = instance.getPrestadorServicoByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Hugo
 */
public class ProfissionalTest {
    
    public ProfissionalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Profissional P = new Profissional("José Augusto",12345,"masculino",19,"Corrida",2000,20);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getParcelaFixa method, of class Profissional.
     */
    @Ignore
    public void testGetParcelaFixa() {
        System.out.println("getParcelaFixa");
        Profissional instance = new Profissional();
        double expResult = 0.0;
        double result = instance.getParcelaFixa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParcelaFixa method, of class Profissional.
     */
    @Ignore
    public void testSetParcelaFixa() {
        System.out.println("setParcelaFixa");
        double novaParcelaFixa = 0.0;
        Profissional instance = new Profissional();
        instance.setParcelaFixa(novaParcelaFixa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelaVariavel method, of class Profissional.
     */
    @Ignore
    public void testGetParcelaVariavel() {
        System.out.println("getParcelaVariavel");
        double expResult = 0.0;
        double result = Profissional.getParcelaVariavel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParcelaVariavel method, of class Profissional.
     */
    @Ignore
    public void testSetParcelaVariavel() {
        System.out.println("setParcelaVariavel");
        double parcelaVariavel = 0.0;
        Profissional.setParcelaVariavel(parcelaVariavel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPagamentoMensal method, of class Profissional.
     */
    @Test
    public void testCalcularPagamentoMensal() {
        System.out.println("calcularPagamentoMensal");
        Profissional P1 = new Profissional("José Augusto",12345,"masculino",19,"Corrida",2000,20);
        double expResult = 404;
        double result = P1.calcularPagamentoMensal();
        assertEquals(expResult, result, 0.0);
    }
    
}
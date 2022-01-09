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
 * @author Vera Pinto
 */
public class AmadorTest {
    
    public AmadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
           Amador A1 = new Amador ("Andre Joaquim",99999999,"M",1,"Natação",1500,8);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPercentagemIgual method, of class Amador.
     */
    @Ignore
    public void testGetPercentagemIgual() {
        System.out.println("getPercentagemIgual");
        double expResult = 0.0;
        double result = Amador.getPercentagemIgual();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagamentoMinimo method, of class Amador.
     */
    @Ignore
    public void testGetPagamentoMinimo() {
        System.out.println("getPagamentoMinimo");
        double expResult = 0.0;
        double result = Amador.getPagamentoMinimo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalAmador method, of class Amador.
     */
    @Ignore
    public void testGetTotalAmador() {
        System.out.println("getTotalAmador");
        int expResult = 0;
        int result = Amador.getTotalAmador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPercentagemIgual method, of class Amador.
     */
    @Ignore
    public void testSetPercentagemIgual() {
        System.out.println("setPercentagemIgual");
        double percentagemIgual = 0.0;
        Amador.setPercentagemIgual(percentagemIgual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagamentoMinimo method, of class Amador.
     */
    @Ignore
    public void testSetPagamentoMinimo() {
        System.out.println("setPagamentoMinimo");
        double pagamentoMinimo = 0.0;
        Amador.setPagamentoMinimo(pagamentoMinimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Amador.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Amador instance = new Amador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPagamentoMensal method, of class Amador.
     */
    @Test
    public void testCalcularPagamentoMensal(Amador A1) {
        System.out.println("Pagamento de Atleta Amador:");
        
        double expResult = 135;
        double result = A1.calcularPagamentoMensal();
        assertEquals(expResult, result, 0.0);
    }
    
}

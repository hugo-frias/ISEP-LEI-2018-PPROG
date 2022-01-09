/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

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
public class RegistoDisponibilidadeDiariaTest {
    
    public RegistoDisponibilidadeDiariaTest() {
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
     * Test of add method, of class RegistoDisponibilidadeDiaria.
     */
    @Ignore 
    public void testAdd() {
        System.out.println("add");
        DisponibilidadeDiaria disp = null;
        RegistoDisponibilidadeDiaria instance = new RegistoDisponibilidadeDiaria();
        instance.add(disp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarDataComHoje method, of class RegistoDisponibilidadeDiaria.
     */
    @Test
    public void testValidarDataComHoje() {
        System.out.println("validarDataComHoje");
        Data data = new Data(2019,05,30);
        boolean expResult = false;
        boolean result = RegistoDisponibilidadeDiaria.validarDataComHoje(data);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of compararData method, of class RegistoDisponibilidadeDiaria.
     */
    @Test
    public void testCompararData() {
        System.out.println("compararData");
        Data data1 = new Data(2019,11,22);
        Data data2 = new Data(2019,11,22);
        boolean expResult = true;
        boolean result = RegistoDisponibilidadeDiaria.compararData(data1, data2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of compararTempoDoMesmoDia method, of class RegistoDisponibilidadeDiaria.
     */
    @Ignore
    public void testCompararTempoDoMesmoDia() {
        System.out.println("compararTempoDoMesmoDia");
        Tempo horaI = new Tempo(11,20);
        Tempo horaF = new Tempo(11,34);
        Data dataI = new Data(2019,11,22);
        Data dataF = new Data(2019,11,22);
        boolean expResult = false;
        boolean result = RegistoDisponibilidadeDiaria.compararTempoDoMesmoDia(horaI, horaF, dataI, dataF);
        assertEquals(expResult, result);
        
    }
    
}

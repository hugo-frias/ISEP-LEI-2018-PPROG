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

/**
 *
 * @author Vera Pinto
 */
public class IndicarDisponibilidadeDiariaControllerTest {
    
    public IndicarDisponibilidadeDiariaControllerTest() {
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
     * Test of novaDisponibilidade method, of class IndicarDisponibilidadeDiariaController.
     */
    @Test
    public void testNovaDisponibilidade() {
        System.out.println("novaDisponibilidade");
        Data dataI = new Data(2019,11,22);
        Tempo horaI = new Tempo (11,22);
        Data dataF = new Data(2019,11,23);
        Tempo horaF = new Tempo(11,22);
         Data dataI2 = new Data(2019,11,22);
        Tempo horaI2 = new Tempo (11,22);
        Data dataF2 = new Data(2019,11,23);
        Tempo horaF2 = new Tempo(11,22);
        
        DisponibilidadeDiaria expResult = new DisponibilidadeDiaria(dataI2, horaI2, dataF2, horaF2);
        DisponibilidadeDiaria result = IndicarDisponibilidadeDiariaController.novaDisponibilidade(dataI, horaI, dataF, horaF);
        assertEquals(expResult, result);
    }
    
}

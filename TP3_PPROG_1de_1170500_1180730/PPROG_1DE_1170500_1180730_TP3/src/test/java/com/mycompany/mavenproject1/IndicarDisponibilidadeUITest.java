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
public class IndicarDisponibilidadeUITest {
    
    public IndicarDisponibilidadeUITest() {
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
     * Test of IndicarDisponibilidadeUI method, of class IndicarDisponibilidadeUI.
     */
    @Ignore
    public void testIndicarDisponibilidadeUI() {
        System.out.println("IndicarDisponibilidadeUI");
        IndicarDisponibilidadeUI.indicarDisponibilidadeUI();
       
    }

    /**
     * Test of createData method, of class IndicarDisponibilidadeUI.
     */
    @Test
    public void testCreateData() {
        System.out.println("createData");
        String dataInput = "2019/11/22";
        Data expResult = new Data(2019,11,22);
        Data result = IndicarDisponibilidadeUI.createData(dataInput);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createHora method, of class IndicarDisponibilidadeUI.
     */
    @Test
    public void testCreateHora() {
        System.out.println("createHora");
        String horaInput = "11:55";
        Tempo expResult = new Tempo(11,55);
        Tempo result = IndicarDisponibilidadeUI.createHora(horaInput);
        assertEquals(expResult, result);
        
    }
    
}

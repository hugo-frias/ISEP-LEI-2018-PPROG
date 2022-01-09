/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhopratico2;

import java.util.ArrayList;
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
public class ClubeDesportivoTest {
    private ClubeDesportivo CD1;
    private Amador A1;
    private Profissional P1;
    
    public ClubeDesportivoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Data d1= new Data (1893, 9, 28);
         ClubeDesportivo CD1 = new ClubeDesportivo("Porto",d1);
        Amador A1 = new Amador("Joana", 99999999, "F", 1, "Natação", 1500, 8);
        Profissional P1 = new Profissional("JonasPistolas", 99999999, "F", 1, "Natação", 1500, 99);
        CD1.addAtleta(A1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class ClubeDesportivo.
     */
    @Test
    public void testGetNome() {
         System.out.println("getNome");
        String expResult = "Porto";
        String result = CD1.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataDeFundacao method, of class ClubeDesportivo.
     */
    @Test
    public void testGetDataDeFundacao() {
        System.out.println("getDataDeFundacao");
        ClubeDesportivo instance = new ClubeDesportivo();
        Data expResult = null;
        Data result = instance.getDataDeFundacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtletas method, of class ClubeDesportivo.
     */
    @Test
    public void testGetAtletas() {
        System.out.println("getAtletas");
        ClubeDesportivo instance = new ClubeDesportivo();
        List<Atleta> expResult = null;
        List<Atleta> result = instance.getAtletas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDeFundacao method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetDataDeFundacao() {
        System.out.println("setDataDeFundacao");
        Data dataDeFundacao = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setDataDeFundacao(dataDeFundacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtletas method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetAtletas() {
        System.out.println("setAtletas");
        ArrayList<Atleta> atletas = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setAtletas(atletas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAtleta method, of class ClubeDesportivo.
     */
    @Test
    public void testAddAtleta() {
         System.out.println("addAtleta");
        CD1.listarAtletas();
        CD1.addAtleta(P1);
        CD1.listarAtletas();
    }

    /**
     * Test of ordenarCompleto method, of class ClubeDesportivo.
     */
    @Ignore
    public void testOrdenarCompleto() {
        System.out.println("ordenarCompleto");
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.ordenarCompleto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinarCategoria method, of class ClubeDesportivo.
     */
    @Ignore
    public void testDeterminarCategoria() {
        System.out.println("determinarCategoria");
        Atleta A1 = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        String expResult = "";
        String result = instance.determinarCategoria(A1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarAlfabeticamente method, of class ClubeDesportivo.
     */
    @Test
    public void testOrdenarAlfabeticamente() {
        System.out.println("ordenarAlfabeticamente");
        CD1.ordenarAlfabeticamente();
    }

    /**
     * Test of ordenarIPremios method, of class ClubeDesportivo.
     */
    @Ignore
    public void testOrdenarIPremios() {
        System.out.println("ordenarIPremios");
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.ordenarIPremios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTotalIRS method, of class ClubeDesportivo.
     */
    @Ignore
    public void testcalcularIRSTotal() {
        System.out.println("calculateTotalIRS");
        ClubeDesportivo instance = new ClubeDesportivo();
        double expResult = 0.0;
        double result = instance.calcularIRSTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarAtletas method, of class ClubeDesportivo.
     */
    @Ignore
    public void testListarAtletas() {
        System.out.println("listarAtletas");
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.listarAtletas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

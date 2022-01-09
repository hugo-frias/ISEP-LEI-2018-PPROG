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
public class PrestadorServicoTest {
    
    public PrestadorServicoTest() {
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
     * Test of getListaDeDisponibilidades method, of class PrestadorServico.
     */
    @Ignore
    public void testGetListaDeDisponibilidades() {
        System.out.println("getListaDeDisponibilidades");
        PrestadorServico instance = null;
        RegistoDisponibilidadeDiaria expResult = null;
        RegistoDisponibilidadeDiaria result = instance.getListaDeDisponibilidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCategorias method, of class PrestadorServico.
     */
    @Ignore
    public void testGetListaCategorias() {
        System.out.println("getListaCategorias");
        PrestadorServico instance = null;
        List<Categoria> expResult = null;
        List<Categoria> result = instance.getListaCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNrMecanografico method, of class PrestadorServico.
     */
    @Ignore
    public void testGetNrMecanografico() {
        System.out.println("getNrMecanografico");
        PrestadorServico instance = null;
        int expResult = 0;
        int result = instance.getNrMecanografico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeCompleto method, of class PrestadorServico.
     */
    @Ignore
    public void testGetNomeCompleto() {
        System.out.println("getNomeCompleto");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.getNomeCompleto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeAbreviado method, of class PrestadorServico.
     */
    @Ignore
    public void testGetNomeAbreviado() {
        System.out.println("getNomeAbreviado");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.getNomeAbreviado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class PrestadorServico.
     */
    @Ignore
    public void testGetEmail() {
        System.out.println("getEmail");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNrMecanografico method, of class PrestadorServico.
     */
    @Ignore
    public void testSetNrMecanografico() {
        System.out.println("setNrMecanografico");
        int nrMecanografico = 0;
        PrestadorServico instance = null;
        instance.setNrMecanografico(nrMecanografico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeCompleto method, of class PrestadorServico.
     */
    @Ignore
    public void testSetNomeCompleto() {
        System.out.println("setNomeCompleto");
        String nomeCompleto = "";
        PrestadorServico instance = null;
        instance.setNomeCompleto(nomeCompleto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeAbreviado method, of class PrestadorServico.
     */
    @Ignore
    public void testSetNomeAbreviado() {
        System.out.println("setNomeAbreviado");
        String nomeAbreviado = "";
        PrestadorServico instance = null;
        instance.setNomeAbreviado(nomeAbreviado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class PrestadorServico.
     */
    @Ignore
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        PrestadorServico instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarCategoria method, of class PrestadorServico.
     */
    @Ignore
    public void testAdicionarCategoria() {
        System.out.println("adicionarCategoria");
        Categoria cat = null;
        PrestadorServico instance = null;
        instance.adicionarCategoria(cat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaAreaGeografica method, of class PrestadorServico.
     */
    @Ignore
    public void testGetListaAreaGeografica() {
        System.out.println("getListaAreaGeografica");
        PrestadorServico instance = null;
        List<AreaGeografica> expResult = null;
        List<AreaGeografica> result = instance.getListaAreaGeografica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarAreaGeografica method, of class PrestadorServico.
     */
    @Ignore
    public void testAdicionarAreaGeografica() {
        System.out.println("adicionarAreaGeografica");
        CodigoPostal a = new CodigoPostal("4580-596");
        AreaGeografica areaGeografica = new AreaGeografica("Porto", 12, a);
        PrestadorServico instance = null;
        instance.adicionarAreaGeografica(areaGeografica);
        RegistoAreasGeograficas listaAreaGeografica= new RegistoAreasGeograficas();
        
        System.out.println();
    }

    /**
     * Test of adicionarDisponibilidadeDiaria method, of class PrestadorServico.
     */
    @Ignore
    public void testAdicionarDisponibilidadeDiaria() {
        System.out.println("adicionarDisponibilidadeDiaria");
        DisponibilidadeDiaria disp = null;
        PrestadorServico instance = null;
        instance.adicionarDisponibilidadeDiaria(disp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.derniertpmedev;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author victo
 */
public class JeuTest {
    
    public JeuTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of initialisation method, of class Jeu.
     */
    @Test
    public void testInitialisation() {
        System.out.println("initialisation");
        Jeu instance = new Jeu();
        instance.initialisation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jouerTour method, of class Jeu.
     */
    @Test
    public void testJouerTour() {
        System.out.println("jouerTour");
        Jeu instance = new Jeu();
        instance.jouerTour();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of detectionFinPartie method, of class Jeu.
     */
    @Test
    public void testDetectionFinPartie() {
        System.out.println("detectionFinPartie");
        int couleur = 0;
        Jeu instance = new Jeu();
        boolean expResult = false;
        boolean result = instance.detectionFinPartie(couleur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finPartie method, of class Jeu.
     */
    @Test
    public void testFinPartie() {
        System.out.println("finPartie");
        Jeu instance = new Jeu();
        instance.finPartie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of partie method, of class Jeu.
     */
    @Test
    public void testPartie() {
        System.out.println("partie");
        Jeu instance = new Jeu();
        instance.partie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

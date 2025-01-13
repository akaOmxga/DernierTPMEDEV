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
public class PlateauTest {
    
    public PlateauTest() {
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
     * Test of initialiser method, of class Plateau.
     */
    @Test
    public void testInitialiser() {
        System.out.println("initialiser");
        Plateau instance = new Plateau();
        instance.initialiser();
        
        int[][] expected = new int[8][8];
        // expected cases blanches
        expected[4][4] = 1;
        expected[5][5] = 1;
        
        // expected cases noires
        expected[4][5] = 2;
        expected[5][4] = 2;
        assertEquals(expected,instance.getCases());
    }

    /**
     * Test of estPlein method, of class Plateau.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        // plateau non plein 
        Plateau instance = new Plateau();
        instance.initialiser();
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        
        // plateau plein 
        Plateau instancePleine = new Plateau();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // remplir la case
                instancePleine.setCases(i,j,1);
            }
        }
        boolean expResultPlein = true;
        boolean resultPlein = instancePleine.estPlein();
        assertEquals(expResultPlein, resultPlein);

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.derniertpmedev;

import java.util.Arrays;
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
        int[][] expected = new int[8][8];
        // expected cases blanches
        expected[4][4] = 1;
        expected[5][5] = 1;
        
        // expected cases noires
        expected[4][5] = 2;
        expected[5][4] = 2;
        // 
        assertTrue(Arrays.deepEquals(expected, instance.plateauDeJeu.getCases()),"testInitialisation error");
    }
}

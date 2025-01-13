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
public class JetonTest {
    
    public JetonTest() {
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
     * Test of switchColor method, of class Jeton.
     */
    @Test
    public void testSwitchColor() {
        System.out.println("switchColor");
        
        Jeton instanceBlanche = new Jeton(0,0,1);
        Jeton instanceNoire = new Jeton(0,0,1);
        instanceBlanche.switchColor();
        instanceNoire.switchColor();
        // test blanc switché
        assertEquals(2,instanceBlanche.getCouleur());
        // test noir switché
        assertEquals(1,instanceNoire.getCouleur());
    }
    
}

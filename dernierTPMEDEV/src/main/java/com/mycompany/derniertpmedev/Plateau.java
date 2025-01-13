/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

/**
 *
 * @author barbo et simon
 */
public class Plateau {
    
    private int[][] cases = new int[8][8]; 
    
    public void initialiser(){
        // initialisation des cases blanches
        this.cases[4][4] = 1;
        this.cases[5][5] = 1;
        
        // initialisation des cases noires
        this.cases[4][5] = 1;
        this.cases[5][4] = 1;
    }
    
    public void afficher() {
        for (int i = 0; i < 8; i++) { // Parcours des lignes
            for (int j = 0; j < 8; j++) { // Parcours des colonnes
                if (cases[i][j] == 1) {
                    System.out.print("B "); // Case blanche
                } else if (cases[i][j] == 2) {
                    System.out.print("N "); // Case noire
                } else {
                    System.out.print("_ "); // Case vide
                }
            }
            System.out.println(); // Retour à la ligne après chaque ligne
        }
    }
    
    public boolean estPlein() {
        for (int i = 0; i < 8; i++) { // Parcours des lignes
            for (int j = 0; j < 8; j++) { // Parcours des colonnes
                if (cases[i][j] == 0) {
                    return false; // Si une case est vide, le plateau n'est pas plein
                }
            }
        }
        return true; // Toutes les cases sont remplies
    }
}

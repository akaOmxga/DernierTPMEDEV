/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

/**
 * Représente un plateau de jeu de type 8x8 pour le jeu reverso.
 * Le plateau est composé de cases qui peuvent être blanches, noires ou vides.
 * 
 * @author barbo et simon
 */
public class Plateau {
    
    // Matrice représentant les cases du plateau, où chaque case est un entier.
    // 0 : case vide, 1 : case blanche, 2 : case noire
    private int[][] cases = new int[8][8]; 
    
    /**
     * Initialise le plateau avec les positions de départ pour un jeu (par exemple, Reversi).
     * Les cases blanches et noires sont placées au centre du plateau.
     */
    public void initialiser(){
        // Initialisation des cases blanches
        this.cases[4][4] = 1;  // La case (4,4) devient blanche
        this.cases[5][5] = 1;  // La case (5,5) devient blanche
        
        // Initialisation des cases noires
        this.cases[4][5] = 2;  // La case (4,5) devient noire
        this.cases[5][4] = 2;  // La case (5,4) devient noire
    }
    
    /**
     * Affiche l'état actuel du plateau sur la console.
     * Les cases sont affichées sous forme de symboles :
     * - 'B' pour une case blanche,
     * - 'N' pour une case noire,
     * - '_' pour une case vide.
     */
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
    
    /**
     * Vérifie si le plateau est plein.
     * Un plateau est considéré plein si aucune case n'est vide.
     * 
     * @return true si toutes les cases sont remplies, false sinon
     */
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

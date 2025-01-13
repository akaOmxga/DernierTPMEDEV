/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

import java.util.Scanner;

/**
 *
 * @author barbo et simon
 */
public class Joueur {
    
    private int couleur;
    private Scanner scanner;
    
    Joueur(int couleur){
        this.couleur = couleur;
        this.scanner = new Scanner(System.in);
    }
    
    public int getCouleur(){
        return this.couleur;
    }

     public int[] jouer() {
        String input;
        int ligne = -1;
        int colonne = -1;

        while (true) {
            System.out.print("Entrez une coordonnée (exemple : 4B, entre 1-8 et A-H) : ");
            input = scanner.nextLine().toUpperCase().trim();

            // Validation du format
            if (input.matches("[1-8][A-H]")) {
                // Extraire la ligne (premier caractère, converti en entier)
                ligne = Character.getNumericValue(input.charAt(0));
                // Extraire la colonne (second caractère, converti en indice 0-7)
                colonne = input.charAt(1) - 'A';
                break; 
            } else {
                System.out.println("Coordonnée invalide. Veuillez entrer une coordonnée correcte.");
            }
        }
        return new int[]{ligne, colonne};
    }

        
}

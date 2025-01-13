/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

import java.util.Scanner;

/**
 * Représente un joueur dans un jeu. Chaque joueur a une couleur associée,
 * qui peut être utilisée pour déterminer ses pièces sur le plateau.
 * 
 * @author barbo et simon
 */
public class Joueur {
    
    // Variable représentant la couleur du joueur.
    // 1 : couleur blanche, 2 : couleur noire
    private int couleur;
    private Scanner scanner;
    
    /**
     * Constructeur qui initialise la couleur du joueur.
     * 
     * @param couleur La couleur du joueur (1 pour blanc, 2 pour noir)
     */
    Joueur(int couleur){
        this.couleur = couleur;
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Retourne la couleur du joueur.
     * 
     * @return La couleur du joueur (1 pour blanc, 2 pour noir)
     */
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


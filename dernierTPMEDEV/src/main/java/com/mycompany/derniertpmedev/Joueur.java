/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

import java.util.Scanner;

/**
 * Représente un joueur dans un jeu. Chaque joueur a une couleur associée,
 * qui peut être utilisée pour déterminer ses pièces sur le plateau.
 * La classe gère également l'interaction avec le joueur pour la saisie des coups.
 * 
 * @author barbo et simon
 */
public class Joueur {
    
    /**
     * La couleur du joueur.
     * 1 représente la couleur blanche
     * 2 représente la couleur noire
     */
    private int couleur;
    
    /**
     * Scanner utilisé pour lire les entrées du joueur depuis la console.
     * Permet la saisie des coordonnées lors des coups.
     */
    private Scanner scanner;
    
    /**
     * Constructeur qui initialise la couleur du joueur et le scanner pour la saisie.
     * 
     * @param couleur La couleur du joueur (1 pour blanc, 2 pour noir)
     * @throws IllegalArgumentException si la couleur n'est ni 1 ni 2
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

    /**
     * Permet au joueur de jouer un coup en saisissant des coordonnées.
     * Le joueur doit entrer une coordonnée au format "chiffre-lettre" (exemple : 4B).
     * La ligne doit être comprise entre 1 et 8, et la colonne entre A et H.
     * La méthode continue à demander une saisie tant que le format n'est pas correct.
     * 
     * @return Un tableau de deux entiers contenant :
     *         - À l'index 0 : le numéro de ligne (entre 1 et 8)
     *         - À l'index 1 : l'index de la colonne (entre 0 et 7)
     */
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


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private int[][] cases = new int[8][8]; // Plateau de jeu (0 : case vide, 1 : blanc, 2 : noir)
    
    public void Plateau(){
        this.initialiser();
    }
    /**
     * Initialise le plateau avec les positions de départ des pions (les 4 pions centraux).
     */
    public void initialiser(){
        // Initialisation des cases blanches
        this.cases[4][4] = 1;
        this.cases[5][5] = 1;
        
        // Initialisation des cases noires
        this.cases[4][5] = 2;
        this.cases[5][4] = 2;
    }
    
    // Directions possibles pour vérifier les captures : haut, bas, gauche, droite, diagonales
    private int[][] directions = {
        {-1, 0}, // haut
        {1, 0},  // bas
        {0, -1}, // gauche
        {0, 1},  // droite
        {-1, -1}, // diagonale haut-gauche
        {-1, 1},  // diagonale haut-droit
        {1, -1},  // diagonale bas-gauche
        {1, 1}    // diagonale bas-droit
    };

    /**
     * Trouve toutes les positions jouables pour le joueur noir.
     * 
     * @return Liste des positions jouables sous forme de paires [i, j] représentant les indices des cases.
     */
    public List<int[]> positionsJouablesNoir() {
        List<int[]> positionsJouables = new ArrayList<>();
        
        // Parcours de toutes les cases du plateau
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Si la case est vide
                if (cases[i][j] == 0) {
                    // Vérifie si la case est jouable pour le noir
                    if (estJouableNoir(i, j)) {
                        positionsJouables.add(new int[]{i, j});
                    }
                }
            }
        }

        return positionsJouables;
    }

    /**
     * Vérifie si une position est jouable pour le joueur noir.
     * 
     * @param i La ligne de la case à vérifier.
     * @param j La colonne de la case à vérifier.
     * @return true si la position est jouable pour le joueur noir, false sinon.
     */
    private boolean estJouableNoir(int i, int j) {
        // Vérifie chaque direction
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            boolean captureTrouvee = false;

            // On doit d'abord rencontrer un pion blanc
            if (estDansPlateau(x, y) && cases[x][y] == 1) {
                // Ensuite, on cherche une case noire après une ou plusieurs cases blanches
                while (estDansPlateau(x, y) && cases[x][y] == 1) {
                    x += direction[0];
                    y += direction[1];
                }

                // Si on trouve une case noire après des cases blanches, c'est jouable
                if (estDansPlateau(x, y) && cases[x][y] == 2) {
                    captureTrouvee = true;
                }
            }

            if (captureTrouvee) {
                return true; // Si une capture est possible dans cette direction, la case est jouable
            }
        }

        return false; // Si aucune direction ne permet une capture, la case n'est pas jouable
    }

    /**
     * Vérifie si une position est dans les limites du plateau.
     * 
     * @param x La ligne de la position.
     * @param y La colonne de la position.
     * @return true si la position est dans les limites du plateau, false sinon.
     */
    private boolean estDansPlateau(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    /**
     * Trouve toutes les positions jouables pour le joueur blanc.
     * 
     * @return Liste des positions jouables sous forme de paires [i, j] représentant les indices des cases.
     */
    public List<int[]> positionsJouablesBlanc() {
        List<int[]> positionsJouables = new ArrayList<>();
        
        // Parcours de toutes les cases du plateau
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Si la case est vide
                if (cases[i][j] == 0) {
                    // Vérifie si la case est jouable pour le blanc
                    if (estJouableBlanc(i, j)) {
                        positionsJouables.add(new int[]{i, j});
                    }
                }
            }
        }

        return positionsJouables;
    }

    /**
     * Vérifie si une position est jouable pour le joueur blanc.
     * 
     * @param i La ligne de la case à vérifier.
     * @param j La colonne de la case à vérifier.
     * @return true si la position est jouable pour le joueur blanc, false sinon.
     */
    private boolean estJouableBlanc(int i, int j) {
        // Vérifie chaque direction pour le joueur blanc
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            boolean captureTrouvee = false;

            // On doit d'abord rencontrer un pion noir
            if (estDansPlateau(x, y) && cases[x][y] == 2) {
                // Ensuite, on cherche une case blanche après une ou plusieurs cases noires
                while (estDansPlateau(x, y) && cases[x][y] == 2) {
                    x += direction[0];
                    y += direction[1];
                }

                // Si on trouve une case blanche après des cases noires, c'est jouable
                if (estDansPlateau(x, y) && cases[x][y] == 1) {
                    captureTrouvee = true;
                }
            }

            if (captureTrouvee) {
                return true; // Si une capture est possible dans cette direction, la case est jouable
            }
        }

        return false; // Si aucune direction ne permet une capture, la case n'est pas jouable
    }

    /**
     * Affiche le plateau de jeu dans la console.

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
     * Vérifie si le plateau est plein (aucune case vide).
     * 
     * @return true si le plateau est plein, false sinon.

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
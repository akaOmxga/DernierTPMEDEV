/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

/**
 * Représente un jeton dans le jeu Othello.
 * Un jeton est défini par une position (x, y) sur l'othellier et une couleur (NOIR ou BLANC).
 * 
 * @author Victor et Barbo
 */
public class Jeton {
    /**
     * Constante représentant la couleur noire.
     */
    public static final int NOIR = 1;

    /**
     * Constante représentant la couleur blanche.
     */
    public static final int BLANC = 2;

    /**
     * Position du jeton sur l'axe x (colonne).
     */
    private int pos_x;

    /**
     * Position du jeton sur l'axe y (ligne).
     */
    private int pos_y;

    /**
     * Couleur du jeton : NOIR ou BLANC.
     */
    private int couleur;

    /**
     * Initialise un jeton avec une position et une couleur.
     * 
     * @param pos_x  Position en x (colonne).
     * @param pos_y  Position en y (ligne).
     * @param couleur Couleur du jeton (NOIR ou BLANC).
     * @throws IllegalArgumentException Si la couleur n'est pas valide.
     */
    public Jeton(int pos_x, int pos_y, int couleur) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.setCouleur(couleur); // Utilise le setter pour valider la couleur
    }

    /**
     * Change la couleur du jeton.
     * Si le jeton est noir, il devient blanc. S'il est blanc, il devient noir.
     */
    public void switchColor() {
        if (this.couleur == NOIR) {
            this.setCouleur(BLANC);
        } else if (this.couleur == BLANC) {
            this.setCouleur(NOIR);
        }
    }

    /**
     * Retourne la position x (colonne) du jeton.
     * 
     * @return La position en x.
     */
    public int getPos_x() {
        return pos_x;
    }

    /**
     * Retourne la position y (ligne) du jeton.
     * 
     * @return La position en y.
     */
    public int getPos_y() {
        return pos_y;
    }

    /**
     * Retourne la couleur actuelle du jeton.
     * 
     * @return La couleur du jeton (NOIR ou BLANC).
     */
    public int getCouleur() {
        return couleur;
    }

    /**
     * Définit la position x (colonne) du jeton.
     * 
     * @param pos_x La nouvelle position en x.
     */
    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    /**
     * Définit la position y (ligne) du jeton.
     * 
     * @param pos_y La nouvelle position en y.
     */
    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    /**
     * Définit la couleur du jeton.
     * 
     * @param couleur La nouvelle couleur (NOIR ou BLANC).
     * @throws IllegalArgumentException Si la couleur n'est pas valide.
     */
    public void setCouleur(int couleur) {
        if (couleur == NOIR || couleur == BLANC) {
            this.couleur = couleur;
        } else {
            throw new IllegalArgumentException("Couleur invalide : " + couleur);
        }
    }
}



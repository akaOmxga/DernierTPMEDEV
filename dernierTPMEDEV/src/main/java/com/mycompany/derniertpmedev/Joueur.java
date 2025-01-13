/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

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
    
    /**
     * Constructeur qui initialise la couleur du joueur.
     * 
     * @param couleur La couleur du joueur (1 pour blanc, 2 pour noir)
     */
    Joueur(int couleur){
        this.couleur = couleur;
    }
    
    /**
     * Retourne la couleur du joueur.
     * 
     * @return La couleur du joueur (1 pour blanc, 2 pour noir)
     */
    public int getCouleur(){
        return this.couleur;
    }
}


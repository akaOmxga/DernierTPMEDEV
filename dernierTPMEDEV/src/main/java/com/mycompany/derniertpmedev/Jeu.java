/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

import java.util.ArrayList;

/**
 * Classe représentant une partie de jeu de plateau.
 * Cette classe gère le déroulement d'une partie entre deux joueurs,
 * avec un système de tour par tour et des règles spécifiques pour
 * les pions noirs et blancs.
 *
 * @author barbo et simon
 */
public class Jeu {
    
    public Plateau plateauDeJeu = new Plateau();

    /** Le plateau de jeu sur lequel se déroule la partie */
    public Plateau plateauDeJeu;
    
    /** Liste contenant les deux joueurs participant à la partie */

    public ArrayList<Joueur> listeJoueurs;
    
    /** Indicateur de tour : true si c'est au noir de jouer, false pour le blanc */
    public Boolean auNoirDeJouer = true;
    

    /**
     * Constructeur par défaut.
     * Initialise un nouveau plateau de jeu et une liste vide de joueurs.
     */
    Jeu(){
        this.plateauDeJeu = new Plateau();
        this.listeJoueurs = new ArrayList<Joueur>();
    }

    
    /**
     * Initialise une nouvelle partie.
     * Crée les deux joueurs (noir et blanc) et les ajoute à la liste des joueurs.
     * Initialise également le plateau de jeu dans sa configuration de départ.
     */
    public void initialisation(){
        // initialisation des Joueurs :
        Joueur joueurBlanc = new Joueur(1);
        Joueur joueurNoir = new Joueur(2);
        listeJoueurs.add(joueurBlanc);
        listeJoueurs.add(joueurNoir);
        
        // initialisation du Plateau :
        this.plateauDeJeu.initialiser();
    }
    
    /**
     * Gère le déroulement d'un tour de jeu.
     * Vérifie la validité des coups joués et alterne entre les joueurs.
     * Le joueur noir commence toujours la partie.
     */
    public void jouerTour(){
        // au joueur noir de commencer
        ArrayList<ArrayList<Integer>> coupJouableNoir = new ArrayList<>();
        int[] coupNoir = this.listeJoueurs.get(0).jouer();
        while (!(coupJouableNoir.contains(coupNoir))){
            System.out.println("Ce coup n'est pas jouable, merci d'en fournir un autre :");
            coupNoir = this.listeJoueurs.get(0).jouer();    
        }
        
        plateauDeJeu.changerpionNoir(coupNoir);
        
        

        // puis au joueur blanc 

    }
    
    /**
     * Vérifie si la partie est terminée pour un joueur donné.
     * La partie se termine lorsqu'un joueur n'a plus de coups possibles.
     *
     * @param couleur La couleur du joueur à vérifier (1 pour blanc, 2 pour noir)
     * @return true si le joueur n'a plus de coups possibles, false sinon
     */
    public boolean detectionFinPartie(int couleur){
        if (couleur == 1){
            return(this.plateauDeJeu.positionsJouablesBlanc().isEmpty());
        }
        else{
            return(this.plateauDeJeu.positionsJouablesNoir().isEmpty());
        }
        
    }
    
    /**
     * Affiche le message de fin de partie.
     * Cette méthode est appelée lorsque la partie est terminée.
     */
    public void finPartie(){
        System.out.println("fin de la partie !");
    }
    
    /**
     * Gère le déroulement complet d'une partie.
     * La partie continue tant que les deux joueurs ont des coups possibles.
     * La partie se termine dès qu'un des joueurs n'a plus de coups possibles.
     */
    public void partie(){
        this.initialisation();
        while (!(this.detectionFinPartie(1)) && !(this.detectionFinPartie(2))){
            this.jouerTour();
        }
        finPartie();
    }
  
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.derniertpmedev;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Jeu {
    
    public Plateau plateauDeJeu = new Plateau();
    public ArrayList<Joueur> listeJoueurs;
    public Boolean auNoirDeJouer = true;
    
    
    public void initialisation(){
        // initialisation des Joueurs :
        Joueur joueurBlanc = new Joueur(1);
        Joueur joueurNoir = new Joueur(2);
        listeJoueurs.add(joueurBlanc);
        listeJoueurs.add(joueurNoir);
        
        // initialisation du Plateau :
        this.plateauDeJeu = new Plateau();
    }
    
    public void jouerTour(){
        // au joueur noir de commencer
        ArrayList<ArrayList<Integer>> coupJouableNoir = new ArrayList<>();
        int[] coupNoir = this.listeJoueurs.get(0).jouer();
        while (!(coupJouableNoir.contains(coupNoir))){
            System.out.println("Ce coup n'est pas jouable, merci d'en fournir un autre :");
            coupNoir = this.listeJoueurs.get(0).jouer();    
        }
        
        plateauDeJeu.changerpionNoir(coupNoir);
        
        
        
        
        
        
        
        
    }
    
    public boolean detectionFinPartie(int couleur){
        if (couleur == 1){
            return(this.plateauDeJeu.positionsJouablesBlanc().isEmpty());
        }
        else{
            return(this.plateauDeJeu.positionsJouablesNoir().isEmpty());
        }
        
    }
    
    public void finPartie(){
        System.out.println("fin de la partie !");
    }
    
    public void partie(){
        this.initialisation();
        while (!(this.detectionFinPartie(1)) && !(this.detectionFinPartie(2))){
            this.jouerTour();
        }
        finPartie();
    }
  
}

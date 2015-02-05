/*
 * Jeu dilemme 
 * @author NGUYEN Minh Hoang && TAN Tao
 */

package jeudilemme;

import java.util.*;
import java.io.Serializable;

/*
*Class Partie contient un attribut étant une liste des Coup(définit dans Class Coup)
*Un constructeur sans paramètre qui initialise la liste des coups
*6 méthodes de classe donc coopere(), getNbCoups(), getScoreA(), getScoreB(), aAcoopere() et bAcoopere()
*/
public class Partie extends Observable implements Serializable{
    /*
 * Jeu dilemme 
 * @author NGUYEN Minh Hoang && TAN Tao
 */
    
    public List<Coup> choix;
/*
    *Constructeur construit au nouveau une nouvelle liste des coups
    */
    public Partie(){
         choix = new ArrayList<Coup>();
    }
    
    
 /*
  *Classe coopere mettre le nouveau coup dans la liste
  *@param boolean choixA && boolean choixB
  */
    public void coopere(boolean choixA, boolean choixB){
        Coup c = new Coup(choixA, choixB);
        choix.add(c);
        setChanged();
        notifyObservers();
    }
    
/*
    *Classe getNbCoups() renvoie le nombre des coups effectués
    *@return Le nombre des coups effectués au type int
    */
    public int getNbCoups(){
        return choix.size();
    }
    
    
/*
    *Classe getScoreA() renvoie le total score de A
    *@return Le total score de A au type double
    */
    public double getScoreA(){
        double score = 0;
        for(int i = 0; i< choix.size(); i++){
            score += choix.get(i).getGainA();    
        }
        return score; 
    }
    
/*    
    *Classe getScoreB() renvoie le total score de B  
    *@return Le total score de B au type double
    */
    public double getScoreB(){
        double score = 0;
        for(int i = 0; i< choix.size(); i++){
            score += choix.get(i).getGainB();
        }
        return score;
    }
    
/*
    *Classe aAcoopere() renvoie le coup effectué de A pendant un tel coup
    *@param Le i ème coup au type int
    *@return Le coup de A effectué donc de type boolean
    */
    public boolean aAcoopere(int nbCoup){
       return choix.get(nbCoup - 1).choixA;
    }
    
/*
    *Classe bAcoopere() renvoie le coup effectué de B pendant un tel coup
    *@param Le i ème coup au type int
    *@return Le coup de B effectué donc de type boolean
    */
    public boolean bAcoopere(int nbCoup){
        return choix.get(nbCoup -1).choixB;
    }         
}
      


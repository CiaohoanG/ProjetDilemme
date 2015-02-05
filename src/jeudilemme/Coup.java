/*
 * @author NGUYEN Minh Hoang et TAN Tao
 */
package jeudilemme;

import java.io.Serializable;
/*
*Classe Coup avec deux attributs de type boolean qui prend en compte le coup de A et B
*Un construc

*/
public class Coup implements Serializable{
    
    public boolean choixA;
    public boolean choixB;
    
    
    public Coup(boolean choixA, boolean choixB){
        this.choixA = choixA;
        this.choixB = choixB;

    }
    
    public double getGainA(){
        double gain;
        if(choixA && choixB) gain = 3;
        else if(choixA  && !choixB ) gain = 0;
        else if(!choixA && choixB ) gain = 5;
        else gain = 1;
        return gain;
    }
    
    public double getGainB(){
        double gain;
        if(choixA && choixB) gain = 3;
        else if(choixA && !choixB) gain = 5;
        else if(!choixA && choixB) gain = 0;
        else gain = 1;
        return gain;
    }
    
    
}

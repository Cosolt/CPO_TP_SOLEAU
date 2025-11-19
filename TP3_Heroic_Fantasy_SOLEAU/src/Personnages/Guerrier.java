/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author colin
 */
public class Guerrier extends Personnage {
    boolean cheval ; 
    
    public Guerrier(String nom, int niveauVie, boolean cheval) {
        super(nom, niveauVie);
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    
    
}

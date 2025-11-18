/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author colin
 */
public class Epee extends Arme {
    int finesse ;
    
    public Epee(String nomArme, int niv, int F) {
        super(nomArme, niv);
        finesse = F ;
        
        if (finesse > 100) {
            F = 100 ;
        } else if (finesse < 0) {
            finesse = 0 ;
        } else {
            finesse = F ;
        }
    }
    
    public int getFinesse() {
        return finesse ;
    }
    
     @Override
    public String toString () {
        return "Le nom de l'epee est "+ nom + " son niveau d'attaque est " + niveau + " et sa finesse est de " + finesse ;
    }
    
}

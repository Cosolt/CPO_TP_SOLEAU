/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_soleau;

/**
 *
 * @author colin
 */
public abstract class Arme {
   String nom ;
   int niveau ;
   
   
   public Arme(String nomArme, int niv) {
        nom = nomArme ;
        
        if (niveau > 100) {
            niv = 100 ;
        } else if (niveau < 0) {
            niveau = 0 ;
        } else {
            niveau = niv ;
        }
    }
   
   public int getNiveauAttaque() {
        return niveau;
   }


    public String getNom() {
        return nom;
    }
   
   @Override
    public String toString () {
        return "Le nom de l'arme est "+ nom + " et son niveau d'attaque est " + niveau;
    }
    
}

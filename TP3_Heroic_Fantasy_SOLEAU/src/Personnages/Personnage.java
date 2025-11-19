/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author colin
 */
public abstract class Personnage {
    String nom ;
    int niveauVie ;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }
    
    
    
    
    @Override
    public String toString () {
        return "Le nom du personnage est "+ nom + ", son niveau de vie est " + niveauVie ;
    }
    
}

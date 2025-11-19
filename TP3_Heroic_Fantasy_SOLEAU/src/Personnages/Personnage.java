/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author colin
 */
public abstract class Personnage {
    String nom ;
    int niveauVie ;
    public Arme armeEquipee = null;
    public Arme Arme_en_Main = null ;
   

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }
    
    private ArrayList<Arme> armes = new ArrayList<>() ;
    
    public void ajouterArme(Arme a) {
        if (armes.size() < 5) {
            armes.add(a);
        }
    }
    
    public void equiperArme(Arme a) {
        for (int i = 0; i < 5; i++) {
            if (a.equals(armes.get(i))) {  
                armeEquipee = a;
            }
        }   
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    
    
    
    
    @Override
    public String toString () {
        return "Le nom du personnage est "+ nom + ", son niveau de vie est " + niveauVie ;
    }
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_soleau;

import Armes.*;
import java.util.ArrayList;


/**
 *
 * @author colin
 */
public class TP3_Heroic_Fantasy_SOLEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }    
        
        Magicien Gandalf = new Magicien("Gandalf", 65, confirme) ;
        Magicien Garcimore = new Magicien("Garcimore", 44, novice) ;
        
        Guerrier Conan = new Guerrier("Conan", 78, à pied) ;
        Guerrier Lannister = new Guerrier("Lannister", 45, à cheval) ;
    }
    
}

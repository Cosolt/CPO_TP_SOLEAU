/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author colin
 */
public class Baton extends Arme {
    int age ;
    
    public Baton(String nomArme, int niv, int Age) {
        super(nomArme, niv);
        age = Age ; 
        
        if (age > 100) {
            Age = 100 ;
        } else if (age < 0) {
            age = 0 ;
        } else {
            age = Age ;
        }
    }
    
    public int getAge() {
        return age ;
    }
    
     @Override
    public String toString () {
        return "Le nom du baton est "+ nom + " son niveau d'attaque est " + niveau + " et son age est " + age ;
    }
    
}

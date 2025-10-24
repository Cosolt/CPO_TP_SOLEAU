/*
 * TP1_guessMyNumber
 * Manipuler des nombres aléatoires
 * 24/10/2025
 */
package tp1_guessmynumber_soleau;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author colin
 */
public class TP1_guessMyNumber_SOLEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nombre ;
        int niveau ;
        int compteur = 1 ;
        int essais = 0 ;
        int maxEssais = 0 ;
        
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(200);
        
        System.out.println("""
        Choisissez la difficultée :
        1) facile
        2) normal
        3) difficile """);
        niveau = sc.nextInt();
        System.out.println(" Saisissez un nombre entre 0 et 100 : ");
        nombre = sc.nextInt();
        
        
        if (niveau == 1) {
            maxEssais = 20 ;    
        } else if (niveau == 2) {
            maxEssais = 10 ;         
        } else if (niveau == 3) {
            maxEssais = 5 ;
        }
        
        while ( nombre != n && essais < maxEssais) {
                    
            System.out.println("Resaisissez un nombre entre 0 et 100 : ") ;
            nombre = sc.nextInt();
             if (nombre < n) {
                System.out.println(" Trop petit ") ;
            } else if (nombre < n) {
                System.out.println(" Trop grand ") ;
            }
             
        if (nombre == n){
            System.out.println(" Gagné ") ;
            
        }
        
        }
              
    }
    
}

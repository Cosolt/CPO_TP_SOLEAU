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
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println(" Saisissez un nombre entre 0 et 100 : ");
        nombre = sc.nextInt();
        
        if (nombre == n) {
            System.out.println(" gagné ") ;
        } else if (nombre < n) {
            System.out.println(" Trop petit !") ;
        } else if (nombre > n) {
            System.out.println(" Trop grand !") ;
        }
        
        while ( nombre != n) {
            System.out.println("Resaisissez un nombre entre 0 et 100 : ") ;
            nombre = sc.nextInt();
        }
        
        
        System.out.println( n ) ;
    }
    
}

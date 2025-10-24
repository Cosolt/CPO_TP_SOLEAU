/*
 * TP1_stats_SOLEAU
 * vérifier la distribution du générateur de nombre aléatoire
 * 24/10/2025
 */
package tp1_stats_soleau;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author colin
 */
public class TP1_stats_SOLEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = new int[6]; 
        int m ;
        int i ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Saisissez un nombre entier : ");
        m = sc.nextInt();
        
        for ( i = 0 ; i < m ; i++ ) {
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(7);
            tab[n]++ ;
        
            for ( i = 0; i < tab.length; i++) {
            System.out.println("Case " + (i + 1) + " : " + tab[i]);
        }
        
        }
    }
    
}

/*
 * TP1_manipNombresInt_SOLEAU
 * Saisie et manipulation de nombres
 * 22/10/2025
 */
package tp1_saisie;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class TP1_Saisie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1;
        int entier2; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez un entier :");
        entier1=sc.nextInt();
        System.out.println("Entrez un entier :");
        entier2=sc.nextInt();
        
        System.out.println( "Leur somme est " +(entier1 + entier2)); 
        System.out.println( "Leur différence est " + (entier1 - entier2));
        System.out.println( "Leur produit est " +(entier1 * entier2));
        System.out.println( "Leur produit est " +(entier1 / entier2)+ " le reste est " +(entier1 % entier2));
        
        
    }
    
}

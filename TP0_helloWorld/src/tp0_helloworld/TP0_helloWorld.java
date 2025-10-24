/*
 * TP0_helloWorld
 * Se familiariser avec l'environnement Netbeans
 * 20/10/2025
 */

package tp0_helloworld;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Bonjour " ) ; 
        System.out.println( " Au revoir " ) ; 
        int i = 20;
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine(); 
    }
}

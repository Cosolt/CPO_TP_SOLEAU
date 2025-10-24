/*
 * TP0_helloWorld
 * Se familiariser avec l'environnement Netbeans
 * 20/10/2025
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur ;
        double operande1 ;
        double operande2 ;
        double result ;
        result = 0 ;
        System.out.println("""
        Please enter the operator:
        1) add
        2) substract
        3) multiply
        4) divide
        5) modulo """);
        operateur = sc.nextInt();
        
        System.out.print(" Entrez l'operande1 ");
        operande1 = sc.nextDouble();
        
        System.out.print(" Entrez l'operande2 ");
        operande2 = sc.nextDouble();
        
        if (operateur == 1) {
            result = operande1 + operande2 ;
        } else if (operateur == 2) {
            result = operande1 - operande2 ;
        } else if (operateur == 3) {
            result = operande1 * operande2 ;
        } else if (operateur == 4) {
            result = operande1 / operande2 ;
        } else if (operateur == 5) {
            result = operande1 % operande2 ;
        }
        System.out.print(" Le résultat est " +result) ;
    }
    }
    

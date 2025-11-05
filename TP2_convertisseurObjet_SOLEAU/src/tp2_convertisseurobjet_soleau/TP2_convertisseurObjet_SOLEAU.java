/*
 * TP2_convertisseurObjet_SOLEAU
 * réaliser un convertisseur de températures en version objet
 * 04/11/2025
 */
package tp2_convertisseurobjet_soleau;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class TP2_convertisseurObjet_SOLEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conv1 = new Convertisseur();
        Convertisseur conv2 = new Convertisseur();
        
        System.out.println( "7.1 degre Celcius donne " + conv1.CelciusVersKelvin(7.1) + " K" ) ;
        System.out.println( "34.0 degre Farenheit donne " + conv1.FarenheitVersCelcius(34.2) + " degre Celcius" );
        System.out.println( " 265.0 K donne " + conv1.KelvinVersFarenheit(265.0) + " degre Farenheit" ) ;
        
        System.out.println( "6.8 degre Celcius donne " + conv2.CelciusVersFarenheit(6.8) + " degre Farenheit" ) ;
        System.out.println( "71.5 degre Farenheit donne " + conv2.FarenheitVersKelvin(71.5) + " K" ) ;
        System.out.println( " 294.3 K donne " + conv2.KelvinVersCelcius(294.3) + " degre Celcius" ) ;
        
        System.out.println(conv1);
        System.out.println(conv2) ;
    }
    
}

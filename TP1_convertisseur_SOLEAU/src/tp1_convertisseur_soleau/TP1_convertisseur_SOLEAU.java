/*
 * TP1_convertisseur_SOLEAU
 * convertisseur de températures
 * 22/10/2025
 */
package tp1_convertisseur_soleau;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class TP1_convertisseur_SOLEAU {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double tCelcius; 
        double tKelvin ; 
        double tFarenheit ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur :");
        tCelcius =sc.nextDouble();
        System.out.println("La température en Kelvin est : " +(tCelcius + 273));
          
    }
    
    
    public static double CelciusVersKelvin (double tCelcius) {
        return((tCelcius + 273)) ;                            
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
        return((tKelvin - 273)) ;              
    }
   
    public static double FarenheitVersCelcius (double tFarenheit) {
        return(((tFarenheit - 32)/(5/9))) ;
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
        return((tCelcius *(9/5))+32) ;
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        return(CelciusVersFarenheit(tKelvin - 273)) ;
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
        return(FarenheitVersCelcius (tFarenheit + 273)) ;
    }
    
}


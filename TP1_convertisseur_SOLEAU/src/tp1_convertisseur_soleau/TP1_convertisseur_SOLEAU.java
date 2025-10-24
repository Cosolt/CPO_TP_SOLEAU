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
        int conversion ;
        double valeur ;
        double tCelcius; 
        double tKelvin ; 
        double tFarenheit ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        valeur =sc.nextDouble();
        
        System.out.println("""
        Saisissez la conversion que vous souhaitez effectuer :
        1) De Celcius vers Kelvin
        2) De Kelvin vers Celcius
        3) De Farenheit vers Celcius
        4) De Celcius vers Farenheit
        5) De Kelvin vers Farenheit
        6) De Farenheit vers Kelvin """);
        conversion = sc.nextInt();
        
        System.out.print(" La température est " ) ;
        
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


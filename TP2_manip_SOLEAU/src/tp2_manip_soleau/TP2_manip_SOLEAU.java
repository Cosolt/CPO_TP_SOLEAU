/*
 * TP2_manip_SOLEAU
 * manipuler les références objets comprendre un peu mieux les mécanismes
de référence des objets
 * 05/11/2025
 */
package tp2_manip_soleau;

/**
 *
 * @author colin
 */
public class TP2_manip_SOLEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        
        assiette2 = assiette1 ;
        assiette1 = assiette3 ;
        
        System.out.println("nb de calories de Assiette 2 : " +assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;

        Moussaka[] tabMoussaka = new Moussaka[10] ; 

        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(400 + i * 10);
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }
        
    }
    
}

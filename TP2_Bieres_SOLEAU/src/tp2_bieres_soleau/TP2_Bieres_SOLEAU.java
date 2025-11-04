/*
 * TP2_Bieres_SOLEAU
 * réaliser une première classe, créer quelques objets, et présenter
les notions de méthodes et constructeur.
 * 03/11/2025
 */
package tp2_bieres_soleau;

/**
 *
 * @author colin
 */
public class TP2_Bieres_SOLEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
        uneBiere.lireEtiquette();
        
        System.out.println(uneBiere);  
        uneBiere.Décapsuler();         
        System.out.println(uneBiere);  
        uneBiere.Décapsuler();  

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();

        System.out.println(autreBiere);  
        autreBiere.Décapsuler();         
        System.out.println(autreBiere);  
        autreBiere.Décapsuler();  
        
    }
    
}

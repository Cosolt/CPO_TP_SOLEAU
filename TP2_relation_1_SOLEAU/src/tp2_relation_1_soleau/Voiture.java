/*
 * TP2_relation_1_SOLEAU
 * mettre en place une relation simple entre deux ou plusieurs objets
 * 08/11/2025
 */
package tp2_relation_1_soleau;

/**
 *
 * @author colin
 */
public class Voiture {
     String marque;
    String modele;
    int PuissanceCV;
    Personne proprietaire;
    public Voiture(String UnModele, String UneMarque, int UnePuissance) {
        modele = UnModele;
        marque = UneMarque;
        PuissanceCV = UnePuissance;
        proprietaire = null;
    }
    @Override
    public String toString() {
        return "Voiture{" + "marque=" + marque + ", modele=" + modele + ", PuissanceCV=" + PuissanceCV + '}';
    }
}

package fr.univ_amu.iut.exo2;
import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Technicien extends Employe {
    private double salaireBrut;
    private double salaireNet;

    public Technicien (int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, base, nbHeures);
        this.salaireBrut = base * nbHeures + nbUnitesProduites * tauxCommissionUnite;
        this.salaireNet = 0.8 * this.salaireBrut;
    }

    public void fabriquerProduit() {
        System.out.println("Je fabrique un produit.");
    }

}

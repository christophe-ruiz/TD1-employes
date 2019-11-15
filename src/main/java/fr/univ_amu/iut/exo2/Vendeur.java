package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Vendeur extends Commercial {
    public Vendeur (int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, base, nbHeures, chiffreAffaires, tauxCommission);
    }
}

package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Commercial extends Employe {
    private double salaireBrut;
    private double salaireNet;
    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial (int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, base, nbHeures);
        this.salaireBrut = base + chiffreAffaires * tauxCommission;
        this.salaireNet = 0.8 * salaireBrut;
    }

    public void negocierTransaction() {
        System.out.println("Je négocie une transaction.");
    }
}

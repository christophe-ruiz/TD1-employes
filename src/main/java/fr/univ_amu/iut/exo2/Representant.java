package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Representant extends Commercial {
    private double salaireBrut;
    private double salaireNet;
    public Representant (int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, base, nbHeures, chiffreAffaires, tauxCommission);
        salaireBrut = EmployeOrdinaire.calculerBrut(salaireBrut, nbHeures, echelon);
        this.salaireNet = super.getSalaireNet();
    }

    @Override
    public double getSalaireBrut() {
        return salaireBrut;
    }
}

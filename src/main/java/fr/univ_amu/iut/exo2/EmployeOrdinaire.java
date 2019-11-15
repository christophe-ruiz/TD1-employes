package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class EmployeOrdinaire extends Employe {
    private double salaireBrut;
    private double salaireNet;

    public EmployeOrdinaire (int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures) {
        super(numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, base, nbHeures);
        this.salaireBrut = super.getSalaireBrut() + echelon * 100;
        this.salaireNet = 0.8 * salaireBrut;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void effectuerUneTacheOrdinaire() {
        System.out.println("J'effectue une tache ordinaire");
    }
}

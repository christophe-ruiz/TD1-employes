package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class Employe {

    static int indexEmp = 0;

    private int numSecu;
    private int numEmp;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;

    private double base;
    private double nbHeures;

    private double salaireBrut;
    private double salaireNet;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaireNet() {
        return salaireNet;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public Employe (int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures) {
        this.numEmp = ++indexEmp;
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.dateEmbauche = dateEmbauche;
        this.dateNaissance = dateNaissance;
        this.base = base;
        this.nbHeures = nbHeures;

        this.salaireBrut = this.base * this.nbHeures * 4;
        this.salaireNet = this.salaireBrut * 0.8;
    }
}

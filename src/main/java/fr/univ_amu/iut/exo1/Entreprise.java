package fr.univ_amu.iut.exo1;

import java.util.ArrayList;

public class Entreprise {
    private String nom;
    private ArrayList<Employe> listeEmploye ;

    public Entreprise(String nom, ArrayList<Employe> listeEmploye) {
        this.nom = nom;
        this.listeEmploye = listeEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void embaucher(Employe nouvelEmploye) {
        this.listeEmploye.add(nouvelEmploye);
    }

    public void licencier(Employe employe) {
        this.listeEmploye.remove(employe);
    }

    public ArrayList<Employe> getListeEmploye() {
        return listeEmploye;
    }

    private String employeData() {
        String result = "";
        for (Employe employe: this.getListeEmploye()) {
            result += employe.getNom() + ' ' + employe.getPrenom() + " : " + employe.getSalaireNet() + '\n';
        }
        return result;
    }

    @Override
    public String toString() {
        return  "Nom de l'entreprise: " + this.getNom() + '\n' +
                "Liste d'employés: " + '\n' + employeData() + '\n';
    }
}

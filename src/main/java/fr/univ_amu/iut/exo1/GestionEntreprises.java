package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        ArrayList liste = new ArrayList();
        Entreprise E =  new Entreprise("La Maison de Mickey", liste);

        Employe bj = new Employe(12345, "Joe", "Bobby", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2019, Month.NOVEMBER, 15), 9.50, 35);
        E.embaucher(bj);

        System.out.println(E.toString());

        E.licencier(bj);

        System.out.println(E.toString());
    }
}
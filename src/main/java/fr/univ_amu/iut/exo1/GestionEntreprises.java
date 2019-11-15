package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        ArrayList liste = new ArrayList();
        Entreprise maBoiteInfo =  new Entreprise("Ma Boite Info", liste);

        Employe bj = new Employe(12345, "Joe", "Bobby", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2019, Month.NOVEMBER, 15), 9.50, 35);
        maBoiteInfo.embaucher(bj);

        System.out.println(maBoiteInfo.toString());

        maBoiteInfo.licencier(bj);

        System.out.println(maBoiteInfo.toString());
    }
}
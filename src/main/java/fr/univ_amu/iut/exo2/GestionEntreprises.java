package fr.univ_amu.iut.exo2;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Commercial cmc = new Commercial(12345, "Joe", "Bobby", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2020, Month.NOVEMBER, 20), 22, 45, 12000, 2);

        EmployeOrdinaire eO = new EmployeOrdinaire(12345, "Joe", "Bobby", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2020, Month.NOVEMBER, 20), 22, 45);
        Representant rpz = new Representant(12345, "Joe", "Bobby", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2020, Month.NOVEMBER, 20), 22, 45, 12000, 2);
        System.out.println(cmc.getSalaireBrut());
        System.out.println(eO.getSalaireBrut());
        System.out.println(rpz.getSalaireBrut());
        //throw new RuntimeException("Not yet implemented !");
    }
}
package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {

    private LocalDate date;
    private LocalTime heure;
    private double prix ;
    private double prixMax;

    public OffreEnchere(double prix, double prixMax) {
        this.prix = prix;
        this.prixMax = prixMax;
        date = LocalDate.now();
        heure = LocalTime.now();
    }

    public double getPrix() {
        return prix;
    }

    public double getPrixMax() {
        return prixMax;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "OffreEnchere{" +
                "date=" + date +
                ", heure=" + heure +
                ", prix=" + prix +
                ", prixMax=" + prixMax +
                '}';
    }
}

package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class Produit {

    private int numero;
    private String description;
    private double prixCourant;
    private LocalDate dateEnchere;
    private LocalTime heureDebut;
    private static int lePasMini;
    private int coutParticipation;
    private boolean ouverture;

    public Produit(int numero, String description, double prixCourant, int coutParticipation) {
        this.numero = numero;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
    }

    public void setLePasMini(int lePasMini) {
        this.lePasMini = lePasMini;
    }

    public void demarrerEnchere(){

        this.heureDebut=LocalTime.now();
        this.dateEnchere=LocalDate.now();
        this.ouverture= true;
    }

    public void arreterEnchere(){
        this.ouverture= false;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "numero=" + numero +
                ", description='" + description + '\'' +
                ", prixCourant=" + prixCourant +
                ", lePasMini=" + lePasMini +
                ", coutParticipation=" + coutParticipation +
                ", ouverture=" + ouverture +
                '}';
    }

    public void ajouterOffre(OffreEnchere offre){

        if(offre.getPrix() >= prixCourant ){

        }
    }
}

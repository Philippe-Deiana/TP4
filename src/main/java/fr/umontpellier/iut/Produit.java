package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Produit {

    private int numero;
    private String description;
    private double prixCourant;
    private LocalDate dateEnchere;
    private LocalTime heureDebut;
    private static int lePasMini;
    private int coutParticipation;
    private boolean estDispo;
    private ArrayList<OffreEnchere> listeOffresDeposees;
    private OffreEnchere gagnante;

    public Produit(int numero, String description, double prixCourant, int coutParticipation) {
        this.numero = numero;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        listeOffresDeposees = new ArrayList<>();
    }

    public void setLePasMini(int lePasMini) {
        this.lePasMini = lePasMini;
    }

    public void demarrerEnchere(){

        this.heureDebut=LocalTime.now();
        this.dateEnchere=LocalDate.now();
        this.estDispo = true;
    }

    public void arreterEnchere(){
        this.estDispo = false;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "numero=" + numero +
                ", description='" + description + '\'' +
                ", prixCourant=" + prixCourant +
                ", lePasMini=" + lePasMini +
                ", coutParticipation=" + coutParticipation +
                ", estDispo=" + estDispo +
                '}';
    }

    public void ajouterOffre(OffreEnchere offre){

        if(offre.getPrix() >= prixCourant + lePasMini && estDispo){
            listeOffresDeposees.add(offre);
            prixCourant = offre.getPrix();
            gagnante = offre;
        }
    }



}

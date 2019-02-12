package fr.umontpellier.iut;

import java.util.ArrayList;

public class Compte {

    private String pseudo;
    private String email;
    private String adresse;
    private double soldeDuCompte;
    private ArrayList<OffreEnchere> listOffre ;

    public Compte(String pseudo, String email, String adresse) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.soldeDuCompte=0;
    }

    public void creditCompte(double soldeDuCompte) {
        this.soldeDuCompte += soldeDuCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", soldeDuCompte=" + soldeDuCompte +
                '}';
    }

    public void creerOffre(Produit produit, double prixMax, double prixCourant){

        OffreEnchere  offre = new OffreEnchere( prixCourant, prixMax );
        //soldeDuCompte -= ;
        listOffre.add(offre);

    }
}

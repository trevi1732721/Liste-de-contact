/**
 * Created by TreVi1732721 on 2018-01-22.
 */
public class Entreprise {
    String nom ;
    Adresse adresseEntreprise = new Adresse() ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(Adresse adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }


}

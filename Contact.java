/**
 * Created by TreVi1732721 on 2018-01-22.
 */
public class Contact {
    String prenom;
    String nom;
    Adresse adresse = new Adresse();
    Occupation occupation = new Occupation();
    Telephone[] numeroTelephone = new Telephone[10];

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Telephone[] getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(Telephone[] numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}

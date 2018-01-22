/**
 * Created by TreVi1732721 on 2018-01-22.
 */
public class Occupation {
    String poste;
    Entreprise entreprise = new Entreprise();

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}

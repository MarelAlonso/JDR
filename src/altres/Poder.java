package altres;

import java.util.Objects;

public class Poder {

    private String nom;
    private int bonusAtac;
    private int bonusDef;


//////// GETTERS - SETTERS ////////////////////

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getBonusAtac() {
        return bonusAtac;
    }
    public void setBonusAtac(int bonusAtac) {
        this.bonusAtac = bonusAtac;
    }
    public int getBonusDef() {
        return bonusDef;
    }
    public void setBonusDef(int bonusDef) {
        this.bonusDef = bonusDef;
    }


////////  FUNCIONES  //////////////////////////



////////  EQUALS - TOSTRING ///////////////////


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        Poder poders = (Poder) o;
        return nom.equalsIgnoreCase(poders.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }

    @Override
    public String toString() {
        return "-" + this.nom + "(BA:" + bonusAtac + ", BD:" + bonusDef +")";
    }

    ////////  CONSTRUCTORES  //////////////////////


public Poder(String nom, int BA, int BD){
    this.nom = nom;
    this.bonusAtac = BA;
    this.bonusDef = BD;

}


}

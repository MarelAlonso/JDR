package personatjes;
import altres.Equip;
import java.util.Objects;

public class Jugador {

//////ATRIBUTS /////////////////////////////
    private String nom;
    private int puntsatac;
    private int puntsdef;

    private int vides;
    private Equip equip;
    static  int videsInicials = 200;


/// ////// GETTERS-SETTERS/////////////////////////////////////////

public String getNom() {
    return nom;
}

public int getPuntsatac() {
    return puntsatac;
}

public int getPuntsdef() {
    return puntsdef;
}

public int getVides() {
    return vides;
}

protected void setNom(String nom) {
    this.nom = nom;
}

protected void setPuntsatac(int puntsatac) {
    this.puntsatac = puntsatac;
}

protected void setPuntsdef(int puntsdef) {
    this.puntsdef = puntsdef;
}

public static int getVidesInicials() {
    return videsInicials;
}

public void setVidesInicials(int videsInicials) {
    Jugador.videsInicials = videsInicials;
}

protected void setVides(int vides) {
    this.vides = vides;
}


public Equip getEquip() {
    return equip;
}

public void setEquip(Equip equipnou) {

    if(equipnou == null && this.equip != null){
        // desasignem equip
        Equip equipAnt = this.equip;
        this.equip = null;
        equipAnt.lleva(this.getNom());
    }
    else if(equipnou != null && equipnou != this.equip){
        // asignem equip
        Equip equipAnt = this.equip;
        if (equipAnt != null){
            equipAnt.lleva(this.nom);
        }
        this.equip = equipnou;
        equipnou.posa(this);


    }
}



/// //  FUNCIONS ///////////////////////////////////
    protected void esColpejatamb(int quantitat){
        int golpe;
        golpe = quantitat - this.getPuntsdef();
        if (golpe >= 0) {
            if ((this.getVides() - golpe) <= 0) {
                System.out.println(this.getNom() +" es colpejat amb " + quantitat + " punts y es defen amb " + this.getPuntsdef() + " punts: " + this.getVides() + "-" + golpe + " = 0" );
                this.setVides(0);
            } else {
                System.out.println(this.getNom() + " es colpejat amb " + quantitat + " punts y es defen amb " + this.getPuntsdef() + " punts: " + this.getVides() + "-" + golpe + " = " + (this.getVides() - golpe));
                this.setVides(this.getVides() - golpe);
            }
        }else {
            System.out.println(this.getNom() + " es colpejat amb " + quantitat + " punts y es defen amb " + this.getPuntsdef() + ". La defensa es major que el atac no te efecte");
        }

    }

    public void ataca(Jugador defensor){

        System.out.println(teclat.funIO.getLinia(70));
        System.out.println("ABANS DE L'ATAC:");
        System.out.println("ATACANT: " + this);
        System.out.println("DEFENSOR: " + defensor);
        System.out.println();
        defensor.esColpejatamb(this.getPuntsatac());
        esColpejatamb(defensor.getPuntsatac());
        System.out.println();
        System.out.println("DESPRES DE L'ATAC:");
        System.out.println("ATACANT: " + this);
        System.out.println("DEFENSOR: " + defensor);
        System.out.println();
        System.out.println(teclat.funIO.getLinia(70));
    }




/// ////// EQUALS / TOSTRING/////////

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        Jugador jugador = (Jugador) o;
//        return Objects.equals(nom, jugador.nom);
        return nom.equalsIgnoreCase(jugador.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }

    @Override
    public String toString() {
        String NomEq = (equip != null) ? equip.getNom() : "sense equip";

        return  this.getNom() + " [" + NomEq + "] " +
                "(" + this.getClass().getSimpleName().toUpperCase() +
                ", PA:" + puntsatac +
                ", PD:" + puntsdef +
                ", PV:" + vides +
                ')';
    }





/// //////// CONSTRUCTORES////////////

    /// ///fase 1
//    public Jugador() {
//
//        System.out.println("soc el constructor de Jugador pero estic creant un "+ this.getClass().getSimpleName());
//    }

    public Jugador(String nom,int puntsatac,int puntsdef,int vides){
        this.nom = nom;
        this.puntsatac = puntsatac;
        this.puntsdef = puntsdef;
        this.vides = vides;

    }
    
}




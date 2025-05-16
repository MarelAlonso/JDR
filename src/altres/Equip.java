package altres;
import personatjes.Jugador;
import java.util.ArrayList;
import java.util.Objects;

public class Equip {
//////ATRIBUTS /////////////////////////////
    private String nom;
    private ArrayList<Jugador> equiplista;


// ////// GETTERS-SETTERS/////////////////////////////////////////

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    public ArrayList<Jugador> getEquiplista() {
        return equiplista;
    }

    public void setEquiplista(ArrayList<Jugador> equiplista) {
        this.equiplista = equiplista;
    }


    //////////// FUNCIONS ///////////////
    public void posa(Jugador jug){
        if (!equiplista.contains(jug)){
            equiplista.add(jug);
            jug.setEquip(this);
        }
    }

    public void lleva(String jnom){
       Jugador bot = new Jugador(jnom,0,0,0);
       int index = equiplista.indexOf(bot);

       if(index != -1){
           Jugador j = this.equiplista.get(index);
           this.equiplista.remove(index);
           j.setEquip(null);
//           equiplista.get(index).setEquip(null);
//           equiplista.remove(index);
//
       }
    }


    ////// EQUALS / TOSTRING/////////
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        Equip equip = (Equip) o;
        return nom.equalsIgnoreCase(equip.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }

    @Override
    public String toString(){

        String s = " Equip " + this.getNom()+ ":\n";

        for (Jugador j : equiplista ){
            s += "\t- " + j.toString() + "\n";
        }
        return s;
    }

    ///  CONSTRUCTORS///////////////////////
    public Equip(String nom) {
        this.nom = nom;
        this.equiplista = new ArrayList<>();
    }
}

package personatjes;

public class Alien extends Jugador {



//////////////////// METODOS ///////////////
///
@Override
public void ataca(Jugador defensor){
    if (this.getVides() > 20){
        this.setPuntsatac(this.getPuntsatac() + 3);
        this.setPuntsdef(this.getPuntsdef() - 3);
    }
    super.ataca(defensor);
}


    /// //////// CONSTRUCTORES////////////
    //    // fase 1
//    public Alien() {
//        super();
//        System.out.println("soc el constructor de alien pero estic creant un "+ this.getClass().getSimpleName());
//    }
    public Alien(String nom, int puntsatac, int puntsdef, int vides) {
        super(nom, puntsatac, puntsdef, vides);
    }
}
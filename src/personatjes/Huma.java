package personatjes;

public class Huma extends Jugador{


    /// //////// CONSTRUCTORES////////////
    // fase 1
//        public Huma() {
//        super();
//        System.out.println("soc el constructor de huma pero estic creant un " + this.getClass().getSimpleName());
//    }


    public Huma(String nom,int puntsatac,int puntsdef,int vides){
        super(nom,puntsatac,puntsdef,vides);
        //Fase 3
        if (this.getVides() > 100){
            this.setVides(100);
        }
    }


}

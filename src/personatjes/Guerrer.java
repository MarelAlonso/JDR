package personatjes;

public class Guerrer extends Huma {

//////////////////// METODOS ///////////////

    public void esColpejatamb(int quantitat){

        int golpe, golpelleu;
        golpe = quantitat - this.getPuntsdef();
        if (golpe >= 0) {
            if (golpe < 5){

                System.out.println(this.getNom() + " es colpejat amb " + quantitat +  " punts y es defen amb " + this.getPuntsdef() + ". El colp es menor que 5, degut a l'entrenament del guerrer les ferides menors a 5 punts no tenen efecte ");

            } else if((this.getVides() - golpe) <= 0) {
                System.out.println(this.getNom() +" es colpejat amb " + quantitat + " punts y es defen amb " + this.getPuntsdef() + " vides: " + this.getVides() + "-" + golpe + " = 0" );
                this.setVides(0);
            } else {
                System.out.println(this.getNom() + " es colpejat amb " + quantitat + " punts y es defen amb " + this.getPuntsdef() + " vides: " + this.getVides() + "-" + golpe + " = " + (this.getVides() - golpe));
                this.setVides(this.getVides() - golpe);
            }
        }else {
            System.out.println(this.getNom() + " es colpejat amb " + quantitat + " punts y es defen amb " + this.getPuntsdef() + ". La defensa es major que el atac no te efecte");
        }

    }

    /// //////// CONSTRUCTORES////////////
    ///
    // fase 1
//    public Guerrer() {
//        super();
//        System.out.println("soc el constructor de Guerrer pero estic creant un "+ this.getClass().getSimpleName());
//    }






    public Guerrer(String nom,int puntsatac,int puntsdef,int vides){
        super(nom,puntsatac,puntsdef,vides);

    }
}

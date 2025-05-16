package inici;
import altres.Equip;
import personatjes.Alien;
import personatjes.Guerrer;
import personatjes.Huma;
import personatjes.Jugador;
import teclat.funIO;
import java.util.ArrayList;
import java.util.Objects;

public class Jugadors {

static ArrayList<Jugador> llista = new ArrayList<>();



///////// FUNCIONS /////////

public static void menu(){

    int opcion = -1;
    while (opcion != 0) {
        opcion = funIO.lligOpcio("JUGADORS", "Crear", "Consultar", "Eliminar","Assignar a equip", "Llevar d'equip", "Assignar poder");
        switch (opcion) {
            case 0:
                System.out.println("Tornant al menu configuració");
                break;
            case 1:
                crear();
                break;
            case 2:
                consultar();
                break;
            case 3:
                eliminar();

                break;
            case 4:
                assignarEq();

                break;
            case 5:
                llevarEq();
                break;

            default:
                System.out.println("Opción no válida");
        }

    }

}

static void crear(){
    boolean fin = true;
    while (fin) {
        String raza = funIO.lligString("Selecciona el tipus de jugador que vols crear: huma(H), guerrer(G), alien(A), tornar(X) : ");
        String nomp = funIO.lligString("Quin es el nom del personatge");
        int patack = funIO.lligInt("cuants punts de atac te el personatge");
        int pdef, pvid;
        pdef = 100 - patack;
        pvid = Jugador.getVidesInicials();


        if (raza.equalsIgnoreCase("h")) {
            Jugador jugador = new Huma(nomp, patack, pdef, pvid);
            if (!llista.contains(jugador)){
                llista.add(jugador);
                System.out.println("El jugador " + nomp + " de la raza " + jugador.getClass().getSimpleName() + " ha sigut creat");
                fin = false;
            }else {
                System.out.println("el jugador "+ nomp +" ya existeix");
            }

        }else if (raza.equalsIgnoreCase("g")) {
            Jugador jugador = new Guerrer(nomp, patack, pdef, pvid);
            if (!llista.contains(jugador)) {
                llista.add(jugador);
                System.out.println("El jugador " + nomp + " de la raza " + jugador.getClass().getSimpleName() + " ha sigut creat");
                fin = false;
            }else {
                System.out.println("el jugador "+ nomp +" ya existeix");
            }
        }else if (raza.equalsIgnoreCase("a")) {
            Jugador jugador = new Alien(nomp, patack, pdef, pvid);
            if (!llista.contains(jugador)) {
                llista.add(jugador);
                System.out.println("El jugador " + nomp + " de la raza " + jugador.getClass().getSimpleName() + " ha sigut creat");
                fin = false;
          }else {
             System.out.println("el jugador "+ nomp +" ya existeix");
          }
        }else if (raza.equalsIgnoreCase("x")) {
            System.out.println("tornant al manu Configuracio");
            fin = false;
        }else {
            System.out.println("opcio no valida");
        }
      }

   }

static void consultar() {
    for (Jugador j : llista){
        System.out.println(j);
    }
}

static void eliminar() {
    String nomp = funIO.lligString("Quin es el nom del jugador que vols eliminar");
    Jugador bot = new Jugador(nomp, 0, 0, 0);
    int index = llista.indexOf(bot);

    if (index != -1) {
        Jugador jreal = llista.get(index);
        if (jreal.getEquip() != null) {
            jreal.getEquip().lleva(jreal.getNom());
        }
        llista.remove(index);
        System.out.println(nomp + " ha sigut esborrat ");
    } else {
        System.out.println("No existeix cap jugador amb el nom de " + nomp);
    }
}

static void assignarEq(){
    String nomp = funIO.lligString("Nom del personatge a equipar");
    String nome = funIO.lligString("Nom de l'equip");

    Jugador jtemp = new Jugador(nomp,0,0,0);
    Equip etemp = new Equip(nome);

    int indexj = llista.indexOf(jtemp);
    int indexe = Equips.llista.indexOf(etemp);

    if(indexj != -1 && indexe != -1) {
        Equips.llista.get(indexe).posa(llista.get(indexj));
        System.out.println("El Jugador " + llista.get(indexj).getNom() +
                " ha sigut incluit a l'equip " + Equips.llista.get(indexe).getNom());
    }else{
        System.out.println("Jugador o equip no trobat.");
        System.out.println("j: " + indexj + "e: " + indexe);
    }
}

static void llevarEq(){
    String nomp = funIO.lligString("Nom del personatge a desequipar");
    String nome = funIO.lligString("Nom de l'equip");

    Jugador jtemp = new Jugador(nomp,0,0,0);
    Equip etemp = new Equip(nome);

    int indexj = llista.indexOf(jtemp);
    int indexe = Equips.llista.indexOf(etemp);

    if(indexj != -1 && indexe != -1) {

        Equips.llista.get(indexe).lleva(nomp);
        System.out.println("El Jugador " + llista.get(indexj).getNom() +
                " ha sigut eliminat de l'equip" + Equips.llista.get(indexe).getNom());

    }else{
        System.out.println("Jugador o equip no trobat.");

    }

}

static void netejatEQ(Equip e){
    for (Jugador j : llista){
        if (j.getEquip().equals(e)){
            j.setEquip(null);
        }
    }
 }

}

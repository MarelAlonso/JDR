package inici;
import altres.Poder;
import personatjes.Jugador;
import teclat.funIO;

import java.util.ArrayList;

public class Poders {


private static ArrayList<Poder> llistapod = new ArrayList<>();


/// ///// GETTERS - SETTERS ////////////////////////////////

public static ArrayList<Poder> getLlistapod() {
    return llistapod;
}
public static void setLlistapod(ArrayList<Poder> llistapod) {
    Poders.llistapod = llistapod;
}



/// /// MENU PODERS ////////////////////////////////////
public static void menu() {
    int opcion = -1;
    while(opcion != 0){
        opcion = funIO.lligOpcio("PODERS", "Crear", "Consultar", "Eliminar");

        switch (opcion) {
            case 0:
                System.out.println("Tornant al menu PODERS\n");
                break;
            case 1:
                crearPoder();
                break;
            case 2:
                consultarPoder();
                break;
            case 3:
                eliminarPoder();
                break;
            default:
                System.out.println("opcio no valida\n");
        }
    }
}

/// ///// FUNCIONS //////////////////////////////
///
public static void crearPoder() {
    String nom = funIO.lligString("Quin es el nom del poder: ");
    int ba = funIO.lligInt("punts de atac que modifica: ");
    int bd = funIO.lligInt("punts de de defensa que modifica: ");
    Poder pod = new Poder(nom, ba, bd);
    if (!llistapod.contains(pod)) {
        llistapod.add(pod);
        System.out.println("Poder "+ nom +" afegit a la llista ");
    }
    else{
        System.out.println("Aquest poder ja existeix");
    }
}

public static void consultarPoder(){
    System.out.println("\n=LISTA DE PODERS=\n");
    for(Poder p : llistapod){
        System.out.println(p);
    }
}

public static void eliminarPoder(){


}

public static void eliminarPoders(){
    llistapod.clear();

}


/// ///////////////////////////////////////////////////////////
}

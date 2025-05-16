package inici;
import altres.Equip;
import personatjes.Jugador;
import teclat.funIO;
import java.util.ArrayList;

public class Equips {
    static ArrayList<Equip> llista = new ArrayList<>();


/// ///////// FUNCIONS //////////////
public static void menu(){

    int opcion = -1;
    while (opcion != 0) {
        opcion = funIO.lligOpcio("EQUIPS", "Crear", "Consultar", "Eliminar");
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
            default:
                System.out.println("Opción no válida");
        }
    }
}

public static void crear(){
    boolean fin = false;

    while(!fin){
        String nome = funIO.lligString("Quin es el nom del nou equip");

        Equip equip = new Equip(nome);
        if (!llista.contains(equip)){
            llista.add(equip);
        }else{
            System.out.println("Aquest equip ja existeix");
        }
        String altre = funIO.lligString("vols crear altre equip? Si(s)");
        if (!altre.equalsIgnoreCase("s")){
            System.out.println("tornant al menu ''EUQIPS''");
            fin = true;
        }
    }
}

public static void consultar(){
    for (Equip e : llista){
        System.out.println(e);
    }
}

public static void eliminar() {
    String nome = funIO.lligString("Nom del equip a eliminar");
    Equip ebot = new Equip(nome);
    int index = llista.indexOf(ebot);

    if (index != -1) {

        ebot = llista.get(index);
        ArrayList<Jugador> copiaJugadors = new ArrayList<>(ebot.getEquiplista());

        for (Jugador j : copiaJugadors) {
            j.setEquip(null); // Això pot modificar la llista original de l'equip
        }

        llista.remove(index);
//        Jugadors.netejatEQ(ebot);

        System.out.println("El equip " + nome + " ha sigut eliminat ");
    } else {
        System.out.println("No existeix cap equip amb el nom de " + nome);

    }
}
}

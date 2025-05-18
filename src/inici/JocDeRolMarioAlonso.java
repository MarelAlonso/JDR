package inici;
import altres.Poder;
import teclat.funIO;
import altres.Equip;
import personatjes.Alien;
import personatjes.Guerrer;
import personatjes.Huma;
import personatjes.Jugador;
import java.util.ArrayList;
import java.util.Random;

public class JocDeRolMarioAlonso {
    public static void main(String[] args) {

/// /// PROBES DE FASES/////////`
//    Equip eq1 = new Equip("DAM");
//    Equips.llista.add(eq1);
//
//    Jugador j1 = new Huma("marel",20,80,200);
//    Jugador j2 = new Guerrer("paco",30,70,200);
//    Jugador j3 = new Alien("josue",50,50,200);
//    Jugadors.llista.add(j1);
//    Jugadors.llista.add(j2);
//    Jugadors.llista.add(j3);

        // fase 1
//        probafase1();

        // fase 2
//        probafase2();


        // fase 3
//        probafase3();

        // fase 4
//        Equip e = new Equip ("pulpequip");
//
//        Jugador j = new Alien("josue", 10, 20, 29);
//        Jugador f = new Guerrer("marel", 5, 5, 5);
//        Jugador k = new Huma("riki", 20, 54, 1050);
//        System.out.println(f);
//        e.posa(j);
//          e.posa(f);
//        e.posa(k);
//        System.out.println(e);
//
//        e.lleva("marel");
//
//        System.out.println(e);
//        System.out.println(f);


/// ///////////////// MENU PRINCIPAL //////////////////////////////

titulo();
System.out.println("=========================");
System.out.println("Venvingut a ¡¡¡ J D R !!!");
System.out.println("=========================");

int opcion = -1;
while (opcion != 0) {
    System.out.println();
    opcion = funIO.lligOpcio("JOC DE ROL", "Configuració", "Crear dades de joc", "Jugar");

    switch (opcion) {
        case 0:
            System.out.println("Apagant consola");
            break;
        case 1:
            menuConfig();
            break;
        case 2:
            crearjugadors();
            break;
        case 3:
            jugar();
            break;
        default:
            System.out.println("Opción no válida");
    }
}

}
/// //////////////////// FUNCIONES /////////////////////

public static void crearjugadors() {

    System.out.println("\n== GENERATS EQUPS, JUGADORS i PODERS==\n");
    Equip eq1 = new Equip("LIGTH DEFENDERS");
    Equip eq2 = new Equip("DARKNESS SOLDIERS");


    Jugador j1 = new Guerrer("SORA", 70, 30, 200);
    Jugador j2 = new Huma("KAIRI", 55, 45, 200);
    Jugador j3 = new Alien("RIKU", 50, 50, 130);

    eq1.posa(j1);
    eq1.posa(j2);
    eq1.posa(j3);

    Jugador j4 = new Guerrer("HEARTLESS", 60, 40, 200);
    Jugador j5 = new Huma("ANSEM", 60, 40, 200);
    Jugador j6 = new Alien("XEMNAS", 45, 55, 130);

    eq2.posa(j4);
    eq2.posa(j5);
    eq2.posa(j6);

    Poder p1 = new Poder("Flames de l'infern", 10, 0);
    Poder p2 = new Poder("Equilibri espiritual", 5, 5);
    Poder p3 = new Poder("Enduriment fisic", 0, 10);
    Poder p4 = new Poder("Fúria assassina", 15, -5);
    Poder p5 = new Poder("Armadura inmortal", -5, 15);
    Poder p6 = new Poder("Evolució primigènia", 10, 10);

    j1.posaP(p1);
    j1.posaP(p2);
    j2.posaP(p3);
    j2.posaP(p4);
    j3.posaP(p5);
    j3.posaP(p6);
    j4.posaP(p1);
    j4.posaP(p6);
    j5.posaP(p2);
    j5.posaP(p5);
    j6.posaP(p3);
    j6.posaP(p4);

    ArrayList<Jugador> unirj = new ArrayList<>();
    ArrayList<Equip> unire = new ArrayList<>();
    ArrayList<Poder> unirp = new ArrayList<>();

    unirj.add(j1);
    unirj.add(j2);
    unirj.add(j3);
    unirj.add(j4);
    unirj.add(j5);
    unirj.add(j6);

    unire.add(eq1);
    unire.add(eq2);

    unirp.add(p1);
    unirp.add(p2);
    unirp.add(p3);
    unirp.add(p4);
    unirp.add(p5);
    unirp.add(p6);

    for (Jugador j : unirj){
        if(!Jugadors.llista.contains(j)){
            Jugadors.llista.add(j);
        }

    }
    for (Equip e : unire){
        if(!Equips.llista.contains(e)){
            Equips.llista.add(e);
        }

    }

    for (Poder p : unirp){
        if(!Poders.getLlistapod().contains(p)){
            Poders.unirpoderlist(p);
        }
    }
    unirj.clear();
    unire.clear();
    unirp.clear();
}

public static void titulo(){
    String[][] titulo = {
        {"$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$"},
        {"$"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","$"},
        {"$"," "," "," "," ","#","#"," "," ","#","#","#","#"," "," "," "," ","#","#","#","#","#"," "," "," "," ","$"},
        {"$"," "," "," "," ","#","#"," "," ","#","#","#","#","#"," "," "," ","#","#","#","#","#","#"," "," "," ","$"},
        {"$"," "," "," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," "," ","$"},
        {"$"," "," "," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," "," ","$"},
        {"$"," "," "," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#","#","#","#","#"," "," "," ","$"},
        {"$"," "," "," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#","#","#","#"," "," "," "," ","$"},
        {"$"," ","#","#"," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," ","#","#"," "," "," ","$"},
        {"$"," ","#","#","#","#","#"," "," ","#","#","#","#","#","#"," "," ","#","#"," "," "," ","#","#"," "," ","$"},
        {"$"," "," ","#","#","#"," "," "," ","#","#","#","#"," "," "," "," ","#","#"," "," "," "," ","#","#"," ","$"},
        {"$"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","$"},
        {"$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$","$"}
        };

    for (String[] strings : titulo) {
        for (String string : strings) {
            System.out.print(string);
        }
        System.out.println();
    }
    System.out.println();
    System.out.println();

}

public static void menuConfig(){
    int opcion = -1;
    while (opcion != 0) {

        opcion = funIO.lligOpcio("CONFIGURACIÓ", "Jugadors", "Equips", "poders");
        switch (opcion) {
            case 0:
                System.out.println("Tornant al menu principal");
                break;
            case 1:
                Jugadors.menu();
                break;
            case 2:
                Equips.menu();
                break;
            case 3:
                Poders.menu();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

public static void jugar(){
    System.out.println();
    System.out.println("¡¡¡¡COMENÇA LA BATALLA!!!!");
    Random dau = new Random();
    int torn = 1;

    while (Jugadors.llista.size() > 1) {
        System.out.println("Torn " + torn);
        torn += 1;
        Jugador atacant = Jugadors.llista.get(dau.nextInt(Jugadors.llista.size()));
        Jugador defensor = Jugadors.llista.get(dau.nextInt(Jugadors.llista.size()));
        while (atacant.equals(defensor)) {
            defensor = Jugadors.llista.get(dau.nextInt(Jugadors.llista.size()));
        }
        atacant.ataca(defensor);
        if (atacant.getVides() <= 0){
            System.out.println("====================\n ANUNCI DE DERROTA\n====================");
            System.out.println("El jugador atacant " + atacant + " ha sigut eliminat per que te " + atacant.getVides() + " vides i ha mort");
            eliminarmuertos(atacant.getNom());
            System.out.println("===================================================================================================================");
            System.out.println();
        }
        if (defensor.getVides() <= 0){
            System.out.println("====================\n ANUNCI DE DERROTA\n====================");
            System.out.println("El jugador defensor " + defensor + " ha sigut eliminat per que te " + defensor.getVides() + " vides i ha mort");
            eliminarmuertos(defensor.getNom());
            System.out.println("===================================================================================================================");
            System.out.println();
        }

        if (Jugadors.llista.size() == 1 ){
            Jugador guany = Jugadors.llista.getFirst();
            String nomGuany = guany.getNom();
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println("EL GUANYADOR ES: " + nomGuany + " AMB UNS RESULTATS DE:\n" + guany);
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println();
            eliminarmuertos(guany.getNom());
            Jugadors.llista.clear();
            Equips.llista.clear();
            Poders.eliminarPoders();

            break;
        }
        if (Jugadors.llista.isEmpty()){
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println("EL RESULTAT DE LA BATALLA A SIGUT UN EMPAT !!! NO HI HA GUANYADOR ¡¡¡");
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println();
            Jugadors.llista.clear();
            Equips.llista.clear();
            Poders.eliminarPoders();
            break;
        }
        if (torn >= 300){
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println("LA BATALLA A DURAT MASSA !!! NO HI HA GUANYADOR ¡¡¡");
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println();
            Jugadors.llista.clear();
            Equips.llista.clear();
            Poders.eliminarPoders();
            break;
        }
    }
}

public static void eliminarmuertos(String nomp){

    Jugador bot = new Jugador(nomp, 0, 0, 0);
    int index = Jugadors.llista.indexOf(bot);

    if (index != -1) {
        Jugador jreal = Jugadors.llista.get(index);
        if (jreal.getEquip() != null) {
            jreal.getEquip().lleva(jreal.getNom());
        }
        Jugadors.llista.remove(jreal);
        ;
    }
}

/// ////////////////////////////// pruebas de fases///////////////////////
/// //////// fase 1
//    public static void probafase1(){
//        Alien ali = new Alien();
//        Huma hum = new Huma();
//        Guerrer ger = new Guerrer();
//
//    }

        // fase 2
//public static void probafase2() {
//        Jugador paco = new Guerrer("paco",25,10,50);
//        Jugador josue = new Guerrer("josue",20,15,5);
//
//        paco.ataca(josue);
//        josue.ataca(paco);
//}


    // fase 3
//public static void probafase3() {
//    Jugador paco = new Alien("paco",25,16,30);
//    Jugador josue = new Guerrer("josue",20,17,105);
//    Jugador marel = new Huma("marel",20,15,105);
//
//
//
//    paco.ataca(josue);
//    paco.ataca(josue);
//    josue.ataca(marel);
//    marel.ataca(paco);

//}
}





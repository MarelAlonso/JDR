package inici;
import teclat.funIO;
import altres.Equip;
import personatjes.Alien;
import personatjes.Guerrer;
import personatjes.Huma;
import personatjes.Jugador;

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
        opcion = funIO.lligOpcio("JOC DE ROL", "Configuració", "Jugar");
        switch (opcion) {
            case 0:
                System.out.println("Apagant consola");
                break;
            case 1:
                menuConfig();
                break;
            case 2:
                jugar();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

}
/// //////////////////// FUNCIONES /////////////////////

public static void crearjugadors() {

    System.out.println("\n== GENERANT EQUPS I JUGADORS ==");
    Equip eq1 = new Equip("SEMI");
    Equip eq2 = new Equip("PRESENCIAL");

    Equips.llista.add(eq1);
    Equips.llista.add(eq2);


    Jugador j1 = new Guerrer("paco",90,10,200);
    Jugador j2 = new Huma("mario",60,40,200);
    Jugador j3 = new Alien("josue",50,50,130);
    Jugadors.llista.add(j1);
    Jugadors.llista.add(j2);
    Jugadors.llista.add(j3);
    eq1.posa(j1);
    eq1.posa(j2);
    eq1.posa(j3);

    Jugador j4 = new Guerrer("abdo",90,10,200);
    Jugador j5 = new Huma("ana cris",60,40,200);
    Jugador j6 = new Alien("alumne 2",50,50,130);
    Jugadors.llista.add(j4);
    Jugadors.llista.add(j5);
    Jugadors.llista.add(j6);
    eq2.posa(j4);
    eq2.posa(j5);
    eq2.posa(j6);
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
                System.out.println("COMING SOON");
//                Poders.menu();
            default:
                System.out.println("Opción no válida");
        }
    }
}

public static void jugar(){

    System.out.println("=====================================================================================");
    String elec = funIO.lligString("La partida va ha començar, vols que els personatjes es generen automaticament? si(s)\n=====================================================================================");

    if (elec.equalsIgnoreCase("s")){
        crearjugadors();
    }
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
            eliminarjug(atacant.getNom());
            System.out.println("===================================================================================================================");
            System.out.println();
        }
        if (defensor.getVides() <= 0){
            System.out.println("====================\n ANUNCI DE DERROTA\n====================");
            System.out.println("El jugador defensor " + defensor + " ha sigut eliminat per que te " + atacant.getVides() + " vides i ha mort");
            eliminarjug(defensor.getNom());
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
            Jugadors.llista.clear();
            Equips.llista.clear();

            break;
        }
        if (Jugadors.llista.isEmpty()){
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println("EL RESULTAT DE LA PARTIDA A SIGUT UN EMPAT !!! NO HI HA GUANYADOR ¡¡¡");
            System.out.println("#######################################################################");
            System.out.println("#######################################################################");
            System.out.println();
            Jugadors.llista.clear();
            Equips.llista.clear();
            break;
        }
    }

}

static void eliminarjug(String nomp) {

    Jugador bot = new Jugador(nomp, 0, 0, 0);
    int index = Jugadors.llista.indexOf(bot);

    if (index != -1) {
        Jugador jreal = Jugadors.llista.get(index);
        if (jreal.getEquip() != null) {
            jreal.getEquip().lleva(jreal.getNom());
        }
        Jugadors.llista.remove(index);
        System.out.println(nomp + " ha sigut esborrat de la partida");
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

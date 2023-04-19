//Úloha č. 2
//        Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).
//
//        Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.
//        Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.
//
//        Update programu, vylepšená verzia by mohla robiť toto:
//        Popis programu:
//        Po spustení programu vypíše jednoduché menu, kde používateľa zadá možnosť:
//        s alebo q
//        pričom písmeno s od používateľa bude žiadať zadanie strán a, b. Po zadaní týchto strán vypočíta obvod a obsah obdlžnika a zobrazí ho do konzoly. Toto bude opakovať dovtedy, kým v menu nezadáme písmeno q. Po zadaní písmena q, program ukončí svoju činnosť a vypíše Koniec programu.

        package obdlznik;

import obdlznik.Obsah.obdlznikobsah;
import obdlznik.Obvod.obdlznikobvod;


import java.util.Scanner;

public class VypObdl {

    public static int obsah(int A, int B){
        return A * B;
    }
    public static int obvod(int A, int B){
        return 2*(A+B);
    }


    public static void main(String[] args) {
        String esteRaz = "s";
        Scanner znova = new Scanner(System.in);

            while (esteRaz.equalsIgnoreCase("s")) {

                Scanner zadanieA = new Scanner(System.in);
                System.out.println("Zadaj hodnotu A:");
                int A = zadanieA.nextInt();

                Scanner zadanieB = new Scanner(System.in);
                System.out.println("Zadaj hodnotu B:");
                int B = zadanieB.nextInt();

                System.out.println("obsah obdlznika je: " + obsah(A, B));
                System.out.println("obvod obdlznika je: " + obvod(A, B));
//            obdlznikobsah.vypis();
//            obdlznikobvod.vypis();


                System.out.println("chces zadat dalsie cislo ? s/q");
                esteRaz = znova.next();

            }


        System.out.println("Koniec programu.");
    }
}

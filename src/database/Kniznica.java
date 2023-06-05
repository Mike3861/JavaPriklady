package database;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class Kniznica {
        public static void main(String[] args) {
            ArrayList<Knihaa> vsetkyKnihy = new ArrayList<Knihaa>(); // Vytvorime dynamicke pole, teda ArrayList, ktory je novy, teda prazdny
            while (true) {
                System.out.println("\n        Menu s možnosťami\n" +
                        "        -----------------\n" +
                        "        1. Zadaj novú knihu\n" +
                        "        2. Zobraz všetky knihy\n" +
                        "        3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                        "        4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                        "        5. Zobraz počet všetkých kníh\n" +
                        "        9. Vymaž všetky knihy\n" +
                        "        Koniec = skončí zadávanie novej knihy");

                Scanner sc = new Scanner(System.in); // Inicializacia skenera
                String menuPolozka = sc.nextLine();


                if (menuPolozka.equals("1")) {
                    Knihaa novaKniha = new Knihaa(); // Vytvorime objekt knihy, cize prazdnu knihu

                    System.out.println("Vybral som 1");

                    System.out.println("Zadaj názov knihy");
                    novaKniha.setNazov(sc.nextLine());
                    //String nazovKnihy = sc.nextLine(); // Pozadujeme od pouzivatela nazov knihy

                    System.out.println("Zadaj meno autora");
                    novaKniha.setAutor(sc.nextLine());
                    //String autor = sc.nextLine();

                    System.out.println("Zadaj rok vydania");
                    novaKniha.setRokVydania(String.valueOf(sc.nextInt()));
                    //int rokVydania = sc.nextInt();

                    vsetkyKnihy.add(novaKniha);

                } else if (menuPolozka.equals("2")) {
                    System.out.println("Vybral som 2");

                } else if (menuPolozka.equals("3")) {
                    try {
                        System.out.println("zadaj index knihy , ktoru ches zobrazit");
                        int indexKnihy = sc.nextInt();
                        Knihaa najdenakniha = vsetkyKnihy.get(indexKnihy - 1); // tymto zapisom sme ziskali knihu podla jeho indexu
                        System.out.println(najdenakniha);
                    }
                    catch (InputMismatchException e) {
                        System.out.println("zadal si pismeno namiesto ciselneho indexu");
                    }catch (IndexOutOfBoundsException e) {
                        System.out.println("zadal si neexistujuce cislo indexu");
                    } catch (Exception e) {
                        System.out.println("neznama chyba");
                    }


                } else if (menuPolozka.equals("4")) {
                    try {
                        System.out.println("zadaj index knihy , ktoru ches zmazat");
                        int indexKnihy = sc.nextInt();
                        Knihaa najdenakniha = vsetkyKnihy.remove(indexKnihy - 1); // tymto zapisom sme ziskali knihu podla jeho indexu
                        System.out.println("zmazala sa tato kniha");
                        System.out.println(najdenakniha);
                    }
                    catch (InputMismatchException e) {
                        System.out.println("zadal si pismeno namiesto ciselneho indexu");
                    }catch (IndexOutOfBoundsException e) {
                        System.out.println("zadal si neexistujuce cislo indexu");
                    } catch (Exception e) {
                        System.out.println("neznama chyba");
                    }


                } else if (menuPolozka.equalsIgnoreCase("koniec")) {
                    break; // Prerusi cyklus while(true)
                } else {
                    System.out.println("Nevybral si ani jednu správnu odpoveď");
                }
            }

       /*
        System.out.println("\nTeraz vypisujem odpoveď cez SWITCH, CASE");
        switch (menuPolozka) {
            case "1":
                System.out.println("Vybral som 1");
                System.out.println("Ďakujem za výber");
                break;
            case "2":
                System.out.println("Vybral som 2");
                break;
            default:
                System.out.println("Nevybral si ani jednu správnu odpoveď");
        }

        // Konvertor slovnej znamky na ciselnu
        String znamka = "pat";
        switch (znamka) {
            case "päť":
            case "pat":
                System.out.println("Známka je po konverzii 5");

        }*/


        }
    }


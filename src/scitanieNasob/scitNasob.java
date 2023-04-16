/*
Úloha na opakovanie: Premenné, cykly a jednoduchý algoritmus na súčet
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.

        Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.
        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu nasob(), ktorá bude násobiť dané čísla.*/

package scitanieNasob;

public class scitNasob {

    public static int scitaj(int cisla[]) {
        int sum = 0;
        for (int cislo : cisla) {
            sum += cislo; // Je to identicka logika scitania ako pri riadku vyssie
        }
        return sum;
    }

    public static int nasob(int cisla[]) {
        int nasob = 1;
        for (int cislo : cisla) {
            nasob *= cislo; // Je to identicka logika scitania ako pri riadku vyssie
        }
        return nasob;
    }


    public static void main(String[] args) {
        int cisla[] = {1, 8, 9, 10, 12};

        System.out.println("Výsledok sčítania je: " + scitaj(cisla));
        System.out.println("Výsledok násobenia je: " + nasob(cisla));

    }
}
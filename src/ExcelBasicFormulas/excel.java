//
//Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE,
//        ktoré budú počítať súčet (getSum) , resp. priemer hodnôt (getAverage).
//        Vstup hodnôt bude cez premenné, napr. value1 a value2.



package ExcelBasicFormulas;

import java.util.Scanner;

public class excel {
    public static void main(String[] args) {
         int cislo1;
         int cislo2;
        Scanner value1 = new Scanner(System.in);
        System.out.println("zadaj prve cislo: ");
         cislo1 = value1.nextInt();

        Scanner value2 = new Scanner(System.in);
        System.out.println("zadaj druhe cislo: ");
        cislo2 = value2.nextInt();

        int priemer = (cislo1+cislo2)/2;

        System.out.println("scitanie tychto tychto dvoch cisiel je: " + Integer.sum(cislo1,cislo2));
        System.out.println("priemer tychto tychto dvoch cisiel je: " + priemer );
        System.out.println("maximalne cislo je: " + Math.max(cislo1,cislo2));
        System.out.println("minimalne cislo je: " + Math.min(cislo1,cislo2));
        System.out.println("pocet zadanych cisel:");

//         TODO
//        count +pravme metódy tak, že bude dané funkcie počítať z ľubovoľného množstva čísel.






    }
}

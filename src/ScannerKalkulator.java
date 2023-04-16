import java.util.Scanner;  // Import the Scanner class

class ScannerKalkulator {
    public static void main(String[] args) {
        Scanner plnyP = new Scanner(System.in);
        System.out.println("zadaj plný počet testu: ");
        double plnyPocet = plnyP.nextDouble();

        Scanner dosiahnuteB = new Scanner(System.in);
        System.out.println("zadaj tvoje dosiahnute body: ");
        double dosiahnuteBody = dosiahnuteB.nextDouble();

        double vypocet = dosiahnuteBody* 100 / plnyPocet;
        vypocet = Math.round(vypocet);

        System.out.println("tvoje dosiahnute percenta:" + vypocet + "%");


        if (vypocet >= 90) {
            System.out.println("tvoja znamka je A");

        } else if (vypocet >= 75) {
            System.out.println("tvoja znamka je B");

        } else if (vypocet >= 65) {
            System.out.println("tvoja znamka je C");

        } else if (vypocet>=50){
                System.out.println("tvoja znamka je D");

        } else if (vypocet <49) {
                System.out.println("test si zvládol NEÚSPEŠNE!");
            }
    }

        }



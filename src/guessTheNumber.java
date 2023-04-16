

import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        int odpoved;
        int maxC;
        int pokusy;
        String hratZnovu = "ano";

        Scanner hratZ = new Scanner(System.in);
            System.out.println("zahraj si somnnou , budes musiet uhadnut cislo na ktore myslim" +
                "\nked sa pomilis stratis zivot" + " , dokopy mas 5 zivotov.");

        while (hratZnovu.equalsIgnoreCase("ano")) {

            pokusy = 5;
            Scanner max = new Scanner(System.in);
            System.out.println("povedz mi maximalne cislo do ktoreho budeme hrat");
            maxC = max.nextInt();

            odpoved = (int) (Math.random() * maxC) + 1;

            while (pokusy > 0) {

                Scanner hadaj = new Scanner(System.in);
                System.out.println("Dobre , na ake cislo myslim ?");
                int vstupHadaj = hadaj.nextInt();

                if (vstupHadaj == odpoved) {
                    System.out.println("uhadol si moje cislo , vyhral si !");
                    break;
                } else if (vstupHadaj > odpoved) {
                    System.out.println("skus trosku nizsie , stratil si jeden zivot.\nostavaju ti " + (pokusy - 1) + " zivoty.");
                } else {
                    System.out.println("skus trosku vysie, stratil si jeden zivot.\nostavaju ti " + (pokusy - 1) + " zivoty.");
                }
                pokusy--;

                if (pokusy == 0) {
                    System.out.println("moje cislo bolo " + odpoved + " hra sa tu končí.");
                    break;
                }
            }
            System.out.println("chces si znova zahrat ?(ano/nie)");
            hratZnovu = hratZ.next();
        }
        System.out.println("Dakujem ze si somnou hral");
        }
}



import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("zadaj cisla:");
        Scanner scn = new Scanner(System.in);
        String vstupneHodnoty = scn.nextLine();
        System.out.println("zadane hodnoty su: " + vstupneHodnoty);

        String[] poleHodnot = vstupneHodnoty.split(" ");


        for (int i = 0; i < poleHodnot.length; i++) {
            String individualnaHodnota = poleHodnot[i];
            int hodnota = Integer.parseInt(individualnaHodnota);

            if (hodnota % 15 == 0 ) {
                System.out.print("Fizz Buzz");
            } else if (hodnota % 3 == 0) {
                System.out.print("Fizz ");
            } else if (hodnota % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(hodnota);
            }
            System.out.print(" ");

        }

    }
}
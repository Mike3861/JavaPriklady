
import java.util.Scanner;

public class hodnotenie {
    public static void main(String[] args) {

        String vyb = "výborný";
        String chv = "chválitebný";
        String dob = "dobrý";
        String dos = "dostatočný";
        String ned = "nedostatočný";
        String ukonecenie = "ano";
        Scanner ukonc = new Scanner(System.in);

        System.out.println("zadaj tvoje hodnotenie:výborný, chválitebný, dobrý, dostatočný, nedostatočný");
        Scanner prikaz = new Scanner(System.in);
        String vstup = prikaz.next();


        while (ukonecenie.equalsIgnoreCase("ano")) {
            if (prikaz.equals(vyb)) {
                System.out.println("tvoja znamka je 1");
            } else if (prikaz.equals(chv)) {
                System.out.println("tvoja znamka je 2");
            } else if (prikaz.equals(dob)) {
                System.out.println("tvoja znamka je 3");
            } else if (prikaz.equals(dos)) {
                System.out.println("tvoja znamka je 4");
            } else if (prikaz.equals(ned)) {
                System.out.println("tvoja znamka je 5");
            }
            System.out.println("ak ches ukoncit tento program napis ano)");
            ukonecenie = ukonc.next();


        }

    }}


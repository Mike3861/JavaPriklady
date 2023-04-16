import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {
        Scanner vstupS = new Scanner(System.in);
        System.out.println("zadaj tvoje slova:");
        String vstupSlov = vstupS.nextLine();
                int citac = vstupSlov.split("\\s").length;
                    System.out.println("tvoj pocet slov: " + citac);









    }
}

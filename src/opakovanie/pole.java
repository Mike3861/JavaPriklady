package opakovanie;

public class pole {
    public static void main(String[] args) {

        int [] cisla = { 2, 7, 12, 5, 8, 11, 0 };
        System.out.println("cisla delitelne dvoma/parne:");
        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] % 2 == 0) {
                System.out.print(cisla[i]+ " " );
            }

        }
        System.out.println("\ncisla nedelitelne dvoma/neparne:");
        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] % 2 != 0) {
                System.out.print(cisla[i]+ " ");
            }
        }
    }
}
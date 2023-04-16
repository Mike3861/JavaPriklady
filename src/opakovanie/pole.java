package opakovanie;

public class pole {
    public static void main(String[] args) {

        int[] cisla = { 2, 7, 12, 5, 8, 11, 0 };
        System.out.println("____________________________");
        System.out.println("cisla delitelne dvoma/parne:");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] % 2 == 0) {
                System.out.print(cisla[i]+ " ");
            }

        }
        System.out.println("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("\ncisla nedelitelne dvoma/neparne:");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] % 2 != 0) {
                System.out.print(cisla[i]+ " ");
            }
        }
    }
}
package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayUloha2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ano  = scn.nextLine();

        ArrayList<Integer> znackyAut = new ArrayList<Integer>();
        znackyAut.add(5);
        znackyAut.add(16);
        znackyAut.add(6);

        for (Integer cisla : znackyAut){
            System.out.println(cisla);
        }
    }
}

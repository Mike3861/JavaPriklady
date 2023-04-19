package nasobky;

public class nasobok {

    public static void main(String[] args) {
        int j = 1;
        for (int i = 1; i <=16384 ; i=i*2) {
            System.out.print(i + " ");
            if (j % 5 == 0) System.out.println();  // pocidatlo miest po 5
            j++;
        }

    }

}

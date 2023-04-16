package Continue;

public class CoNtinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) continue;
            if (i == 7) System.exit(i);
            System.out.println(i);

        }

    }
}

import java.text.SimpleDateFormat;
import java.util.Date;
// https://docs.google.com/document/d/1U4nRyk3-BK-_-QL7Gtr-l9A1NNQcFbmeVfjfNkdYvWw/edit
public class Zadanie1 {
    public static void main(String[] args) {
        String datumNarodenia = "03.04.2000";
        float znamka = 1.5f;
        String formatString = String.format("%,.1f", znamka);
        String aktualnyDatum = "18.06.2022";
        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(formatDatumu.format(datum));


        System.out.println("Student Jozef Mrkvicka sa narodil "+ datumNarodenia+" z maturitnej skusky ma znamku "+formatString+
                " a\nod septembra 2022 nastúpi do nového zamestnania ako Java programátor.\nV Bratislave v Dna "
                +formatDatumu.format(datum));


    }
}

public class zaanie2Metody {
    static double plus(double cislo1, double cislo2) {
        return cislo1 + cislo2;
    }
    static double minus(double cislo1, double cislo2) {
        return cislo1 - cislo2;
    }
    static double nas(double cislo1 , double cislo2){
        return cislo1 * cislo2;
    }
    static double del(double cislo1 , double cislo2){
        return cislo1 / cislo2;
    }
    public static void main(String[] args) {

    double cislo1= 2;
    double cislo2= 5;

    System.out.printf("\nVýsledkom sčítania  hodnôt 2 a 5 je: %.1f " , + plus(cislo1,cislo2));
    System.out.printf("\nVýsledkom odčítania hodnôt 2 a 5 je: %.1f " , + minus(cislo1,cislo2));
    System.out.printf("\nVýsledkom nasobenia hodnôt 2 a 5 je: %.1f " , + nas(cislo1,cislo2));
    System.out.printf("\nVýsledkom delenia hodnôt 2 a 5 je: %.1f " , + del(cislo1,cislo2));
}


}



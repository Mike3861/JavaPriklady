package sk.tmconsulting.pozdravy.rozhranie;

public class Klienta implements Iklient{
    private String meno;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPirezvisko() {
        return pirezvisko;
    }

    public void setPirezvisko(String pirezvisko) {
        this.pirezvisko = pirezvisko;
    }

    private String pirezvisko;

    @Override
    public int akoCastoNAvstevujeDanuSluzbu() {
        return 0;
    }

    @Override
    public boolean jePocitacovoGramotny() {
        return false;
    }
}

package database;

public class Knihaa {


private String nazov;

private String autor;
private String Zaner;
private String Vydavatelstvo;
private String rokVydania;
private int pocetStran;

public String GetNazov(){
    return nazov;
}
public void  setNazov(String nazov){
    this.nazov = nazov;
}
public  String getAutor(){
    return autor;
}
public void setAutor(String autor){
    this.autor = autor;
}
public String setZaner(){
    return Zaner;
}
public  void getZaner(String Zaner){
    this.Zaner = Zaner;
}
public String setVydavatelstvo(){
    return Vydavatelstvo;
}
public void getVydavatelstvo(){
    this.Vydavatelstvo = Vydavatelstvo;
}
public String setRokVyania(){
    return rokVydania;
}
public void setRokVydania(String rokVydania){
    this.rokVydania=rokVydania;
}
public int getPocetStran(){
    return pocetStran;
}
public void setPocetStran(int pocetStran){
    this.pocetStran= pocetStran;
}
public Knihaa(){
}
public Knihaa(String nazov, String autor, String zaner,String vydavatelstvo,int pocetStran){
    this.nazov=nazov;
    this.autor=autor;
    this.Zaner=zaner;
    this.Vydavatelstvo=vydavatelstvo ;
    this.pocetStran=pocetStran;
    this.rokVydania =setRokVyania();
}



}
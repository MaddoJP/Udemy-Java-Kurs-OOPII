public abstract class Auto {

    // Eigenschaften
    String marke;
    int ps;
    int tuerenAnzahl;
    String fahrzeugTyp;


    // Konstuktoren
    public Auto(String marke, int ps, int tuerenAnzahl, String fahrzeugTyp) {
        super();
        this.marke = marke;
        this.ps = ps;
        this.tuerenAnzahl = tuerenAnzahl;
        this.fahrzeugTyp = fahrzeugTyp;
    }

    // Methoden
    public void starten(){
        System.out.println("Das Auto: "+this.marke +" startet!");
    }

    public abstract void bremsen();
}

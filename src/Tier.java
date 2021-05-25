public class Tier {

    // Eigenschaften / Attribute

    String name;
    int gewicht;
    int groesse;

    // Kontruktoren

    public Tier(String name, int gewicht, int groesse){
        this.name = name;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    // Methoden

    public void essen(){
        System.out.println("Das Tier hat gegessen");
    }


}
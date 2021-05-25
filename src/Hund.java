public class Hund extends Tier {

    // Eigenschaften / Attribute
    int zaehne;

    // Kontruktoren

    public Hund(String name, int gewicht, int groesse, int zaehne){
        super(name, gewicht, groesse);
        this.zaehne = zaehne;
    }

    // Methoden
    public void bellen(){

    }

    @Override
    public void essen(){
        System.out.println("Der Hund muss sein essen noch kauen");
        super.essen();
    }

}

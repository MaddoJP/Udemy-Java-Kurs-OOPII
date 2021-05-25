public class Kuh extends Tier{

    // Eigenschaften / Attribute
    int hufe;
    // Kontruktoren

    public Kuh(String name, int gewicht, int groesse, int hufe){
        super(name, gewicht, groesse);
        this.hufe = hufe;

    }

    // Methoden

    @Override
    public void essen() {
        super.essen();
        System.out.println("Die Kuh muss das Essen immer wieder kauen");
    }
}


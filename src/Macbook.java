public class Macbook extends Laptop{

    boolean touchBar;

    public Macbook(String marke, int ram, String cpu, double preis, boolean touchBar) {
        super(marke, ram, cpu, preis);
        this.touchBar = touchBar;
    }

    @Override
    public void starten() {
        super.starten();
        System.out.println("Macbook startet");
    }
}

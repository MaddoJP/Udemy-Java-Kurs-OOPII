import javax.crypto.Mac;

public class Main {

    public static void main(String[] args) {
//        Hund bello = new Hund();
//        bello.name = "Bello";
//        Kuh olga= new Kuh();
//        olga.name = "Olga";
        Hund bello = new Hund("Bello",15, 20,42);
        bello.essen();
        Kuh olga = new Kuh("Olga", 30, 120, 4);
        olga.essen();

        BMW x1 = new BMW(230, 5, "SUV", true);
        x1.starten();

        Audi a3 = new Audi(300, 5, "Limousine", false);
        a3.starten();

        Macbook macBook = new Macbook("Apple", 8, "Intel i5", 1200, true);
        macBook.starten();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class BitsAndBytesKassePrototyp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> preiseListe = new ArrayList<>();
        double summe = 0;

        System.out.print("Preis eingeben (0 beendet): ");
        double preis = sc.nextDouble(); // Problem: wird nur einmal gelesen

        if (preis != 0) {
            preiseListe.add(preis);
            summe += preis;
        }

        // SOLL: Export in ein Array (z.B. Schnittstelle)
        double[] preiseArray = new double[preiseListe.size()];
        for (int i = 0; i < preiseListe.size(); i++) {
            preiseArray[i] = preiseListe.get(i);
        }

        System.out.println("Artikel: " + preiseListe.size());
        System.out.println("Summe: " + summe);
        sc.close();
    }
}
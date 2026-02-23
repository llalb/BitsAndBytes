import java.util.ArrayList;
import java.util.Scanner;

public class BitsAndBytesKassePrototyp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> preiseListe = new ArrayList<Double>();
        double summe = 0;

        System.out.println("Preis eingeben (0 beendet):");
        
            double preis = sc.nextDouble();
            
            while (true) {
                if (preis == 0) {
                    break;
                }

                System.out.println("Aktueller Gesamtpreis: " + (preis + summe));

                if (!sc.hasNextDouble() || preis < 0) {
                    sc.next();
                    System.out.println("Ungültige Eingabe!\n" +
                    "Bitte geben Sie nur positive Zahlen ein!");
                    System.out.println("Preis eingeben (0 beendet):");
                    continue;
                }
                preiseListe.add(preis);
                summe += preis;
                preis = sc.nextDouble();
        }
     

        // SOLL: Export in ein Array (z.B. Schnittstelle)
        double[] preiseArray = new double[preiseListe.size()];
        for (int i = 0; i < preiseListe.size(); i++) {
            preiseArray[i] = preiseListe.get(i);
        }

        System.out.println("Artikel: " + preiseListe.size());
        System.out.println("Summe: " + summe);
        System.out.println("Durchschnitt: " + (summe / preiseListe.size()));

        sc.nextLine(); 
        
        System.out.println("Schreiben Sie [y] um die Quittung auszugeben.\n" +
        "Andernfalls drücken Sie eine andere Taste um den Vorgang abzuschließen.");
        String Quittung = sc.nextLine();
        
        if (Quittung.equals("y")) {
            System.out.println("Ihr Einkauf:\n" + preiseListe);
        } else {
            System.out.println("Vielen Dank für Ihren Einkauf!");
        }
        sc.close();
    }
}
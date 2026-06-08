import entities.es1.Array;
import entities.es2.Auto;
import entities.es3.ContoCorrente;
import entities.es3.ContoOnLine;
import exceptions.es3.BancaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        esercizio1(scanner);
        esercizio2(scanner);
        esercizio3(scanner);


        scanner.close();
    }
    static void esercizio1(Scanner scanner) {
        Array array = new Array(10);
        array.fillRandom();
        array.print();
        int valore;
        do {
            System.out.print("Inserisci un valore (0 per uscire): ");
            valore = scanner.nextInt();
            if (valore != 0) {
                System.out.print("Inserisci la posizione: ");
                int posizione = scanner.nextInt();
                try {
                    array.set(posizione, valore);
                    array.print();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Errore: posizione non valida!");
                }
            }
        } while (valore != 0);
    }
    static void esercizio2(Scanner scanner) {
        Auto auto = new Auto(100, 10);
    }
    static void esercizio3(Scanner scanner) {};
}

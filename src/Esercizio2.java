import java.util.Scanner;

public class Esercizio2 {

    /* Dato un numero, stampare true se il numero è pari, false altrimenti. */
    public static void main(String[] args) {
        System.out.println("Ciao! Scrivi un numero intero e ti dico se sia pari o dispari: ");
        Scanner input = new Scanner(System.in);
        double next = input.nextDouble();
        System.out.println(next % 2);
        if (next % 2 == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

}

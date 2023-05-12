import java.util.Scanner;

public class Esercizio1 {

    /*
    Scrivere un programma Java che permetta all’utente di inserire due numeri interi e,
    successivamente, stampi a video il risultato di addizione, sottrazione, moltiplicazione e divisione
    tra i due numeri.
     */
    public static void main(String[] args) {
        System.out.println("Benvenuto! Inserisci due numeri interi: ");
        // creo un oggetto di tipo scanner per leggere l'input da tastiera
        Scanner input = new Scanner(System.in);
        // dichiaro una variabile di tipo intero e gli assegno il prossimo valore passato allo scanner
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        // eseguo la somma
        int somma = number1 + number2;
        System.out.println("La somma dei due numeri è: " + somma);
        int sottrazione = number1 - number2;
        System.out.println("La sottrazione tra i due numeri è: " + sottrazione);
        int moltiplicazione = number1 * number2;
        System.out.println("Il risultato della moltiplicazione è: " + moltiplicazione);
        double dividendo = number1;
        double divisore = number2;
        while (divisore == 0) {
            System.out.println("non puoi dividere per 0! Inserisci un nuovo valore");
            divisore = input.nextDouble();
        }
        System.out.println("Il risultato della divisione è: " + (dividendo / divisore));
    }

}

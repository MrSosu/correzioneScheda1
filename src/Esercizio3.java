import java.util.Arrays;
import java.util.Scanner;

public class Esercizio3 {

    /*
    Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal primo spazio,
    ad esempio data la stringa «come stai» stampare a video «stai come». Potete dare per assunto
    che la stringa conterrà sempre un solo spazio.
    Suggerimento: utilizzate i metodi della classe String
     */
    public static void main(String[] args) {
        System.out.println("Ciao! Inserisci una stringa con due parole e te la inverto.");
        // creo lo Scanner per chiedere la stringa
        Scanner input = new Scanner(System.in);
        // prendo la stringa
        String stringa = input.nextLine();
        // la suddivido in base allo spazio con split
        String[] stringa_split = stringa.split(" ");
        // costruisco la stringa invertita grazie all'array tornato dallo split
        String invertita = stringa_split[1] + " " + stringa_split[0];
        System.out.println("La stringa invertita è: " + invertita);
    }

}

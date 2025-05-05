import java.util.Scanner;

public class Esercizio2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa:");
        String s1 = input.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String s2 = input.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String s3 = input.nextLine();



        String normale = s1 + s2 + s3;
        System.out.println("Concatenazione normale: " + normale);
        String inverso = s3 + s2 + s1;
        System.out.println("Concatenazione inversa: " + inverso);
    }

    }

import java.util.Scanner;

public class Esercizio3 {
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }
    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }
    public static double perimetroTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2; // semiperimetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // formula di Erone
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo lato del rettangolo:");
        double lato1 = input.nextDouble();

        System.out.println("Inserisci il secondo lato del rettangolo");
        double lato2 = input.nextDouble();

        double perimetroRett = perimetroRettangolo(lato1, lato2);
        System.out.println("Perimetro del rettangolo: " + perimetroRett);

        System.out.println("Inserisci un numero intero:");
        int numero = input.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Risultato pariDispari: " + risultatoPariDispari);

        System.out.println("Inserisci il primo lato del triangolo:");
        double latoA = input.nextDouble();

        System.out.println("Inserisci il secondo lato del triangolo:");
        double latoB = input.nextDouble();

        System.out.println("Inserisci il terzo lato del triangolo:");
        double latoC = input.nextDouble();

        double area = perimetroTriangolo(latoA, latoB, latoC);
        System.out.println("Area del triangolo: " + area);
    }
}

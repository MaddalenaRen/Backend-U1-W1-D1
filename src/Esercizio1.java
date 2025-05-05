public class Esercizio1 {
    public static int moltiplica (int a, int b){
        return a*b;
    }
    public static String concatena (String testo, int num) {
        return testo+num;

    }
    public static String[] inserisciInArray (String[] arrayIniziale, String nuovaStringa) {
        String[] nuovoArray = new String[6];
        nuovoArray[0] = arrayIniziale[0];
        nuovoArray[1] = arrayIniziale[1];
        nuovoArray[2] = nuovaStringa;
        nuovoArray[3] = arrayIniziale[2];
        nuovoArray[4] = arrayIniziale[3];
        nuovoArray[5] = arrayIniziale[4];
        return nuovoArray;
    }

    public static void main(String[] args) {
        int prodotto = moltiplica(2, 3);
        System.out.println("Risultato moltiplica: " + prodotto);

        String risultato = concatena("Elemento", 7);
        System.out.println("Risultato concatena: " + risultato);

        String[] arr = {"a", "b", "c", "d", "e"};
        String[] nuovoArr = inserisciInArray(arr, "X");

        System.out.println("Nuovo array:");
        System.out.println(nuovoArr[0]);
        System.out.println(nuovoArr[1]);
        System.out.println(nuovoArr[2]);
        System.out.println(nuovoArr[3]);
        System.out.println(nuovoArr[4]);
        System.out.println(nuovoArr[5]);
    }

}

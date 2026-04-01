public class For_5 {
    public static void main(String[] args) {
        
        // Leerzeile vor dem Zahlenblock
        System.out.println();
        
        // äußere Schleife
        for (int i = 1; i <= 9; i=i+1) {
            System.out.print(i + ": "); // Ausgabe der Zeilennummer
            
            // innere Schleife
            for (int j = 1; j <= 9; j=j+1) {
                System.out.print(j); // Ausgabe der Zahlen 1 bis 9
            }
            
            // Zeilenumbruch nach jeder Zeile
            System.out.println();
        }

        // Leerzeile nach dem Zahlenblock
        System.out.println();
    }
}

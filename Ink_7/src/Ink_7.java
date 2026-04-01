
class Ink_7 {
    public static void main(String[] args) {
        System.out.println(); // Leerzeile vor der Ausgabe

        // Äußere Schleife: steuert die Zeilen
        for (int i = 1; i <= 9; i++) {

            // Schleife für Leerzeichen
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }

            // Schleife für Ziffern
            for (int k = 1; k <= i; k = k + 1) {
                System.out.print(i);
            }

            System.out.println(); // Zeilenumbruch nach jeder Zeile
        }

        System.out.println(); // Leerzeile nach der Ausgabe
    }
}

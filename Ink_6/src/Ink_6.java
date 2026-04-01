class Ink_6 {
    public static void main(String[] args) {
        System.out.println(); // Leerzeile vor der Ausgabe

        // Äußere Schleife: steuert die Zeilen
        for (int i = 1; i <= 9; i++) {
            
            // Innere Schleife: hängt von der äußeren ab
            for (int j = 1; j <= i; j++) {  // Abhängigkeit: j <= i
                System.out.print(i);              // i wird mehrfach ausgegeben
            }

            System.out.println(); // Zeilenumbruch nach jeder inneren Schleife
        }

        System.out.println(); // Leerzeile nach der Ausgabe
    }
}
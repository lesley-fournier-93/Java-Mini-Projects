class Einmaleins_Ink {
    public static void main(String[] args) {

        // Kopfzeile
        System.out.print("\t|\t");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // gestrichelte Linie
        for (int strich = 1; strich <= 82; strich++) {
            System.out.print("-");
        }
        System.out.println();

        // Einmaleins-Tabelle
        for (int a = 1; a <= 9; a++) {
            System.out.print(a + "\t|\t");
            for (int b = 1; b <= 9; b++) {
                System.out.print((a * b) + "\t");
            }
            System.out.println();
        }
    }
}

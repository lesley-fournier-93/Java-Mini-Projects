
class Betrag_If {
    public static void main(String[] args) {
        int a, betrag;

        // Fall 1: a = 5
        a = 5;
        betrag = 0;
        if (a >= 0) {               // einseitig bedingt
            betrag = a;
        }
        if (a < 0) {                // unabhängige zweite einseitige
            betrag = -a;
        }
        System.out.println("Der Betrag von " + a + " ist " + betrag);

        // Fall 2: a = -5
        a = -5;
        betrag = 0;
        if (a >= 0) {
            betrag = a;
        }
        if (a < 0) {
            betrag = -a;
        }
        System.out.println("Der Betrag von " + a + " ist " + betrag);
    }
}


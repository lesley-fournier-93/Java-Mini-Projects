
class BetragElse {
    public static void main(String[] args) {
        printBetrag(5);
        printBetrag(-5);
    }

    static void printBetrag(int a) {
        int betrag;
        if (a >= 0) {       // if-Block
            betrag = a;
        } else {            // else-Block (Negation des if-Zweigs)
            betrag = -a;
        }
        System.out.println("Der Betrag von " + a + " ist " + betrag);
    }
}



public class If_3 {

    public static void main(String[] args) {

        int a = -5, betrag; // a ist größer, kleiner oder gleich Null

        if (a >= 0)
            betrag = a;
        else
            betrag = -a;

        System.out.println("Der Betrag von " + a + " ist " + betrag);
    }
}

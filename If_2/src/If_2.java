
public class If_2 {

    public static void main(String[] args) {

        int a, b = 10, c = 0; // c kann Null sein oder auch nicht

        if (c == 0) {
            System.out.println("Fehler!");
            System.out.println("Es wird versucht, durch Null zu dividieren!");
        } 
        else {
            a = b / c;
            System.out.println("Die Division von " + b + " durch " + c + " ergibt " + a);
        }
    }
}


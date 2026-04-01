
public class ZerfallDo {

    public static void main(String[] args) {

        double startWert = 1.0,
               grenzWert = 0.1;

        double aktuWert = startWert;
        int hwz = 0;

        System.out.println("Sei eine radioaktive Substanz mit Startwert " + startWert);
        System.out.println("gegeben sowie ein Grenzwert von " + grenzWert + ".");
        System.out.println("Wie viele Halbwertszeiten müssen vergehen,");
        System.out.println("bis die Menge kleiner als der Grenzwert ist?\n");

        
        if (startWert < grenzWert) {
            System.out.println("Der Startwert ist bereits kleiner als der Grenzwert.");
            System.out.println("Es werden keine Halbwertszeiten benötigt.");
        } else {

            do {
                System.out.println("Nach " + hwz + " HWZ: " + aktuWert);
                aktuWert = aktuWert / 2.0; // Halbierung
                hwz++;
            } while (aktuWert >= grenzWert);

            System.out.println("\nEin Startwert von " + startWert);
            System.out.println("unterschreitet den Grenzwert " + grenzWert);
            System.out.println("nach " + hwz + " Halbwertszeiten mit der Menge " + aktuWert + ".");
        }
    }
}

/*
 * Übung zur while- bzw. do-while-Schleife
 * 1. Version mit while-Schleife
 */

public class ZerfallWhile {

	public static void main(String[] args) {
		double startWert = 1.0,
			   grenzWert = 0.1;
		// *********************
		double aktuWert = startWert;
		int hwz = 0;

		System.out.println
		("Wie viele Halbwertszeiten müssen vergehen,");
		System.out.println
		("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger übrig ist als der Grenzwert "+grenzWert+"?\n");
		
		while (aktuWert >= grenzWert) {
			System.out.println("Nach "+hwz+" HWZs: "+aktuWert);
			aktuWert /= 2.0;	// Halbierung
			hwz++;
		}
		
		System.out.println
		("\nEs müssen "+hwz+" Halbwertszeiten vergehen,");
		System.out.println
		("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger übrig ist als der Grenzwert "+grenzWert+",");
		System.out.println("nämlich "+aktuWert+".");
	}

}

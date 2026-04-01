/*
 * Übung zur while- bzw. do-while-Schleife
 * 2. Version als Zwischenschritt zur do-while-Schleife:
 * Ist schon von vorne herein der Startwert kleiner als der Grenzwert,
 * erfolgt in bisheriger Version eine unschöne Ausgabe:
 * Die Berechnung bleibt leer
 * u. die Anwort lautet: "Es müssen 0 HWZs vergehen..."
 * Wunsch: Für den Sonderfall soll die Berechnung
 * u. die bisherige Antwort nicht betreten werden,
 * sondern es soll eine spezielle Meldung erfolgen.
 * Dies erreiche ich durch eine Verzweigung:
 * Fall a) Es gibt etwas zu tun
 * Fall b) Nicht!
 */

public class ZerfallZwischen {

	public static void main(String[] args) {
		double startWert = 0.001,
			   grenzWert = 0.1;
		// *********************
		double aktuWert = startWert;
		int hwz = 0;

	// 1. Frage
		System.out.println
		("Wie viele Halbwertszeiten müssen vergehen,");
		System.out.println
		("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger übrig ist als der Grenzwert "+grenzWert+"?\n");
	
	// Verzweigung: gibt es etwas zu tun oder nicht?
		
		if (aktuWert >= grenzWert) {	// Fall a: Es gibt etwas zu tun
		
				// 2. Berechnung
					while (aktuWert >= grenzWert) {
						System.out.println("Nach "+hwz+" HWZs: "+aktuWert);
						aktuWert /= 2.0;	// Halbierung
						hwz++;
					}
				
				// 3. Antwort
					System.out.println
					("\nEs müssen "+hwz+" Halbwertszeiten vergehen,");
					System.out.println
					("bis von einer Substanz der Menge "+startWert);
					System.out.println
					("nur noch weniger übrig ist als der Grenzwert "+grenzWert+",");
					System.out.println("nämlich "+aktuWert+".");
		
		} else		// Fall b: es gibt nichts zu tun:
			
			System.out.println
			("Schon von vorne herein liegt der Startwert unter dem Grenzwert!");
		
	}

}

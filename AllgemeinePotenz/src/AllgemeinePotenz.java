/*
 * Beispiel für die Infix-Notation:
 * Berechnung der allgemeinen Potenz:
 * basis hoch expo
 * als Verallgemeinerung der Zweierpotenz
 * Weil diese Mal zwei Anweisungen
 * im Block der for-Schleife stehen,
 * müssen die geschweiften Klammern darum
 * gesetzt werden
 */

public class AllgemeinePotenz {

	public static void main(String[] args) {
		int basis = 3, expo = 5;
		// **********************
		int ergebnis = 1;
		
		for (int i=1; i<=expo; i++) { 		// i:1..expo
			ergebnis *= basis;	// Infix-Notation
			System.out.println
			(basis+" hoch "+i+" = "+ergebnis);
		}
	}
}

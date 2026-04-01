/*
 * Übung zur Infixnotation, zum Verbundoperator
 * Berechnung von Zweierpotenzen
 * bei gegebenem n
 */

public class Zweierpotenz {

	public static void main(String[] args) {
		int n = 8;
		// **********
		int ergebnis = 1;

		for (int i=1; i<=n; i++)		// i:1..n: n mal
			//ergebnis = ergebnis * 2;	alte Schreibweise
			ergebnis *= 2;	// Infix-Notation
		
		System.out.println
		("2 hoch "+n+" ist "+ergebnis);
	}

}

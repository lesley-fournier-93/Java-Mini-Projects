/*
 * 3. Version der Fakultätsberechnung:
 * Methode mit Rückgabewert
 * Vorteil:
 * Es kann mit den Ergebnissen weiter gerechnet werden,
 * z.B. die Summe der berechneten Fakultäten gebildet werden
 */

public class FakuRück {

	public static void main(String[] args) {
		System.out.println
		("Die Summe der Fakultäten von 5 u. 7 ist "+ (faku(5)+faku(7)) );
	}

		// Methode mit Parameter u. Rückgabewert
	public static int faku (int n) {
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++)	// i:1..n:n mal
			ergebnis *= i;
		
		return ergebnis;	
	}
}

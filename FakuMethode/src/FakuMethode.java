/*
 * 2.Version der Fakultätsberechnung
 * Auslagerung in eine Methode mit Parametern
 * Vorteil:
 * Es kann im Hauptprogramm belieblig oft
 * u. an beliebigen Stellen die Faku berechnet werden muss
 * Nachteil:
 * Mit den Ergebnissen kann nicht weitergerechnet werden,
 * z.B. die Summe der berechneten Fakultäten gebildet werden
 */
public class FakuMethode {

	public static void main(String[] args) {
		
		faku(5);
		faku(7);		
	}
	
	public static void faku (int n) {
int ergebnis = 1;
		
		for (int i = 1; i <= n ; i++) // i: 1...n n: mal
			ergebnis *= i;
		
		System.out.println(n+"! = " +ergebnis);
	}

}

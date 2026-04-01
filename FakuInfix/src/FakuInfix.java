/*
 * Übung zur Infixnotation, zum Verbundoperator
 * Berechnung der Fakultät von n: n!
 * Der Laufindex "i",
 * der die Werte von 1 bis n annimmt,
 * hat dabei eine Doppelbedeutung:
 * 1. Um zu zählen, dass n Durchläufe erfolgen
 * 2. Er nimmt genau die Wert an,
 * die aufmultipliziert werden sollen.
 */

public class FakuInfix {

	public static void main(String[] args) {
		int n = 5;
		// **********
		int ergebnis = 1;

		for (int i=1; i<=n; i++)		// i:1..n: n mal
			ergebnis *= i;	// Infix-Notation
		
		System.out.println (n+"! = "+ergebnis);
	}

}


/*
 * Zweites Beispiel für den Übergang
 * von zwei ein- zu einer zweiseitig bed. Anw.
 */

public class BetragIf {

	public static void main(String[] args) {
		int a = -5, betrag = 0;

		if (a >= 0)		// Bedingung 1
			betrag = a;		// Block 1
		
		if (a < 0)		// Bedingung 2
			betrag = -a;	// Block 2
		
		System.out.println
		("Der Betrag von "+a+" ist "+betrag);
	}

}

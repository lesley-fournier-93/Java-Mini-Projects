/*
 * Erstes Beispiel für eine zweiseitig bedingte Anweisung:

 */

public class DivisionDurchNullElse {

	public static void main(String[] args) {
		int divident = 12, divisor = 3;
		
		if (divisor == 0)	// Bedingung 1
			System.out.println
			("Fehler! Division durch Null!");		
		else // if (divisor != 0)	// Bedingung 2
			System.out.println(divident/divisor);

		System.out.println
		("Hier geht das Programm kontrolliert zu Ende");
	}
}

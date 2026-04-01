/*
 * Erstes Beispiel für eine einseitig bedingte Anweisung:
 * Laufzeitfehler bei Division durch Null soll verhindert werden.
 * Division wird nur dann ausgeführt,
 * wenn Divisor ungleich Null ist.
 */

public class DivisionDurchNullIf {

	public static void main(String[] args) {
		int divident = 12, divisor = 0;
		
		if (divisor != 0)
			System.out.println(divident/divisor);

		System.out.println
		("Hier geht das Programm kontrolliert zu Ende");
	}
}

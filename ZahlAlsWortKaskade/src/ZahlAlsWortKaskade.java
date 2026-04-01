/*
 * Zweites Beispiel für die Umwandlung
 * einer Kaskade in einen Switch
 * Hier die erste Version mit Kaskade
 */

public class ZahlAlsWortKaskade {

	public static void main(String[] args) {
		int zahl = 6;
		
		System.out.println
		("Programm schreibt die Zahlen");
		System.out.println
		("von 1 bis 5 in Buchstaben!");
		System.out.print  (zahl+": ");
		
		if (zahl == 1)
			System.out.println("eins");
		else if (zahl == 2)
			System.out.println("zwei");
		else if (zahl == 3)
			System.out.println("drei");
		else if (zahl == 4)
			System.out.println("vier");
		else if (zahl == 5)
			System.out.println("fünf");
		else 
			System.out.println
			("liegt außerhalb des Bereiches");
	}
}

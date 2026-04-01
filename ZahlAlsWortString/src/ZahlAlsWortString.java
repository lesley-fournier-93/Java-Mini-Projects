/*
 * Zweites Beispiel für die Umwandlung
 * einer Kaskade in einen Switch
 * Hier die dritte Version 
 * unter Vermeidung der mehrfachen Ausgabeanweisung.
 * Zusammensetzten des auszugebenden Strings
 * u. nur eine einmalige Ausgabeanweisung zum Schluss
 */

public class ZahlAlsWortString {

	public static void main(String[] args) {
		int zahl = 3;
		String s="Programm schreibt die Zahlen\n";
		s = s + "von 1 bis 5 in Buchstaben!\n"+zahl+": ";
		
		switch(zahl) {
			case 1: s = s + "eins";	break;
			case 2: s = s + "zwei";	break;
			case 3: s = s + "drei";	break;
			case 4: s = s + "vier";	break;
			case 5: s = s + "fünf";	break;
			default:s = s + "liegt außerhalb des Bereiches";
		}
		
		System.out.println(s);
	}
}

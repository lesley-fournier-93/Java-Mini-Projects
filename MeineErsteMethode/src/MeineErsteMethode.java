/*
 * Erstes Beispiel für das Methodenkonzept
 * Vom Hauptprogramm aus 
 * wird eine Methode aufgerufen,
 * die eine Ausgabe erzeugt.
 */

public class MeineErsteMethode {

	public static void main(String[] args) {
		System.out.println
		("Hier fängt das Hauptprogramm an.");
		
		meineMethode();	// Aufruf der Methode
		
		System.out.println
		("Hier geht das Hauptprogramm zu Ende.");
	}

		// Deklaration der Methode:
	public static void meineMethode() {
		System.out.println
		("\tHallo! Hier ist \"meineMethode()\"");
	}
}

/*
 * Zweites Beispiel für das Methodenkonzept:
 * Untergliederung eines linearen Stück Quelltext
 * Hier die zweite Version: Mit Untergliederung:
 * Anweisungen aus der Hauptmethode
 * sind inhaltlich sinnvoll ausgelagert,
 * den Satzgrenzen folgend.
 * Somit besteht die Klasse nun aus 4 Teilen:
 * Der Hauptmethode sowie drei selbst definierten.
 */


public class LobesliedUntergliedert {

	public static void main(String[] args) {
		toll();
		liebe();
		forever();
	}

	public static void toll() {
		System.out.println("Java");
		System.out.println("ist");
		System.out.println("toll");
		System.out.println("!");		
	}
	
	public static void liebe() {
		System.out.println("Ich");
		System.out.println("liebe");
		System.out.println("Java");
		System.out.println("!");		
	}
	
	public static void forever() {
		System.out.println("Java");
		System.out.println("for");
		System.out.println("ever");
		System.out.println("!");		
	}
}

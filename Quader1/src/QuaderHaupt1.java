/*
 * Erstes Beispiel zur Vererbung:
 * Von schon vorhandener Superklasse "Rechteck"
 * wird die neue Subklasse "Quader" abgeleitet
 * Sie übernimmt alle Attribute,
 * im nächsten Beispiel auch die Methoden
 * In dieser ersten Version Ausgabe der Methoden
 * aus dem Hauptprogramm heraus
 */

public class QuaderHaupt1 {

	public static void main(String[] args) {
		// Erzeugung eines Objektes der Subklasse
		System.out.println("Quader \"q1\":");
		Quader q1 = new Quader();
		
		// Belegung der Attribute
		q1.laenge = 3;
		q1.breite = 4;
		q1.hoehe  = 5;
		
		// Ausgabe der Attribute
		System.out.println("Laenge: "+q1.laenge);
		System.out.println("Breite: "+q1.breite);
		System.out.println("Hoehe:  "+q1.hoehe);
	}

}

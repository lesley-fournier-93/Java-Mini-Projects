/*
 * Beispiel für das Überschreiben von Methoden:
 * In Superklasse wird Methode "schreibe()" definiert,
 * die die beiden Attribute der Klasse ausgibt.
 * In Subklasse soll die Funktionalität der geerbten Methode
 * erweitert werden.
 * Dazu wird sie überschrieben.
 * Es wird die überschriebene Methode aufgerufen
 * u. um die Ausgabe des neu hinzugekommenen
 * Attributs ergänzt.
 * Im Hauptprogramm sucht der Compiler
 * je nach Zugehörigkeit des Objektes
 * zur Super- oder Subklasse
 * die richtige Implementierung heraus.
 */

public class ZylinderHaupt2 {

	public static void main(String[] args) {
		System.out.println("Kreis k1:");
		Kreis k1 = new Kreis();
		k1.radius = 1.0;
		k1.istGefuellt = true;
		k1.schreibe();
		
		System.out.println("\nZylinder z1:");
		Zylinder z1 = new Zylinder();
		z1.radius = 2.0;
		z1.istGefuellt = false;
		z1.hoehe = 3.0;
		z1.schreibe();
	}

}

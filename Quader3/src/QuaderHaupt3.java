/*
 * Beispiel für das "Überschreiben von Methoden":
 * In Superklasse ist Methode "schreibe()" definiert.
 * Sie wird in Subklasse geerbt,
 * dort aber <überschrieben> von einer neuen Methode mit
 * 1. gleichem Namen
 * 2. gleicher Parameterliste
 * Bei Aufruf der Methode "schreibe()" 
 * sucht sich der Compiler anhand der Klassenzugehörigkeit
 * des Objektes, mit dem die Methode aufgerufen wird,
 * die richtige Implementierung heraus.
 * Vorteile:
 * 1. Kein Aufwand für uns, Methoden unterschiedlich 
 *    zu benennen
 * 2. Kein Aufwand für uns für die Zuordnung beim Aufruf
 * 3. Keine Gefahr der Verwechslung
 */

public class QuaderHaupt3 {

	public static void main(String[] args) {
		System.out.println("Rechteck r1:");
		Rechteck r1 = new Rechteck();
		r1.laenge = 1;	r1.breite = 2;
		r1.schreibe();
//		r1.schreibeQuader();
		
		System.out.println("\nQuader q1:");
		Quader q1 = new Quader();
		q1.laenge=3;	q1.breite=4;	q1.hoehe=5;
		q1.schreibe();
//		q1.schreibeRechteck();
	}

}

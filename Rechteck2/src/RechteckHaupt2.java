/*
 * Auslagerung der Ausgabe der Attribute
 * in die abhängige Klasse zu den Attributen
 * Methoden als zweiten Bestandteil
 * Typen von Methoden:
 * a) I/O
 * b) Berechnung
 * c) Veränderung
 */

public class RechteckHaupt2 {

	public static void main(String[] args) {
		// Anlegen eines Objektes
		System.out.println
		("Anlegen eines Objektes \"r1\":");
		Rechteck r1 = new Rechteck();

		// Belegen der Attribute:
		r1.laenge = 3;
		r1.breite = 5;
		
		// Ausgabe der Attribute:
		r1.schreibeRechteck();
		
		// Berechnung auf Attributen:
		System.out.print  ("\nDie Fläche beträgt: ");
		System.out.println(r1.berechneFlächeRechteck());
		
		// Veränderung der Attribute:
		System.out.println("\nJetzt vertausche ich die Seiten:");
		r1.vertauscheSeitenRechteck();
		r1.schreibeRechteck();
	}

}

/*
 * Zweites Beispiel zur Vererbung:
 * Auch Methoden werden vererbt
 * In Subklasse sollen alle Attribute ausgegeben werden,
 * auch die der Superklasse
 * In der Superklasse wurde in der Methode "schreibeRechteck()"
 * die Ausgabe der beiden Attribute "laenge" u. "breite"
 * bereits definiert.
 * Um sich in Subklasse in der Methode "schreibeQuader()"
 * die Ausgabe der beiden gemeinsamen Attribute
 * erneut ersparen zu können,
 * ruft die Methode der Subklasse die geerbte der Superklasse auf
 * Dadurch Vermeidung von Quelltextduplizierung
 */

public class QuaderHaupt2 {

	public static void main(String[] args) {
		// Erzeugung eines Objektes der Subklasse
		System.out.println("Quader \"q1\":");
		Quader q1 = new Quader();
		
		// Belegung der Attribute
		q1.laenge = 3;
		q1.breite = 4;
		q1.hoehe  = 5;
		
		// Ausgabe der Attribute
		q1.schreibeQuader();
	}

}

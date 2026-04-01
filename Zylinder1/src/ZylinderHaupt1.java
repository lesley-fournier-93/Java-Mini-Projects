/*
 * Beispiel zum Code-Recyceln bei Vererbung:
 * Aufruf einer geerbten Methode aus der Superklasse
 * in der Subklasse,
 * um Quelltextduplizierung zu vermeiden:
 * "schreibeZylinder()" in Subklasse "Zylinder"
 * ruft "schreibeKreis()" aus Superklasse "Kreis" auf
 */

public class ZylinderHaupt1 {

	public static void main(String[] args) {
		System.out.println("Zylinder \"z1\":");
		Zylinder z1 = new Zylinder();
		
		z1.radius = 1.0;
		z1.istGefuellt = true;
		z1.hoehe = 2.0;
		
		z1.schreibeZylinder();
	}

}

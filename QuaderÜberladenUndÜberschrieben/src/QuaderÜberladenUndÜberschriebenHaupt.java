/*
 * Beispiel für das gleichzeitige Überladen u. Überschreiben:
 * In Superklasse sind zwei Versionen der Methode "vervielfache()" definiert:
 * Die erste multipliziert sowohl Länge als auch Breite
 * mit dem gleichen Faktor,
 * die zweite mit zwei unterschiedlichen.
 * Somit ist die Method überladen.
 * 
 * In Subklasse werden beide Methoden geerbt.
 * Dort wird die Version mit einem Parameter so überschrieben,
 * dass auch das hinzugekommene dritte Attribut
 * mit dem Einheitsfaktor multipliziert wird.
 * Daneben gibt es eine Version mit drei Paramtern,
 * die die drei Attribute einzeln vervielfacht.
 * 
 * Somit sind in der Subklasse die Version 
 * mit drei Paramtern überladen,
 * die mit einem sogar beides:
 * Sie überschreibt die geerbte
 * u. ist überladen wegen einer parallel existierenden
 * mit drei Parametern.
 */

public class QuaderÜberladenUndÜberschriebenHaupt {
	public static void main(String[] args) {
		System.out.println("Rechteck r1:");
		Rechteck r1 = new Rechteck();
		r1.laenge=1;		r1.breite=2;
		r1.schreibe();
		
		System.out.println
		("\nZuerst vervielfache ich mit Einheitsfaktor 3:");
		r1.vervielfache(3);		// Version mit einem Paramter
		r1.schreibe();
		
		System.out.println
		("\nAls zweites mit zwei unterschiedlichen Faktoren: 4 und 3");
		r1.vervielfache(4,3);	// Version mit zwei Parametern
		r1.schreibe();
		
		
		System.out.println("\n\nQuader q1:");
		Quader q1 = new Quader();
		q1.laenge=3;	q1.breite=4;	q1.hoehe=5;
		q1.schreibe();
		
		System.out.println
		("\nZuerst vervielfache ich mit Einheitsfaktor 2:");
		q1.vervielfache(2);		// Version mit einem Paramter
		q1.schreibe();
		
		System.out.println
		("\nAls zweites mit drei unterschiedlichen Faktoren: "
				+ "3, 2 und 1");
		q1.vervielfache(3,2,1);	// Version mit drei Parametern
		q1.schreibe();
		
	}
}

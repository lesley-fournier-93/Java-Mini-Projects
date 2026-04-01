/*
 * Beispiel für das gleichzeitige Überladen u. Überschreiben:
 * In Superklasse ist Methode "skaliere()" 
 * mit einem Parameter definiert.
 * Sie ist weder noch.
 * 
 * In der Subklasse wird die geerbte Methode überschrieben,
 * weil eine gleichen Namens <und> geleicher Parameterliste
 * definiert wird.
 * Sie ergänzt die Fuktionalität der überschriebenen,
 * indem sie zusätzlich auch die Höhe skaliert.
 * 
 * Daneben exisitert eine Methode mit gleichem Namen
 * <aber anderer> Parameterliste: hier: zwei double.
 * Diese überlädt die erste mit einem double-Parameter.
 * 
 * Somit überschreibt die Methode "skaliere()" 
 * in der Subklasse u. ist gleichzeitig überladen!
 */

public class ZylinderÜberladenUndÜberschreibenHaupt {

	public static void main(String[] args) {
		System.out.println("Kreis k1:");
		Kreis k1 = new Kreis();
		k1.radius = 1.0;
		k1.istGefuellt = true;
		k1.schreibe();
		
		System.out.println
		("\nJetzt skaliere ich mit dem Faktor 0.5:");
		k1.skaliere(0.5);
		k1.schreibe();
		
		System.out.println("\n\nZylinder z1:");
		Zylinder z1 = new Zylinder();
		z1.radius = 2.0;
		z1.istGefuellt = false;
		z1.hoehe = 3.0;
		z1.schreibe();
		
		System.out.println
		("\nJetzt skaliere ich mit dem eine Faktor 2.0: ");
		z1.skaliere(2.0);
		z1.schreibe();
	}
}

/*
 * Bestimmung der geometrischen Eigenschaften 
 * von Dreiecken
 * als Anwendung von Methoden,
 * die Berechnungen durchführen.
 * Da jedes Dreieck nach Erzeugung ausgeggeben
 * u. jeweils mehrere Eigenschaften geprüft werden sollen,
 * werden diese in der Methode "eigenschaften()"
 * zusammengefasst,
 * um Quelltextduplizierung zu vermeiden.
 * Eigenschaften brauchen nur dann geprüft werden,
 * wenn es sich um ein gültiges Dreieck handelt. 
 */

public class DreieckHaupt2 {

	public static void main(String[] args) {
		System.out.print  ("Dreieck \"d1\":  ");
		Dreieck d1 = new Dreieck();
		d1.a = 3;	d1.b=4; 	d1.c=5;
		d1.istSchraffiert=true;
		d1.eigenschaften();
		
		System.out.print  ("\nDreieck \"d2\":  ");
		Dreieck d2 = new Dreieck();
		d2.a = 3;	d2.b=3; 	d2.c=3;
		d2.istSchraffiert=true;
		d2.eigenschaften();
		
		System.out.print  ("\nDreieck \"d3\":  ");
		Dreieck d3 = new Dreieck();
		d3.a = 3;	d3.b=3; 	d3.c=5;
		d3.istSchraffiert=false;
		d3.eigenschaften();
		
		System.out.print  ("\nDreieck \"d4\":  ");
		Dreieck d4 = new Dreieck();
		d4.a = 1;	d4.b=2; 	d4.c=10;
		d4.istSchraffiert=false;
		d4.eigenschaften();
	}

}

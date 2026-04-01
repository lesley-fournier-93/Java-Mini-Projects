/*
 * Beispiel für die Verschachtelung von Methoden
 * Ebenenen werden bei der Ausgabe
 * durch Einrückung gekennzeichnet.
 * main()-Methode ist Einsprungspunkt
 * u. oberste Ebene.
 * Methoden m1() u. m2() befinden sich eine Eben tiefer
 * m1a() u. m1b() ganz unten: 
 * Aufrufhierarchie-Diagramm
 */

public class Schachtel1 {

	public static void main(String[] args) {
		System.out.println("Hauptmethode fängt an.");
		m1();
		System.out.println("Hauptmethode geht hier weiter.");
		m2();
		System.out.println("Hauptmethode geht zu Ende.");
	}

	public static void m1() {
		System.out.println("\t\"m1()\" fängt an.");
		m1a();
		System.out.println("\t\"m1()\" geht hier weiter.");
		m1b();
		System.out.println("\t\"m1()\" geht zu Ende.");		
	}
	
	public static void m1a() {
		System.out.println("\t\tHier ist Methode \"m1a()\"");
	}
	
	public static void m1b() {
		System.out.println("\t\tHier ist Methode \"m1b()\"");
	}
	
	public static void m2() {
		System.out.println("\tHier ist Methode \"m2()\"");
	}
}

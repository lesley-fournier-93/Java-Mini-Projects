/*
 * Herleitung der gültigen Unterscheidungskriterien
 * für Parameterlisten im Sinne des Polymorphismus
 * Gültig sind:
 * 1. Länge
 * 2. Typ
 * 3. Reihenfolge
 * Ungültig sind:
 * 1. Name des/der Parameter
 * 2. Rückgabewert der Methode
 * 3. Zugriffsmodifizierer
 */

public class Poly {

	public static void main(String[] args) {
		m();
		m(17);
		m(42, false);
		m(true, 0);
	}

	public static void m() {
		System.out.println("Hier \"m()\" ohne Parameter.");
	}
	
//	// Zugriffsmodifizierer ist <kein> gültiges Kriterium
//	private static void m() {
//		System.out.println("Hier \"m()\" ohne Parameter.");
//	}
	
	// Rückgabewert der Methode ist <kein> Kriterium
//	public static int m() {
//		System.out.println("Hier \"m()\" ohne Parameter.");
//	}
	
	public static void m(int i) {
		System.out.println("Ein int-Parameter.");
	}
	
	// Der Name des/der Parameter ist <kein> Kriterium
//	public static void m(int j) {
//		System.out.println("Ein int-Parameter.");
//	}
	
	public static void m(boolean b) {
		System.out.println("Ein bool-Parameter.");
	}
		
	public static void m(int i, boolean b) {
		System.out.println("Erst int, dann bool");
	}
	
	public static void m(boolean b, int i) {
		System.out.println("Umgekehrt: erst bool, dann int");
	}
	
	
}

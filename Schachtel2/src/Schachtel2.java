/*
 * Übung zur Verschachtelung von Methoden
 * Im Gegensatz zur Vorversion "Schachtel1"
 * wurde eine weitere Ebene ergänzt
 * mit m1a_i() u. m1a_ii()
 */

public class Schachtel2 {

	public static void main(String[] args) {
		System.out.println("Hauptprogramm fängt an.");
		m1();
		System.out.println("Hauptprogramm geht weiter.");
		m2();
		System.out.println("Hauptprogramm ist zu Ende.");
	}
	
	public static void m1() {
		System.out.println("\tm1() fängt an.");
		m1a();
		System.out.println("\tm1() geht weiter.");
		m1b();
		System.out.println("\tm1() ist zu Ende.");		
	}
	
	public static void m1a() {
		System.out.println("\t\tm1a() fängt an.");
		m1a_i();
		System.out.println("\t\tm1a() geht weiter.");
		m1a_ii();
		System.out.println("\t\tm1a() ist zu Ende.");		
	}
	
	public static void m1a_i() {
		System.out.println("\t\t\tm1a_i() hier!");		
	}
	
	public static void m1a_ii() {
		System.out.println("\t\t\tm1a_ii() hier!");		
	}
	
	public static void m1b() {
		System.out.println("\t\tm1b() hier!");		
	}
	
	public static void m2() {
		System.out.println("\tm2() hier!");
	}

}

/*
 * Beispiel für Polymorphismus:
 * 1. Version: ohne Poly:
 * Methodennamen unterschiedlich
 */

public class SortOhntPoly {

	public static void main(String[] args) {
		sort2int(3, 5);
		sort2int(5, 3);
		sort3int(1, 2, 3);
		sort3int(3, 2, 1);

		sort2double(3.7, 5.3);
		sort2double(5.5, 3.9);
		sort3double(1.9, 2.3, 3.9);
		sort3double(3.9, 2.6, 1.3);
	}

	public static void sort2int(int a, int b) {
		System.out.println
		("Sind die 2 int-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort3int(int a, int b, int c) {
		System.out.println
		("Sind die 3 int-Zahlen sortiert? "+(a<=b && b<=c));
	}
	
	public static void sort2double(double a, double b) {
		System.out.println
		("Sind die 2 double-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort3double(double a, double b, double c) {
		System.out.println
		("Sind die 3 double-Zahlen sortiert? "+(a<=b && b<=c));
	}
}

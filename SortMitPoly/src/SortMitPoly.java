/*
 * Beispiel für Polymorphismus:
 * 2. Version: mit Poly:
 * Methodennamen gleich
 */

public class SortMitPoly {

	public static void main(String[] args) {
		sort(3, 5);
		sort(5, 3);
		sort(1, 2, 3);
		sort(3, 2, 1);

		sort(3.7, 5.3);
		sort(5.5, 3.9);
		sort(1.9, 2.3, 3.9);
		sort(3.9, 2.6, 1.3);
	}

	public static void sort(int a, int b) {
		System.out.println
		("Sind die 2 int-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort(int a, int b, int c) {
		System.out.println
		("Sind die 3 int-Zahlen sortiert? "+(a<=b && b<=c));
	}
	
	public static void sort(double a, double b) {
		System.out.println
		("Sind die 2 double-Zahlen sortiert? "+(a<=b));
	}
	
	public static void sort(double a, double b, double c) {
		System.out.println
		("Sind die 3 double-Zahlen sortiert? "+(a<=b && b<=c));
	}
}

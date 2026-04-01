/*
 * Erste Version zur Herleitung des Polymorphismus:
 * Methoden heißen unterschiedlich
 * In ihrem Namen ist Anazahl u. Typ der Parameter codiert
 * Störend:
 * 1. Aufwand für die unterschiedliche Benennung der Methoden
 * 2. Aufwand für die Zuordnung
 * 3. Gefahrenquelle: falsche Zuordnung
 */

public class MaxOhnePoly {

	public static void main(String[] args) {
		max2int(3, 5);
		max3int(2, 7, 5);
		max2double(3.0, 5.3);
		max3double(2.9, 7.4, 5.2);
	}

	public static void max2int(int a, int b) {
		int maxi;
		
		if (a>=b)
			maxi = a;
		else 
			maxi = b;
		
		System.out.println
		("Das Max. der 2 int-Parameter ist "+maxi);
	}
	
	public static void max3int(int a, int b, int c) {
		int maxi;
		
		if (a>=b && a>=c)
			maxi = a;
		else if (b>=a && b>=c)
			maxi = b;
		else 
			maxi = c;
		
		System.out.println
		("Das Max. der 3 int-Parameter ist "+maxi);
	}
	
	public static void max2double(double a, double b) {
		double maxi;
		
		if (a>=b)
			maxi = a;
		else 
			maxi = b;
		
		System.out.println
		("Das Max. der 2 double-Parameter ist "+maxi);
	}
	
	public static void max3double(double a, double b, double c) {
		double maxi;
		
		if (a>=b && a>=c)
			maxi = a;
		else if (b>=a && b>=c)
			maxi = b;
		else 
			maxi = c;
		
		System.out.println
		("Das Max. der 3 double-Parameter ist "+maxi);
	}
}

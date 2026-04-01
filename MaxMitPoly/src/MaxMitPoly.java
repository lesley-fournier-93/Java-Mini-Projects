/*
 * Zweite Version unter Anwendung des Polymorphismus:
 * Methoden werden alle gleich benannt: "max()"
 * Compiler sucht zur Laufzeit die passende Version heraus
 * aufgrund der Parameterliste
 */

public class MaxMitPoly {

	public static void main(String[] args) {
		max(3, 5);
		max(2, 7, 5);
		max(3.0, 5.3);
		max(2.9, 7.4, 5.2);
	}

	public static void max(int a, int b) {
		int maxi;
		
		if (a>=b)
			maxi = a;
		else 
			maxi = b;
		
		System.out.println
		("Das Max. der 2 int-Parameter ist "+maxi);
	}
	
	public static void max(int a, int b, int c) {
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
	
	public static void max(double a, double b) {
		double maxi;
		
		if (a>=b)
			maxi = a;
		else 
			maxi = b;
		
		System.out.println
		("Das Max. der 2 double-Parameter ist "+maxi);
	}
	
	public static void max(double a, double b, double c) {
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

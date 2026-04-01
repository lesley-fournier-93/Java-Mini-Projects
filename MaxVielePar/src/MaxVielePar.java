/*
 * Beispiel zur Motivation von Feldern:
 * Sollen vin einer steigenden Anzahl von Zahlen
 * das Maximum auf bisherigem weg berechnet werden,
 * wird der Aufeand schnell groß!
 * Der Aufwand wächst quadratisch mit der Eingabegröße
 * Dies ist für große Zahl untragbar
 * Suche nach Vereinfachung
 */
public class MaxVielePar {

	public static void main(String[] args) {
		System.out.println("Das Max. der 2 Zahlen ist "+max2(3, 5));
		System.out.println("Das Max. der 3 Zahlen ist "+max3(3,7,5));
		System.out.println("Das Max. der 4 Zahlen ist "+max3(3,7,5,2));

	}
	
		// 2 Parameter
	public static int max2 (int a, int b) {
		int maxRück;
		
		if (a>=b)
			maxRück = a;
		else
			maxRück = b;
	
		return maxRück;
		
	}
	
	// 3 Parameter
	public static int max3(int a, int b, int c) {
		int maxRück;
		
		if (a>=b && a>= c)
			maxRück = a;
		else if (b>=a && b>=c)
			maxRück = b;
		else
			maxRück= c;

		return maxRück;
	
	}
	
	
	// 4 Parameter
		public static int max3(int a, int b, int c, int d) {
			int maxRück;
			
			if (a>=b && a>= c && a>=d)
				maxRück = a;
			else if (b>=a && b>=c && b>=d)
				maxRück = b;
			else if (c>=a && c>=b && c>=d)
				maxRück= c;
			else 
				maxRück = d;

			return maxRück;
		
		}


}

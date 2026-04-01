/*
 * Beispiel für eine Methode mit einem Parameter:
 * Verallgemeinerung so,
 * dass eine beliebige Anzahl Sterne geschrieben werden kann.
 * 
 */

public class SchreibeSterne1Par {

	public static void main(String[] args) {
		schreibeSterne( 5);
		schreibeSterne(10);
		schreibeSterne(15);
		schreibeSterne(10);
		schreibeSterne( 5);
	}

	public static void schreibeSterne(int anzahl) {
		for (int i=1; i<=anzahl; i++)	// i:1..15: 15 mal
			System.out.print  ("*");
		System.out.println();
	}
}

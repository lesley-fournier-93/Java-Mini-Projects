/*
 * Beispiel für Erweiterung eines einzelnen Parameters
 * zu einer Parameterliste:
 * Nicht nur Anzahl soll variabel sein,
 * sondern auch zu schreibendes Zeichen
 * 
 */

public class SchreibeSterne2Par {

	public static void main(String[] args) {
		schreibeSterne(10, 'a');
		schreibeSterne(15, 'b');
		schreibeSterne( 5, 'c');
	}

	public static void schreibeSterne(int anzahl, char bu) {
		for (int i=1; i<=anzahl; i++)	// i:1..15: 15 mal
			System.out.print  (bu);
		System.out.println();
	}
}

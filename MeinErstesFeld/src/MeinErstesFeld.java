/*
 * Erstes Beispiel für ein Feld
 */
public class MeinErstesFeld {

	public static void main(String[] args) {
		// Deklaration eines Feldes von integern
		// namens "meinFeld" der Größe 5:
		int[] meinFeld = new int [5];
		
		//	schreibender Zugriff:
		meinFeld[3] = 17;
		
		//lesender Zugriff:
		System.out.println(meinFeld[3]);
	}

}

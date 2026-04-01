/*
 * Zweites Beispiel für Felder
 * mit automatisiertem Durchlaufen,
 * erst zu Belegen, dann zur Ausgabe
 */

public class MeinZweitesFeld {

	public static void main(String[] args) {
		// Deklaration des Feldes:
		int[] meinFeld = new int[5];

		// automatisierte Belegung:
		for (int i=0; i<5; i++)
			meinFeld[i] = i+1;
		
		// automatisierte Ausgabe:
		for (int i=0; i<5; i++)
			System.out.println
			("An Indexpos. "+i+" steht EleNr. "+meinFeld[i]);
	}

}

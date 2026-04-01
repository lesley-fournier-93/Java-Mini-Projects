/*
 * Übung zu Feldern,
 * dabei: look-up-table für die Vielfachen einer Zahl
 * Dimensionierung des Feldes mit einem Element mehr als gebraucht,
 * um Index 0 brach liegen lassen zu können
 * u. an Stelle i das i-te Vielfache stehen zu haben
 */

public class VielfacheFeld {

	public static void main(String[] args) {
		int zahl = 3789, anzahlVielfache = 100;
		// Deklaration eines int-Feldes "vielfache"
		// für die ersten Vielfachen der Zahl "zahl"
		int[] vielfache = new int[anzahlVielfache + 1];
		
		// belegen:
		for (int i=1; i<=anzahlVielfache; i++)	// i:1..anzahlVielfache
			vielfache[i] = i * zahl;
		
		// ausgeben:
		System.out.println
		("Die Vielfachen von "+zahl+":\n");
		for (int i=1; i<=anzahlVielfache; i++)	// i:1..anzahlVielfache
			System.out.println(i+" * "+zahl+" = "+vielfache[i]);
	}

}

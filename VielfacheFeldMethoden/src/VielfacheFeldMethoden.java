/*
 * Übung zu Feldern,
 * hier: Übergabe von Feldern an Methoden
 */

public class VielfacheFeldMethoden {

	public static void main(String[] args) {
		int zahl = 3789, anzahlVielfache = 100;
		// Deklaration eines int-Feldes "vielfache"
		// für die ersten Vielfachen der Zahl "zahl"
		int[] vielfache = new int[anzahlVielfache + 1];
		
		// belegen: Übergabe des Feldes u.a.
		belegeFeld(vielfache, zahl, anzahlVielfache);
		
		// ausgeben: Übergabe des Feldes u.a.
		ausgabeFeld(vielfache, zahl, anzahlVielfache);
	}

		// Feld "vielfache[]" wird übernommen u. unter Namen "feld" referenziert
	public static void belegeFeld(int[] feld, int zahl, int anzahlVielfache) {
		for (int i=1; i<=anzahlVielfache; i++)	// i:1..anzahlVielfache
			feld[i] = i * zahl;		
	}

	// Feld "vielfache[]" wird übernommen u. unter Namen "feld" referenziert
	public static void ausgabeFeld(int[] feld, int zahl, int anzahlVielfache) {
		System.out.println
		("Die Vielfachen von "+zahl+":\n");
		for (int i=1; i<=anzahlVielfache; i++)	// i:1..anzahlVielfache
			System.out.println(i+" * "+zahl+" = "+feld[i]);		
	}
}

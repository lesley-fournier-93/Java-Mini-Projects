/*
 * Übung zu Feldern,
 * hier: Bezug auf Fekdgröße mit "<feldname>.length"
 * Dadurch Einsparung je eines Parameters bei den beiden Methoden
 * Benefit: kürzer, schneller, übersichtlicher
 */

public class VielfacheFeldLength {

	public static void main(String[] args) {
		int zahl = 3789, anzahlVielfache = 100;
		// Deklaration eines int-Feldes "vielfache"
		// für die ersten Vielfachen der Zahl "zahl"
		int[] vielfache = new int[anzahlVielfache + 1];
		
		// alte Version mit Parameterübergbe der Feldgröße
//		// belegen: Übergabe des Feldes u.a.
//		belegeFeld(vielfache, zahl, anzahlVielfache);
		
		//neue Version ohne Übergabe der Feldgröße
		belegeFeld(vielfache, zahl);
		
		// alte Version mit Parameterübergbe der Feldgröße
//		// ausgeben: Übergabe des Feldes u.a.
//		ausgabeFeld(vielfache, zahl, anzahlVielfache);
		
		//neue Version ohne Übergabe der Feldgröße 
		ausgabeFeld(vielfache, zahl);
	}

	// alte Version mit Übergabe der Feldgröße als Parameter
//		// Feld "vielfache[]" wird übernommen u. unter Namen "feld" referenziert
//	public static void belegeFeld(int[] feld, int zahl, int anzahlVielfache) {
//		for (int i=1; i<=anzahlVielfache; i++)	// i:1..anzahlVielfache
//			feld[i] = i * zahl;		
//	}
	
	// neue Version mit Bezug auf <Feldname>.length ohne Parameterübergabe
	public static void belegeFeld(int[] feld, int zahl) {
		for (int i=1; i<feld.length; i++)	// i:1..anzahlVielfache
			feld[i] = i * zahl;		
	}
	
	// alte Version mit Übergabe der Feldgröße als Parameter
	// Feld "vielfache[]" wird übernommen u. unter Namen "feld" referenziert
//	

		//  neue Version mit Bezug auf <Feldname>.length ohne Parameterübergabe
		public static void ausgabeFeld(int[] feld, int zahl) {
			System.out.println
			("Die Vielfachen von "+zahl+":\n");
			for (int i=1; i<feld.length; i++)	// i:1..anzahlVielfache
				System.out.println(i+" * "+zahl+" = "+feld[i]);		
	}
}

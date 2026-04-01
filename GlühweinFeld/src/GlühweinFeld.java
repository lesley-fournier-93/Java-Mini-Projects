/*
 * 1. Version mit Übergabe von Feldern an Methoden,
 * jedoch noch ohne <Feldname>.length,
 * sonder stattdessen Parameterübergabe von "anzahlMax" 
 */

public class GlühweinFeld {

	public static void main(String[] args) {
		double einzelpreis = 7.89;
		int anzahlMax = 10;
		// *****************
		double[] preis = new double[anzahlMax + 1];
		
		belegeFeld (preis, einzelpreis, anzahlMax);
		ausgabeFeld(preis, anzahlMax);
	}

	public static void belegeFeld
		(double[] preis, double einzelpreis, int anzahlMax) {
		for (int i=1; i<=anzahlMax; i++)		// i:1..anzahlMax
			preis[i] = i * einzelpreis;
	}
	
	public static void ausgabeFeld
		(double[] preis, int anzahlMax) {
		System.out.println("Unsere Glühweinpreisliste:\n");
		
		for (int i=1; i<=anzahlMax; i++)	{	// i:1..anzahlMax
			System.out.print (i+" * Glühwein: ");
			System.out.println(preis[i]+"€");
			// mit print-f-Anweisung:
			// System.out.printf("%.2f€%n",preis[i]);
		}
	}
}

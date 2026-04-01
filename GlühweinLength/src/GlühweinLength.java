/*
 * 2. Version mit Bezug auf die Feldgröße 
 * mit <Feldname>.length 
 */

public class GlühweinLength {

	public static void main(String[] args) {
		double einzelpreis = 7.89;
		int anzahlMax = 10;
		// *****************
		double[] preis = new double[anzahlMax + 1];
		
		belegeFeld (preis, einzelpreis);
		ausgabeFeld(preis);
	}

	public static void belegeFeld
		(double[] preis, double einzelpreis) {
		for (int i=1; i<preis.length; i++)		// i:1..anzahlMax
			preis[i] = i * einzelpreis;
	}
	
	public static void ausgabeFeld
		(double[] preis) {
		System.out.println("Unsere Glühweinpreisliste:\n");
		
		for (int i=1; i<preis.length; i++)	{	// i:1..anzahlMax
			System.out.print (i+" * Glühwein: ");
			System.out.println(preis[i]+"€");
			// mit print-f-Anweisung:
			// System.out.printf("%.2f€%n",preis[i]);
		}
	}
}

/*
 * Beispiel für Methode mit Rückgabewert:
 * 1. Version mit mehreren
 */

public class MaxRück {

	public static void main(String[] args) {
		System.out.print  ("Das Maximum von 3 u. 5 ist ");
		System.out.println(max(3,5));
	}

//		// Methode mit Rückgabewert vom Typ "int"
//		// 1. Version mit mehreren returns: schlechter Stil!	
//	public static int max (int a, int b) {
//		if (a>=b)
//			return a;	// Rückgabe von a
//		else
//			return b;	// Rückgabe von b
//	}
	
	// Methode mit Rückgabewert vom Typ "int"
	// 2. Version mit nur ein return-Statement: "single out": besser
	public static int max (int a, int b) {
		int maxRück;	// Hilfsvariable speichert Wert zwischen vor Rückgabe
		
		if (a>=b)
			maxRück = a;	// Zwischenspeichern von a
		else
			maxRück = b;	// Zwischenspeichern von b
		
		return maxRück;		// einziges return-Statement zum Schluss
	}
}

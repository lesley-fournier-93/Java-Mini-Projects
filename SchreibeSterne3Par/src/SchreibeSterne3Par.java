/*
 * Übung zu Parameterlisten
 * Erweiterung der Methode "SchreineSterne()" 
 * u. einem dritten Parameter, der angibt,
 * ob ein anschließender Zeilenumbruch
 * erfolgen soll.*/
public class SchreibeSterne3Par {

	public static void main(String[] args) {
		schreibeSterne(5,'a', false);
		schreibeSterne(5,'b', false);
		schreibeSterne(5,'c', true);
		schreibeSterne(15,'d', true);
		schreibeSterne(5,'e', false);
		schreibeSterne(5,'f', false);
		schreibeSterne(5,'g', true);
	}
	
	// Methode mit zwei Parametern:
	public static void schreibeSterne(int anzahl, char bu, boolean nl) {
		for (int i=1; i<=anzahl; i++) // i:1... 15: 15 mal
			System.out.print(bu);
		if(nl)
		System.out.println();
	}

}

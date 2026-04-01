/*
 * Übung zum mehrfachen Aufruf einer Methode
 */

public class SchreibeSterne0Par {

	public static void main(String[] args) {
		schreibeSterne();
		schreibeSterne();
		System.out.println("Java ist toll!");
		schreibeSterne();
		System.out.println("Ich liebe Java!");
		schreibeSterne();
		System.out.println("Java for ever!");
		schreibeSterne();
		schreibeSterne();
	}

	public static void schreibeSterne() {
		for (int i=1; i<=15; i++)	// i:1..15: 15 mal
			System.out.print  ("*");
		System.out.println();
	}
}

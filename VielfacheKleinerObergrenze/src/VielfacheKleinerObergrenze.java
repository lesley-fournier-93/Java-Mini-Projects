/*
 * Beispiel für eine while- oder Bedingungsschleife:
 * Es sollen die Vielfachen einer "großen, krummen" Zahl
 * ausgegeben werden,
 * die kleiner sind als eine vorgegebene Obergrenze.
 * Ohne vorher zu rechnen ist unklar,
 * wie viele Vielfache das sind.
 * Deshalb kann die for-Schleif nicht (direkt)
 * verwendet werden.
 */

public class VielfacheKleinerObergrenze {

	public static void main(String[] args) {
		int zahl = 798, obergrenze = 100000;
		// *********************************
		int vielfaches = zahl;

		while (vielfaches < obergrenze) {
			System.out.println(vielfaches);
			vielfaches += zahl;
		}
	}

}

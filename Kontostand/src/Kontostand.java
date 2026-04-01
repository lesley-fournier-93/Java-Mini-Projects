/*
 * Gewünschte Ausgabe:
 * 
 * Das Konto ist mit ...€ im Haben
 * 						  im Soll
 * 						  ausgeglichen
 */

public class Kontostand {

	public static void main(String[] args) {
		int kontostand = 0;

		System.out.print 
		("Das Konto ist mit "+kontostand+"€ ");
		
		if (kontostand > 0)
			System.out.println("im Haben");
		else if (kontostand == 0)
			System.out.println("ausgeglichen");
		else // if (kontostand < 0)
			System.out.println("im Soll");
	}

}

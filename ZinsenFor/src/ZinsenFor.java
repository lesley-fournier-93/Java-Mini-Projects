/*
Aufgabenstellung zur Verzinsung:
Gegeben sei ein Startkapital von z.B. 100€
sowie ein Zinssatz von 3%.

Fragestellung 1:
Auf welchen Betrag hat sich das Kapital
nach 10 Jahren vermehrt?
*/

public class ZinsenFor {

	public static void main(String[] args) {
		double startKapital = 100.0, zinssatz = 3.0;
		int jahre = 10;
		// ****************
		double  aktuKapital = startKapital,
				q = 1.0 + zinssatz/100.0;
		
		System.out.println("Sei ein Starkapital von "+startKapital+"€ gegeben,");
		System.out.println("sowie ein Zinssatz von "+zinssatz+"%.");
		System.out.println
		("Auf welchen Betrag hat sich das Kapital nach "+jahre+" Jahren vermehrt?\n");
		
		for (int i=1; i<=jahre; i++) {	// i:1..jahre: jahre mal
			aktuKapital *= q;	// Verzinsung
			System.out.println("Nach "+i+" Jahren: "+aktuKapital+"€");
		}
			
		System.out.println("\nEin Starkapital von "+startKapital+"€");
		System.out.println("vermehrt sich bei einem Zinssatz von "+zinssatz+"%");
		System.out.println("nach "+jahre+" Jahren auf "+aktuKapital+"€.");
	}

}

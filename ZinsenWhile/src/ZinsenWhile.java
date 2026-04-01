/*
Aufgabenstellung zur Verzinsung:
Gegeben sei ein Startkapital von z.B. 100€
sowie ein Zinssatz von 3%.

Fragestellung 2:
Wie viele Jahre dauert es,
bis sich das Kapital verdoppelt hat?

 */

public class ZinsenWhile {

	public static void main(String[] args) {
		double startKapital = 100.0, 
				zinssatz = 3.0;
		// *****************************
		double aktuKapital = startKapital,
				q = 1.0 + zinssatz/100.0;
		int jahre = 0;
		
		System.out.println("Sei ein Startkapital von "+startKapital+"€ gegeben");
		System.out.println("sowie ein Zinssatz von "+zinssatz+"%.");
		System.out.println("Wie viele Jahre dauert es,");
		System.out.println("bis sich das Kapital verdoppelt hat?\n");
		
		while (aktuKapital < 2.0*startKapital) {
			System.out.println("Nach "+jahre+" Jahren: "+aktuKapital);
			aktuKapital *= q;	// Verzinsung
			jahre++;
		}
		
		System.out.println("\nEin Startkapital von "+startKapital+"€");
		System.out.println("verdoppelt sich bei einem Zinssatz von "+zinssatz+"%");
		System.out.println("nach "+jahre+" Jahren auf "+aktuKapital+"€.");

	}

}

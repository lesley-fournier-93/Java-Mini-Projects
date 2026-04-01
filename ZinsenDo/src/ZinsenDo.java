/*
Beispiel für die Umwandlung einer while- in eine do-while-Schleife:
aktuKapital wir mit startKapital initialisiert.
Direkt danach wird gefragt,
ob das aktuKaptial noch kleiner ist als das doppelte startKapital.
Diese Prüfung ist überflüssig.
Sie wird verhindert durch Umstellung auf eine do-while-Schleife,
bei der erst im Block verzinst wird,
bevor die Bedingung geprüft wird.
Das erspart das unnötige Prüfen einer Bedingung! 
 */

public class ZinsenDo {

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
		
	// alte Version mit while-Schleife:	
//		while (aktuKapital < 2.0*startKapital) {
//			System.out.println("Nach "+jahre+" Jahren: "+aktuKapital);
//			aktuKapital *= q;	// Verzinsung
//			jahre++;
//		}
	
	// neue Version mit do-while-Schleife
		do {
			System.out.println("Nach "+jahre+" Jahren: "+aktuKapital);
			aktuKapital *= q;	// Verzinsung
			jahre++;
		} while (aktuKapital < 2.0*startKapital);
		
		System.out.println("\nEin Startkapital von "+startKapital+"€");
		System.out.println("verdoppelt sich bei einem Zinssatz von "+zinssatz+"%");
		System.out.println("nach "+jahre+" Jahren auf "+aktuKapital+"€.");

	}

}

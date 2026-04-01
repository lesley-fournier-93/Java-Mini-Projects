
public class Zylinder extends Kreis {
	double hoehe = 0.0;
	
	public void schreibeZylinder() {
//		System.out.println("Radius: "+radius);
//		System.out.println
//		("Ist er gefuellt? "+istGefuellt);
		
		// Aufruf der geerbten Methode
		// zur Vermeidung von Quelltextduplizierung
		schreibeKreis();
		System.out.println("Hoehe: "+hoehe);		
	}
}

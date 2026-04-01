
public class Zylinder extends Kreis {
	double hoehe = 0.0;
	
	// Methode überschreibt die geerbte
	public void schreibe() {
//		System.out.println("Radius: "+radius);
//		System.out.println
//		("Ist er gefuellt? "+istGefuellt);
	// Aufruf der überschriebenen Methode aus der Superklasse	
		super.schreibe();
		System.out.println("Hoehe:  "+hoehe);
	}
}

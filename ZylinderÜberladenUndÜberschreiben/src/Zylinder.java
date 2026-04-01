
public class Zylinder extends Kreis {
	double hoehe = 0.0;
	
		// überschreibt geerbte Methode
		// Methode überschreibt <und> ist überladen
	public void skaliere(double einheitsfaktor) {
			// Aufruf der überschriebenen 
		super.skaliere(einheitsfaktor);
		hoehe *= einheitsfaktor;
	}
	
		// überlädt die mit nur einem Parameter
	public void skaliere
		(double faktorRadius, double faktorHoehe) {
		super.skaliere(faktorRadius);
		hoehe *= faktorHoehe;
	}
	
	public void schreibe() {
		super.schreibe();
		System.out.println("Hoehe:  "+hoehe);
	}
}

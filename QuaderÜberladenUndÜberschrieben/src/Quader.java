
public class Quader extends Rechteck {
	int hoehe=0;
	
	// Methode überschreibt u. ist überladen!
	// 1. Version mit nur einem Parameter
	public void vervielfache(int einheitsfaktor) {
		super.vervielfache(einheitsfaktor);
		hoehe *= einheitsfaktor;
	}
	
	// 2. Version mit drei verschiedenen Par.
	public void vervielfache
		(int faktorLaenge, int faktorBreite, int faktorHoehe) {
		vervielfache(faktorLaenge, faktorBreite);
		hoehe *= faktorHoehe;
	}
	
	public void schreibe() {
		super.schreibe();
		System.out.println("Hoehe:  "+hoehe);
	}
}
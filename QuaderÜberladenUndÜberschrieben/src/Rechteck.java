
public class Rechteck {
	int laenge=0, breite=0;
	
	// 1. Version mit nur einem Parameter
	public void vervielfache(int einheitsfaktor) {
		laenge *= einheitsfaktor;
		breite *= einheitsfaktor;
	}
	
	// 2. Version mit zwei verschiedenen Par.
	public void vervielfache
		(int faktorLaenge, int faktorBreite) {
		laenge *= faktorLaenge;
		breite *= faktorBreite;
	}
	
	public void schreibe() {
		System.out.println("Laenge: "+laenge);
		System.out.println("Breite: "+breite);
	}
}

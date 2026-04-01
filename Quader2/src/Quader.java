	// Subklasse ensteht aus Superklasse durch Verebung
public class Quader extends Rechteck {
	int hoehe=0;
	
	public void schreibeQuader() {
//		System.out.println("Laenge: "+laenge);
//		System.out.println("Breite: "+breite);
	// Aufruf der geerbten Methode der Superklasse
		schreibeRechteck();
		System.out.println("Hoehe:  "+hoehe);		
	}
}

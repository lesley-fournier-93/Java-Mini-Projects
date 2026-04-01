
public class Rechteck {
	int laenge=0, breite=0;
	
	public int berechneFlächeRechteck() {
		return laenge * breite;
	}
	
	public void vertauscheSeitenRechteck() {
		int hilf = laenge;
		laenge = breite;
		breite = hilf;
	}
	
	public void schreibeRechteck() {
		System.out.println("Laenge: "+laenge);
		System.out.println("Breite: "+breite);		
	}
}

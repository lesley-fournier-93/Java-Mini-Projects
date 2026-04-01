
public class Dreieck {
	int a=0, b=0, c=0;
	boolean istSchraffiert=false;

	public void eigenschaften() {
		schreibeDreieck();
		System.out.println
		("Ist es gültig? "+istGueltig());
		
		if (istGueltig()) {
			System.out.println
			("Ist es gleichseitig? "+istGleichseitig());
			System.out.println
			("Ist es gleichschenklig? "+istGleichschenklig());	
			System.out.println
			("Ist es rechtwinklig? "+istRechtwinklig());
		}
	}
	
	public boolean istGueltig() {
		return a+b>c  &&  a+c>b  &&  b+c>a;
	}
	
	public boolean istGleichseitig() {
		return a==b && b==c;
	}
	
	public boolean istGleichschenklig() {
		return a==b || a==c || b==c;
	}
	
	public boolean istRechtwinklig() {
		int aq=a*a, bq=b*b, cq=c*c;
		
		return aq+bq==cq || aq+cq==bq || bq+cq==aq;
	}
	
	public void schreibeDreieck() {
		System.out.println
		(a+", "+b+", "+c+", "+istSchraffiert);		
	}
}

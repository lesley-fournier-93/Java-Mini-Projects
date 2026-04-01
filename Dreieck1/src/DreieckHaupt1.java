
public class DreieckHaupt1 {

	public static void main(String[] args) {
		System.out.print  ("Dreieck \"d1\":  ");
		Dreieck d1 = new Dreieck();
		
		// Belegung:
		d1.a = 3;	d1.b=4; 	d1.c=5;
		d1.istSchraffiert=true;
		
		// Ausgabe:
		d1.schreibeDreieck();
	}

}

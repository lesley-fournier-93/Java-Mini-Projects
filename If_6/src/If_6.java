
public class If_6 {

	public static void main(String[] args) {
		int m = 3; // Monatsnummer zwischen 1 und 12
		
		System.out.print("Der Monat mit der Nummer " + m + " liegt ");
		
		if((m==2) || (m==3) || m==4)
			System.out.print("im Frühling");
		
		else if((m==5) || (m==6) || m==7)
			System.out.print("im Sommer");
		
		else if((m==8) || (m==9) || m==10)
			System.out.print("im Herbst");
		
		else if((m==11) || (m==12) || m==1)
			System.out.print("im Winter");
		
		else System.out.print("außerhalb des Bereiches von 1 bis 12");

	}

}

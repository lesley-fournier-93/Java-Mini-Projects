
public class Switch_4 {

	public static void main(String[] args) {
		int Monatsnummer =3; //(z.B.)
		
		System.out.print("Der Monat mit der Nummer " + Monatsnummer + " liegt ");
		
		switch (Monatsnummer) {
		
		case 3:		case 4:		case 5:		System.out.println("im Frühling"); break;
		case 6:		case 7:		case 8:		System.out.println("im Sommer"); break;
		case 9:		case 10:	case 11:	System.out.println("im Herbst"); break;
		case 12:	case 1:		case 2:		System.out.println("im Winter"); break;
		default: System.out.println("außerhalb des Bereiches von 1 und 12");
		}

	}

}

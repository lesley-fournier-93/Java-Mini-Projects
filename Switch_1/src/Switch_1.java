
public class Switch_1 {

	public static void main(String[] args) {
		int a=3; // (z.B.)
		
		System.out.println("Programm schreibt die Zahlen");

		System.out.println("von 1 bis 5 Buchstaben!");
		
		System.out.print(a+": ");
		
		switch (a) {
		
		case 1: System.out.println("eins"); break;
		
		case 2: System.out.println("zwei"); break;
		
		case 3: System.out.println("drei"); break;
		
		case 4: System.out.println("vier"); break;
		
		case 5: System.out.println("fünf"); break;
		
		default: System.out.println("Zahl außerhalb des Bereiches");
		}
		
	}

}

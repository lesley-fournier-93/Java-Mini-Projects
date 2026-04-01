
public class Mod_3 {

	public static void main(String[] args) {
		int n = 12;
		boolean teilerGefunden = false;
		System.out.println("Ist "+n+" eine Primzahl?");
		
		for(int i=2; i<n; i++)
			if(n%i == 0) {
				teilerGefunden = true;
				System.out.println(n+" ist teilbar durch "+i);
			}
		if (teilerGefunden)
			System.out.println(n+" ist keine Primzahl!");
		else 
			System.out.println(n+" ist eine Primzahl!");
	}

}


/*
 * Nachträgliche Fragestellungen ​
   zur Übungsaufgabe 3 ​
   zum Modulo-Operator ​
   und zum Primzahltest:​

   Wie ließe sich die Vorgehensweise mathematisch und vom Programmablauf her optimieren?
 */

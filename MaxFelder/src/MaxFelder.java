
public class MaxFelder {

	public static void main(String[] args) {
		int feldgröße = 100000;
		int[] feld = new int[feldgröße];
		
		belegeFeld(feld);
		max(feld);
		

	}
	
	public static void belegeFeld(int[] feld) {
		int einheitswert = 1,
			versteckStelle = feld.length/2,
			versteckWert = 2;
			
		for (int i = 0; i<feld.length; i++) //i:o..<feldgröße
			feld[i] = einheitswert;
		
		feld[versteckStelle] = versteckWert;
	}
	
	public static void max(int[] feld) {
		int maxBisJetzt = feld[0];
		
		for (int i=1; i<feld.length; i++) // i:1-- <feldgröße
			if (feld[i] > maxBisJetzt) // neues Maximum gefunden
				maxBisJetzt = feld[i];
		
		System.out.println("Das Maximum der "+feld.length+" Zahlen ist "+maxBisJetzt);
		
	}
}

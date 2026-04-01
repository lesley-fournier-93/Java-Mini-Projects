
public class Boolsch {

	public static void main(String[] args) {
		boolean a,b;
		System.out.println("\na\tb\ta&b\ta|b\n");
		
		a=false; b=false;
		System.out.println(a+"\t"+b+"\t"+(a&&b)+"\t"+(a||b));
		
		a=false; b=true;
		System.out.println(a+"\t"+b+"\t"+(a&&b)+"\t"+(a||b));
		
		a=true; b=false;
		System.out.println(a+"\t"+b+"\t"+(a&&b)+"\t"+(a||b));
		
		a=true; b=true;
		System.out.println(a+"\t"+b+"\t"+(a&&b)+"\t"+(a||b));

	}

}

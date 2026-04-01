
public class StackHaupt1 {

	public static void main(String[] args) {
		System.out.println
		("Ich lege einen Stack \"s1\" an:");
		Stack s1 = new Stack();
		s1.status();		
		
		System.out.println("\nJetzt pushe ich die 1:");
		s1.push(1);
		s1.status();
		
		System.out.println
		("\nJetzt rufen wir \"pop\" auf: "+s1.pop());
		s1.status();
	}

}

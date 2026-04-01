
public class Stack {
	public final int maxSize = 5;
	private int[] stack = new int[maxSize];
	private int size = 0;
	
	public void push(int ele) {
		if (isFull())
			System.out.println
			("> Fehler! \"push()\" auf vollem Stack!");
		else {
			stack[size] = ele;
			size++;
		}
	}
	
	public int pop() {
		int returnValue;
		
		if (isEmpty()) {
			System.out.println
			("Fehler! \"pop()\" auf leerem Stack!");
			returnValue = 0;
		} else {
			size--;
			returnValue = stack[size];
		}
		
		return returnValue;
	}
	
	public void status() {
		printStack();
		System.out.println();
		System.out.println
		("Wie groß ist er momentan? "+getSize());
		System.out.println
		("Wie groß ist er maximal? "+getMaxSize());
		System.out.println
		("Ist er leer? "+isEmpty());
		System.out.println
		("Ist er voll? "+isFull());
		System.out.println();
	}
	
	public void printStack() {
		System.out.println();
		for (int i=size-1; i>=0; i--)
			System.out.println("\t"+stack[i]);
		// Bodenplatte:
		for (int i=1; i<=17; i++)
			System.out.print  ("-");
		System.out.println();
	}
	
	public int getSize() {
		return size;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == getMaxSize();
	}
}

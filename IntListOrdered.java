public class IntListOrdered {
	
	private IntNode first;
	
	public IntListOrdered() {
		first = null;
	}
	
	public void add(IntNode src) {						// Very nasty method - can it be written better?
		IntNode current = first;
		if(first == null) { 						// nothing in list yet
			first = src;
			return;
		}
		
		if(first.getValue() > src.getValue()) { 			// if src is smallest in list
			src.setNext(first);
			first = src;
			return;
		}
			
		while(current.getNext() != null) {      
			if(current.getNext().getValue() < src.getValue()) { 	// if the next object is smaller than src, move forward in the list
				current = current.getNext();
			} else {					     	// else, put src in before the next one
				src.setNext(current.getNext());
				current.setNext(src);
				return;
			}	
		}
		current.setNext(src);					     	// add src to the end of the list
	}
	
	public void prettyPrint() {
		IntNode current = this.first;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
	public static void main (String[] args) {
		
		IntListOrdered testList = new IntListOrdered();
		
		IntNode newValue = new IntNode(3);
		testList.add(newValue);
		
		newValue = new IntNode(8);
		testList.add(newValue);
		
		newValue = new IntNode(1);
		testList.add(newValue);

		newValue = new IntNode(7);
		testList.add(newValue);

		newValue = new IntNode(8);
		testList.add(newValue);

		newValue = new IntNode(20);
		testList.add(newValue);

		newValue = new IntNode(0);
		testList.add(newValue);

		newValue = new IntNode(30);
		testList.add(newValue);

		newValue = new IntNode(4);
		testList.add(newValue);	
		
		testList.prettyPrint();
	}
}
		

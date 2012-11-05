public class IntQueue {
	 
	private IntNode first;
	
	public IntQueue() {
		first = null;
	}
	
	public void insert(IntNode newNode) {
		newNode.setNext(this.first);
		this.first = newNode;
	}
	
	public void retrieve() {
		IntNode current = this.first;
		while (current.getNext()!=null) {
			if (current.getNext().getNext()==null) {
				current.setNext();
			} else {
				current = current.getNext();
			}
		}
		
	}
	
	public int size() {
		IntNode current = this.first;
		int counter = 0;
		while(current != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}
	
	public void prettyPrint() {
		IntNode current = this.first;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
	public static void main(String[] args) {
		IntQueue tester = new IntQueue();
		System.out.println(tester.size());
				
		IntNode newNode = new IntNode(5);
		tester.insert(newNode);
		
		newNode = new IntNode(12);
		tester.insert(newNode);
		
		tester.prettyPrint();
		System.out.println(tester.size());
		
		tester.retrieve();
		
		tester.prettyPrint();
		System.out.println(tester.size());
	}		
}
		

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
	
	public void prettyPrint() {
		IntNode current = this.first;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
	public static void main(String[] args) {
		IntQueue tester = new IntQueue();
		
		IntNode newNode = new IntNode(5);
		tester.insert(newNode);
		
		newNode = new IntNode(12);
		tester.insert(newNode);
		
		tester.prettyPrint();
		
		tester.retrieve();
		
		tester.prettyPrint();
	}		
}
		

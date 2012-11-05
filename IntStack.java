public class IntStack {
	
	private IntNode first;
	
	public IntStack() {
		this.first = null;
	}
	
	public void push(IntNode newNode) {
		newNode.setNext(this.first);
		this.first = newNode;
	}
	
	public void pop() {
		if(!this.empty()) {
			this.first = this.first.getNext();
		}
	}
	
	public boolean empty() {
		if(this.first == null){
			return true;
		} else {
			return false;
		}
	}
	
	public void prettyPrint() {
		IntNode current = this.first;
		while(current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
	public static void main (String[] args) {
	
		IntStack tester = new IntStack();

		if(tester.empty()) {
			System.out.println("Stack is empty");
		}
		
		IntNode newNode = new IntNode(5);
		tester.push(newNode);
		
		newNode = new IntNode(6);
		tester.push(newNode);
		
		newNode = new IntNode(7);
		tester.push(newNode);
		
		newNode = new IntNode(8);
		tester.push(newNode);
		
		newNode = new IntNode(9);
		tester.push(newNode);
		
		newNode = new IntNode(10);
		tester.push(newNode);
		
		tester.prettyPrint();
		
		tester.pop();
		
		tester.prettyPrint();
		
		tester.pop();
		tester.pop();
		
		tester.prettyPrint();
		
		if(tester.empty()) {
			System.out.println("Stack is empty");
		}
	}
}
			
		

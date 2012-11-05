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
		if(this.first != null) {
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
}
			
		

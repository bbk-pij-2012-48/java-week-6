public class IntNode {
	
	private int value;
	private IntNode nextInt;
	
	public IntNode(int value) {
		this.value = value;
		this.nextInt = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public IntNode getNext() {
		return this.nextInt;
	}
	
	public void setNext(int value) {
		this.nextInt = new IntNode(value);
	}
}
	
	
	
	

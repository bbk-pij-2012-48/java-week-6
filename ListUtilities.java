public class ListUtilities {
	
	public static IntStack arrayToStack(int[] src) {
		
		IntStack dst = new IntStack();
		IntNode currentInt;
		
		for (int i=src.length-1 ; i>=0 ; i--) {
			currentInt = new IntNode(src[i]);
			dst.push(currentInt);
		}
		
		return dst;
	}
}

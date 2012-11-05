public class BubbleTest {
	
	public static void main(String[] args) {
		
		int [] input = {2,6,3,5,7,8,3,2};
		IntStack list = ListUtilities.arrayToStack(input);
		ListUtilities.bubbleSort(list).prettyPrint();
	}
}

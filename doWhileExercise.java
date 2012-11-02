public class doWhileExercise {
	private int totalMarks;
	private int distinctions;
	private int passes;
	private int fails;
	private int invalid;
	
	public doWhileExercise() {
		totalMarks = 0;
		distinctions = 0;
		passes = 0;
		fails = 0;
		invalid = 0;
	}
		
	public void readMarks() {
		int currentMark = 0;
		System.out.println("Enter marks, -1 to exit");
		do {
			currentMark = Integer.parseInt(System.console().readLine());
			if(currentMark>100||currentMark<0){
				invalid++;
			}else {
				totalMarks += currentMark;
				if(currentMark>=70){
					distinctions++;
				}else if(currentMark>=50){
					passes++;
				}else {
					fails++;
				}
			}
		} while(currentMark!=-1);
	}
	
	public static void main(String[] args) {
		doWhileExercise marks = new doWhileExercise();
		marks.launch();
	}
	
	private void launch() {
		readMarks();
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Distinctions: " + distinctions);
		System.out.println("Passes: " + passes);
		System.out.println("Fails: " + fails);
		System.out.println("Invalid Entries: " + invalid);
	}
}

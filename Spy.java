public class Spy {
	private static int spyCount = 0;
	private int iD;
	
	public Spy(int iD) {
		this.iD = iD;
		spyCount++;
		System.out.println("ID: " + this.iD);
		System.out.println("Number of spies: " + spyCount);
	}
	
	public void die() {
		System.out.println("Spy " + this.iD + " has been detected and eliminated");
		spyCount--;
		System.out.println("Number of spies: " + spyCount);
	}
	
	public static void main(String args[]) {
		Spy Dave = new Spy(23954);
		Spy Steve = new Spy(8934);
		Spy Alan = new Spy(2048534);
		Steve.die();
		Spy Stevinda = new Spy(38923);
		Dave.die();
	}
}
		
		

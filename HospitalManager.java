public class HospitalManager {
	private Patient patientListStart = null;
	
	public static void main(String[] args) {
		HospitalManager manager = new HospitalManager();
		manager.launch();
	}
	
	public void prettyPrint(){
		// add prettyPrint code here (see IntegerList.java for help
	}
	
	private void launch() {
		Patient firstPatient = new Patient("Dave", 23, "Black Death");
		patientListStart = firstPatient;
		Patient yetAnotherPatient = new Patient("Steve", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		yetAnotherPatient = new Patient("Alan", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		yetAnotherPatient = new Patient("Rod", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		yetAnotherPatient = new Patient("Mark", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		yetAnotherPatient = new Patient("Fi", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		yetAnotherPatient = new Patient("Richard", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		
		Patient temp = firstPatient; // Change this code using prettyPrint()
		do {
			temp.prettyPrint();
			temp = temp.nextPatient;			
		} while (temp.nextPatient!=null);
	}
}

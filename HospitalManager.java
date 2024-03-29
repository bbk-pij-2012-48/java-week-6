public class HospitalManager {
	private Patient patientListStart = null;
	
	public void prettyPrint() {
		Patient currentPatient = patientListStart;
		while(currentPatient!=null) {
			System.out.println(currentPatient.getName() + ", " + currentPatient.getAge() +
						", " + currentPatient.getIllness());
			currentPatient = currentPatient.getNextPatient();
		}
		System.out.println();
	}
	
	public void prettyPrintBackwards() {
		System.out.println("Printing backwards...");
		Patient currentPatient = patientListStart;
		while (currentPatient.getNextPatient()!=null) {
			currentPatient = currentPatient.getNextPatient();
		}
		// current patient is now the last in the list
		while(currentPatient!=null) {
			System.out.println(currentPatient.getName() + ", " + currentPatient.getAge() +
						", " + currentPatient.getIllness());
			currentPatient = currentPatient.getLastPatient();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HospitalManager manager = new HospitalManager();
		manager.launch();
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
		
		this.prettyPrint();
		this.prettyPrintBackwards();
		
		patientListStart.deletePatient("Richard"); 
		patientListStart.deletePatient("Rod");
		// not sure about how to define a patient in the list - maybe should just change 
			// deletePatient(Patient) method to deletePatient(String) method to search for name
		
		this.prettyPrint();
		this.prettyPrintBackwards();
		
		yetAnotherPatient = new Patient("Mia", 18, "Crohn's Disease");
		patientListStart.addPatient(yetAnotherPatient);
		
		patientListStart.deletePatient("Janina");
		
		this.prettyPrint();
		this.prettyPrintBackwards();
		
	}
}

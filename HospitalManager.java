public class HospitalManager {
	private Patient patientListStart = null;
	
	public void prettyPrint(){
		Patient currentPatient = patientListStart;
		while(currentPatient!=null) {
			System.out.println(currentPatient.getName() + ", " + currentPatient.getAge() +
						", " + currentPatient.getIllness());
			currentPatient = currentPatient.getNextPatient();
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
		this.patientListStart.deletePatient("Richard"); 
		this.patientListStart.deletePatient("Rod");
		// not sure about how to define a patient in the list - maybe should just change 
			// deletePatient(Patient) method to deletePatient(String) method to search for name
		
		this.prettyPrint();
	}
}

public class HospitalManager {
	private Patient patientListStart = null;
	
	public static void man(String[] args) {
		HospitalManager manager = new HospitalManager;
		manager.launch();
	}
	
	private void launch() {
		Patient firstPatient = new Patient("Dave", 23, "Black Death");
		patientListStart = firstPatient;
		Patient yetAnotherPatient = new Patient("Steve", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient yetAnotherPatient = new Patient("Alan", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient yetAnotherPatient = new Patient("Rod", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient yetAnotherPatient = new Patient("Mark", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient yetAnotherPatient = new Patient("Fi", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient yetAnotherPatient = new Patient("Richard", 49, "Syphillis");
		patientListStart.addPatient(yetAnotherPatient);
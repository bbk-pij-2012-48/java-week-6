public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getIllness() {
		return this.illness;
	}
	
	public Patient getNextPatient(){
		return this.nextPatient;
	}
	
	public void addPatient(Patient newPatient){
		if(this.nextPatient==null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(String patientName) {
		if (this.nextPatient==null) {
			return false;
		} else if(this.nextPatient.name.equals(patientName)) {
			// This is the patient we were after
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patientName);
		}
	}
	
}

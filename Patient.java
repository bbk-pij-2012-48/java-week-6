public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient lastPatient;	
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.lastPatient = null;
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
	
	public Patient getNextPatient() {
		return this.nextPatient;
	}
	
	public Patient getLastPatient() {
		return this.lastPatient;
	}
	
	public void addPatient(Patient newPatient){
		if(this.nextPatient==null) {
			this.nextPatient = newPatient;
			newPatient.lastPatient = this;         
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(String patientName) {
		if (this.nextPatient==null) {
			return false;
		} else if(this.nextPatient.name.equals(patientName)) {
			// This is the patient we were after
			this.nextPatient = nextPatient.nextPatient; // Why does nextPatient.nextPatient work when nextPatient is private? **********************
			if(nextPatient!=null) {
				nextPatient.lastPatient = this;
			}
			return true;
		} else {
			return this.nextPatient.deletePatient(patientName);
		}
	}
	
}

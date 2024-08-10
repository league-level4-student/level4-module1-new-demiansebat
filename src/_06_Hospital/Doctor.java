package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	private ArrayList<Patient> patientList= new ArrayList<Patient>();
	
	protected abstract void doMedicine();

	protected void assignPatient(Patient patient) throws DoctorFullException {
if(patientList.size()<3) {
	patientList.add(patient);
		}
else {
	throw new DoctorFullException();
}

		
	}
	public List<Patient> getPatients() {
	return patientList;
	}
	public abstract boolean makesHouseCalls();

	public abstract boolean performsSurgery();

}

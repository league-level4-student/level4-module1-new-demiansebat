package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	private ArrayList<Patient> patientList= new ArrayList<Patient>();
	
	protected abstract void doMedicine();

	protected void assignPatient(Patient patient) {
if(patientList.size()<3) {
	patientList.add(patient);
		}

		
	}
	public List<Patient> getPatients() {
	return patientList;
	}
	public abstract boolean makesHouseCalls();

	public abstract boolean performsSurgery();

}

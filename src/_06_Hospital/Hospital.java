package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	private ArrayList<Patient> patientList = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		doctorList.add(doctor);
	}

	public void addPatient(Patient patient) {
patientList.add(patient);		
	}

	public List<Doctor> getDoctors() {
		return doctorList;
	}

	public List<Patient> getPatients() {
		
		return patientList;
	}

	public void assignPatientsToDoctors() {
	for( Patient p: patientList) {
	for(Doctor d:doctorList) {
		d.assignPatient(p);
	}
		
	}
		
	}
}

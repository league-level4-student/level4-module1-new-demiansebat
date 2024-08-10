package _06_Hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor{

	public boolean performsSurgery() {
		
		return true;
	}

	public boolean makesHouseCalls() {
		
		return false;
	}

	@Override
	protected void doMedicine() {
		// TODO Auto-generated method stub
		ArrayList <Patient>allPatients= (ArrayList) getPatients();
		for(Patient a:allPatients) {
			a.checkPulse();
		}
	}

}

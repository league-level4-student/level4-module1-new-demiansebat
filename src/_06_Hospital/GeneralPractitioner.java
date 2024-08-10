package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class GeneralPractitioner extends Doctor{

	public boolean makesHouseCalls() {
	
		return true;
	}

	public boolean performsSurgery() {
		// TODO Auto-generated method stub
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

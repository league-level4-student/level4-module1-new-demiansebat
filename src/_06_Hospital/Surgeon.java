package _06_Hospital;

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
		
	}

}

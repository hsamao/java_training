package carProcess;

public abstract class Honda implements Car {

	

	@Override
	public void tootHorn() {
		System.out.println("Honda is honking!");
		
	}

	@Override
	public void idle() {
		System.out.println("Honda is idle!");
		
	}

}

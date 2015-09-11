package carProcessPhase2;

public class Honda implements Car {
	static Honda honda3 = new HondaCRV ();
	
	public void drive () {
		System.out.println("Honda is driving!");
		//honda3.idle();
		honda3.drive();
		
	}

	@Override
	public void tootHorn() {
		System.out.println("Honda is honking!");
		
		
	}

	@Override
	public void idle() {
		System.out.println("Honda is idle!");
		
	}

}

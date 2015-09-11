package carProcess;

public class HondaCRV extends Honda {
	@Override
	public void drive () {
		System.out.println("HondaCRV is driving");
	}
	public void tootHorn () {
		System.out.println("Toot");
	}
	
	public void idle() {
		System.out.println("HondaCRV is Idle");
	}
}

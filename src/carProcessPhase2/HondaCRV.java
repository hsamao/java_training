package carProcessPhase2;

public class HondaCRV extends Honda {
		public void flying () {
		System.out.println("HondaCRV is flying");
	}
	@Override
	public void drive () {
		System.out.println("HondaCRV is driving");
		
		super.idle();
	}
	public void tootHorn () {
		System.out.println("Toot");
	}
	
	/* public void idle() {
		System.out.println("HondaCRV is Idle");
		
	} */
}

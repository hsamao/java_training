package carProcessPhase3;

public class HondaCRV extends Honda{
	private int price = 4000;
	private int maxSpped = 190;
	//static Honda honda;
	static HondaCRV hondacrv;
	
	public void drive () {
		
		System.out.println("HondaCRV is driving!");
		super.idle();
		
	}
	
	public void idle () {
		System.out.println("HondaCRV is idle!");
	}
	
	void runHonda() {
		super.drive();
	}
	
	static void engineModel () {
		System.out.println("3000 series!");
	}
	
	
	
	public static void main (String [] agrs) {
		hondacrv = new HondaCRV();
		hondacrv.drive();
		
		System.out.println();
		hondacrv.runHonda();
		
		System.out.println();
		engineModel();
		tootHorn();
	}
	
}

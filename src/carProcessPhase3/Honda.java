package carProcessPhase3;

public abstract class Honda {
	static Honda honda3 = new HondaCRV ();
	public  void drive () {
		System.out.println("Honda is driving!");
		honda3.idle();
	}
	public static void tootHorn () {
		System.out.println("Honda is Honking");
	}
	public void idle () {
		System.out.println("Honda is idle");
	}
}

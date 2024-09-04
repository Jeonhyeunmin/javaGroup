package t50_ex;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // 덮어버림
		
		snowTire.run(); //스노우 런
		tire.run();
	}
}
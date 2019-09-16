package lab2_2.ex2;

public class MobileComputer extends Computer implements Chargeable{
	private int battery;
	public MobileComputer() {
		secret= "MobileComputer secret";
		battery =5;
	}
	@Override
	public void work() {
		if (battery >0) {
			System.out.println("It is working on my lap.");battery--;
		}else {
			System.out.println("Running out of battery.");
		}
	}
	public void charge() {
		if (battery<10) {
			battery++;
		}
	}
	// i add the "implements Chargeable" behind the Computer to make the program work. Chargeable is a interface, which is kind of like a user interface whcih can be used by other object.
	// but the object cannot directly use the methods inside am interface without explicitly indicate that "I am using this interface" (without implements .......)
	// that is why the original charge(m) didn't work.

}

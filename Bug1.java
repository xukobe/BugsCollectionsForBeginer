import java.util.Random;

public class Bug1 {
	/* Intent of this function is to generate a random even value
	 * between 0 to 100.
	 * If the value is odd, return false,
	 * otherwise return true.
	 * The value generated is passed back by parameter.
	 */
	public static boolean generateRandomEvenValue(int value) {
		Random r = new Random();
		value = r.nextInt(100);
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random_value = -1;
		int counter = 0;
		while(generateRandomEvenValue(random_value)) {
			counter++;
			System.out.println("Generated random value is even: " + random_value);
		}
		
		System.out.println("Even numbers are generated continously for " + counter + " times.");
		
	}

}

import java.util.Random;

public class Bug1 {
	/* Intent of this function is to generate a random even value
	 * between 0 to 100.
	 * If the value is odd, return false,
	 * otherwise return true.
	 * The value generated is passed back by parameter.
	 */
	private int val;
	public Bug1(int a) {
		this.val=a;
	}
	public void setVal(int b) {
		val=b;
	}
	public int getVal() {
		return val;
	}
	public static boolean generateRandomEvenValue(Bug1 value) {
		Random r = new Random();
		value.setVal(r.nextInt(100));
		int a=value.getVal();
		if (a % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bug1 random_value = new Bug1(-1);
		int counter = 0;
		while(generateRandomEvenValue(random_value)) {
			counter++;
			System.out.println("Generated random value is even: " + random_value.getVal());
		}
		
		System.out.println("Even numbers are generated continously for " + counter + " times.");
		
		Bug1[] b=new Bug1[2];
		for(int i = 0; i < 2; i++) {
			b[i] = new Bug1(i);
		}
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
	}

}

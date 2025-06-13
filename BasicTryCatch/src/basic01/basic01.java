package basic01;

public class basic01 {

	public static void main(String[] args) {

		try {
			System.out.println(24 / 0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("hii");
	}
}
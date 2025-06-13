package basic01;

public class basic05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };
		String name = null;
		try {
			System.out.println(a[2 / 2]);
			System.out.println(a[1]);
			System.out.println(name.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index not found!!!!");
		} catch (ArithmeticException e) {
			System.out.println("Infinite!!!!");
		} catch (NullPointerException e) {
			// ToDO: handle exception
			System.out.println("Null Exception");
		} finally {
			System.out.println("Bye Bye");
		}
	}

}

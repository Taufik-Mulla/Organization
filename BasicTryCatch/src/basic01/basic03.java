package basic01;

public class basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a[2]);
		System.out.println(a[1]);
		try {
			System.out.println(a[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Not found!!!!");
		}
	}
}
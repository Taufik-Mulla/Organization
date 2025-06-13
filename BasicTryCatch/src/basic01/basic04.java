package basic01;

public class basic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };
		try {
			//System.exit(0);
			System.out.println(a[2 / 0]);
			System.out.println(a[9]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index not found!!!!");
			System.out.println("Infinite!!!");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Bye Bye");
		}
	}
}

package basic01;

public class basic02 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
	
		String name = "Rahul";
		System.out.println(name.length());
		String name1 = null;
		try {
			System.out.println(name1.length());
		} catch (NullPointerException e) {
			System.out.println(0);
		}
	}

}

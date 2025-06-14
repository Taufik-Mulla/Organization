package com.April;

import java.util.Scanner;

public class Dem04 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			float num2 = sc.nextFloat();
			short num3 = sc.nextShort();
			boolean flag = sc.nextBoolean();
			String name = sc.next();
			char ch = sc.next().charAt(0);

			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(flag);
			System.out.println(name);
			System.out.println(ch);
		}
	}

}

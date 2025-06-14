package com.April;

public class Numbers {

	public static void main(String[] args) {

		int num1 = 134;
		int num2 = 997;
		int num3 = 89;

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + "is greatest");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + "is gratest");
		} else {
			System.out.println(num3 + "is greatest");
		}
	}
}
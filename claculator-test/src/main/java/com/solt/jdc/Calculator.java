package com.solt.jdc;

import java.util.Scanner;

public class Calculator {

	public int add(int i, int j) {
		return i+j;
	}

	public int subtract(int i, int j) {
		
		return i-j;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Digit1 :");
		int digit1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Digit2 :");
		int digit2 = Integer.parseInt(sc.nextLine());
		System.out.println("1.Addition");
		System.out.println("2.Subtration");
		System.out.print("Choices Operator :");
		String ope = sc.nextLine();
		int d3 = 0;
		switch (ope) {
		case "1":
			d3 = cal.add(digit1, digit2);
			System.out.printf("Digit1 %s Digit2 = %d",ope,d3);
			break;
		case "2":
			d3 = cal.subtract(digit2, digit2);
			System.out.printf("Digit1 %s Digit2 = %d",ope,d3);
			break;

		default:
			break;
		}
	}

}

package exception;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter long value");
		long l = sc.nextLong();
		System.out.println(l);
		
		System.out.println("Enter int value");
		int i = sc.nextInt();
		System.out.println(i);
		
		System.out.println("Enter boolean value");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter double value");
		double d = sc.nextDouble();
		System.out.println(d);
	}
}

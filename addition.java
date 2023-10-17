package BASICS;

import java.util.Scanner;

public class addition {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("enter the  Principal amount =");
int p=scan.nextInt();
System.out.print("enter the Rate of Interest amount =");
int r=scan.nextInt();

System.out.print("enter the Time =");
int t=scan.nextInt();
int i=(p*t*r)/100;
System.out.println("The Interest amount is   "+i);

	}
}

package com.interview;

import java.util.Scanner;

public class ReverseAndSum {
	

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int num=scan.nextInt();
		int n=0;
		int rev=0;
		int sum=0;
		int que=0;
		int i=0;
		while (num>0) 
		{
			n=num%10;//1234%10
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println("The reverse number is :"+rev);
		System.out.println("Enter how many numbers to add");
		int k=scan.nextInt();
		double deno=Math.pow(10, k-1);
		switch (k) {
		case 1:
			i=1000;
			break;
		case 2:
			i=100;
			break;
		case 3:
			i=10;
			break;
		case 4:
			i=0;
			break;
		default:
			System.out.println("invalid number");
			break;
		}
		while (rev>i)
		{
			
			que=(int) (rev/deno);//4321/1000
			
			
			sum=sum+que;
		rev=(int) (rev%deno);
			deno=deno/10;
			
		}
		System.out.println("sum of "+k+" numbers is :"+sum);
		
	}

}

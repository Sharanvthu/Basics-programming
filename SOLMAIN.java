package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class SOLMAIN {
	static int count;


		public static void main(String[] args) {
			SOL s= new SOL("Fitbit",7980);
			SOL s1= new SOL("Ipods",22349);
			SOL s2= new SOL("MI Band",999);
			SOL s3= new SOL("Cult Pass",2799);
			SOL s4= new SOL("MAC Pro",229900);
			SOL s5= new SOL("Digital Camera",11101);
			SOL s6= new SOL("Alexa",9999);
			SOL s7= new SOL("Sandwich Toster",2195);
			SOL s8= new SOL("Micro oven",9800);
			SOL s9= new SOL("Scale",4900);
			System.out.println("goodies "+"           Prices");
		
			SOL[] a={s,s1,s2,s3,s4,s5,s6,s7,s8,s9};
			
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			System.out.println("========================");
			Scanner scan=new Scanner(System.in);
			count=scan.nextInt();
			for (int i = count; i <count+count; i++) {
				System.out.println(a[i]);
			}
		
	}

}

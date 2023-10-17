package prepare;

import java.util.Arrays;

public class Largest
{
	 
	public static void main(String[] args)
	{
		int a1=0;
		int a2=0;
		int[] a={10,25,50,60,12,40,35};
		
		 
		System.out.println("Before sort");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("after sort");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}

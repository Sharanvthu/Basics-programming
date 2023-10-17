package BASICS;

public class armStrong {
	static int count(int n)
	{
		int count =0;
		while (n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

	static int power(int n,int c)
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int pow=1;
			for (int i = 1; i <= c; i++) {
				pow=pow*r;
			}
			sum+=pow;n/=10;

		}
		return sum;

	}

	public static boolean isArmString(int n)
	{
		if (n==power(n, count(n))) {
			return true;
		}
		else
			return false;
	}

	public static void armStringRange(int a,int b)
	{
		for (int i = a; i <=b; i++) 
		{
			if(isArmString(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		armStringRange(1, 2000);
	}

}

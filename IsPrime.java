
public class IsPrime {

	public static int isPrime(int num)
	{
		if (num<=1) 
		{
			return 0 ;
		}
		for (int i = 2; i < num/2; i++) 
		{
			if(num%i==0)
				return 0;
		}
		return num;
	}
	public static void main(String[] args) 
	{
System.out.println(isPrime(2));
	}

}

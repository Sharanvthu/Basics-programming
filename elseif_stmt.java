
public class elseif_stmt {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) 
		{
			if (i%5==0 && i%3==0) 
			{
				System.out.println(i+" is divisible by 3 & 5");
				
			}
			else if(i%2==0)
			{
				System.out.println(i+" is even");
			}
			else
			{
				System.out.println(i+" is odd");
			}
		}
	}

}


public class conjLetter
{

	public static void main(String[] args) 
	{
		String s="sasasa";
		char[] a=s.toCharArray();
		int count=1;
		int n=0;
		String ch="";
		for (int i = 0; i < a.length-1; i++)
		{
			for (int j = i+2; j < a.length-1; j+=2) 
			{
				if(a[i]==a[j])
				{
					count++;
					n=count;
				}
			}
			System.out.println(a[i]+" is conjugative letter of  "+n+" times");

		}

	}
}

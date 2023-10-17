package BASICS;

public class Nanu {

	public static void main(String[] args) {
		int i, j, end = 21, isPrime = 1, sum = 0;

		for(i= 2; i <= end; i++)

		{

			for(j= 2; j < 1/2; j++)

			{

				if(i % j == 0)

				{

					isPrime = 0;

					break;

				}

			}

			if (isPrime == 1)
			{
				sum += i;

			}
			System.out.println(sum);
		}
		
	}
}


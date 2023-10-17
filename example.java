import java.util.Scanner;

public class example {
	static int num;
	static int cost;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while (true) {
			System.out.println("Enter the unit");
			num=s.nextInt();
			if(num<0){
				System.out.println("Invalid unit entry");
			}
			else if(num<=200)
			{
				System.out.println("free");
			}
			else if ((num>=200)&&(num<=250)) 
			{
				cost=(num-200)*3;
				System.out.println("The cost for "+num+" units is :"+cost+" RS/-");
			}
			else if ((num>=250)&&(num<=300)) 
			{
				cost=(50*3)+(num-250)*5;
				System.out.println("The cost for "+num+" units is :"+cost+" RS/-");
			}
			else if ((num>=300)&&(num<=350)) 
			{
				cost=(50*3)+(50*5)+(num-300)*7;
				System.out.println("The cost for "+num+" units is :"+cost+" RS/-");
			}
			else {
				cost=(50*3)+(50*5)+(50*7)+(num-350)*10;
				System.out.println("The cost for "+num+" units is :"+cost+" RS/-");
			}
		}

	}

}

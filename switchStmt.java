import java.util.Scanner;

public class switchStmt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("======================");
			System.out.println("Enter the Character");
			char grade=s.next().charAt(0);

			switch(grade){
			case 'A':System.out.println("Distinction");break;
			case 'B':System.out.println("First Class");break;
			case 'C':System.out.println("Second Class");break;
			case 'F':System.out.println("Failed");break;
			default:System.out.println("Entered grade is invalid");
			}
		}
	}

}

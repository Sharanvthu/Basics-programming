package BASICS;

public class bank1 {

	public bank1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double accbal=15000.00;
		double deposite=2000.00;
		double withdraw=1500.00;
		System.out.println("Account balance is  "+accbal);
		accbal+=deposite;
		System.out.println("Account balance after deposite  "+deposite+" is "+accbal);
		while(accbal>500)
		{
		
		
		accbal-=withdraw;
		System.out.println("Account balance after withdraw  "+withdraw+" is "+accbal);
		}

	}

}

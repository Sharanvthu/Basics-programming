package BASICS;
public class PrimeExample{    
	public static void main(String args[]){    
		int n=10;
		int j;
		boolean flag=false;
		if(n==0||n==1)
		{
			System.out.println(n+"not prime");
		}
		for(int i=2;i<n;i++)
		{
for( j=i+1;j<=n;j++){
	if(i%j==0){
		flag=true;
	}
}
if(flag){
	System.out.println(i);
}
	
	}


}

}
package prepare;

public class CopyEle {

	public static void main(String[] args) 
	{
		int[] a={10,20,30};
		int[] b=new int[a.length];
		System.out.println("Length of an array is :"+a.length);
		System.out.println("first array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Copied array");
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}

	}

}

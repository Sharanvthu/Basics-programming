package BASICS;

public class pen {
String name;
String color;
double price;
	 pen(String name,String color,double price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}

	public static void main(String[] args) {
		pen p=new pen("writometer","black",25.00);
		System.out.println(p.name);
		System.out.println(p.color);
		System.out.println(p.price);
	}

}

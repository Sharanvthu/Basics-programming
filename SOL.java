package com.interview;


public class SOL implements Comparable<SOL>
{
	String Goodies;
	int Price;
	public SOL(String s,int p)
	{
		Goodies=s;
		Price=p;
	}
	public int compareTo(SOL s) {
		return this.Price-s.Price;

	}

	@Override
	public String toString() {
		return " " +Goodies +"           " +Price ;
	}

}

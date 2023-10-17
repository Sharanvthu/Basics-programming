package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analyst 
{
	
	static int n=5;
	static int getMaxProfit(List<Integer> price,List<Integer> profit)
	
	{
		if(n<3)
			return -1;
		int sum=0;
		for (int i = 0; i < n; i++) 
		{
			for (int j = i+1; j < i+2; j++) 
			{
				for (int k = i+2; k < i+3; k++) 
				{
					if(price.get(i)<price.get(j)&&price.get(j)<price.get(k))
					{
						 sum=profit.get(i)+profit.get(j)+profit.get(k);
					}
					
				}
			}
			
		}
		return sum;
	}

	public static void main(String[] args) 
	{
getMaxProfit(price, profit);
	}

}

package com.revature.service;

public class CompressString 
{
	public static String compress(String toComp)
	{
		String result = "";
		Character temp = toComp.charAt(0);
		
		int count = 1;
		
		for(int i = 1; i < toComp.length(); i++)
		{
			if(temp == toComp.charAt(i))
			{
				count++;
			}
			else
			{
				result += temp;
				result += count;
				
				temp = toComp.charAt(i);
				count = 1;
			}
		}
		
		result += temp;
		result += count;
		
		return result;
	}
}

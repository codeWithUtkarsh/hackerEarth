package com.utkarsh.hackerEarth.BasicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheStringProblem {

	public static void main(String[] args)
	{
		try(BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)))
		{
			String testCases = sc.readLine();
			if(testCases != null)
			{
				int test = Integer.parseInt(testCases);
				while (test>0) {

					 String inpStr = sc.readLine();
			            int lowV = 0;
			            int uppV = 0;
			            for(Character cha: inpStr.toCharArray())
			            {
			                if(Character.isUpperCase(cha))
			                {
			                	if(isVowel(cha))
			                	{
			                		uppV++;
			                	}
			                }else
			                {
			                	if(isVowel(cha))
			                	{
			                		lowV++;
			                	}
			                }
			            }
			            
			            if(lowV == 5 || uppV == 5)
			            {
			            	System.out.println("lovely string");
			            }else
			            {
			            	System.out.println("ugly string");
			            }
					test--;
				}
			}
		}catch (Exception e) {e.printStackTrace();}
	}
	
	private static boolean isVowel(Character cha)
    {
        switch(cha)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}

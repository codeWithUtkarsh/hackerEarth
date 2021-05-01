package com.utkarsh.hackerEarth.BasicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TheStringProblem {

	public static void main(String[] args)
	{
		try(BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)))
		{
			String testCases = sc.readLine();
			if(testCases != null)
			{
				int test = Integer.parseInt(testCases);
				T:
					while (test-- > 0) {

						String inpStr = sc.readLine();
						Set<Character> lowV = new HashSet<>();
						Set<Character> uppV = new HashSet<>();
						for(Character cha: inpStr.toCharArray())
						{
							if(isVowel(cha))
							{
								if(Character.isUpperCase(cha))
									uppV.add(cha);
								else
									lowV.add(cha);
							}

							if(lowV.size() ==5 || uppV.size() == 5)
							{

								System.out.println("lovely string");
								continue T;
							}
						}
						System.out.println("ugly string");
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

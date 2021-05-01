package com.utkarsh.hackerEarth.algo;

public class Bitmasking {

	/*
	 * This algo will generate all the subset from an array
	 */
	public static void main(String[] args)
	{
		printSubset(new int[] {1, 2, 3, 4, 5, 6});
	}
	
	private static void printSubset(int inpParam[])
	{
		int N = inpParam.length;
		System.out.println((1 << N));
		for (int i = 0; i < (1 << N); i++)
		{
			System.out.print("{");
			for (int j = 0; j < N; j++)
			{
				if((i & (1 << j)) > 0)
				{
					System.out.print(inpParam[j]);
				}
			}
			System.out.println("}");
		}
	}

}

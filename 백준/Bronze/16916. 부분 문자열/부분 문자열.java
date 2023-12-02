//import java.util.Scanner;
//import java.util.Arrays;

// Main.java file is not for submission.
// It is here for you to give means of testing.
// You can use any packages in "this" file but be careful on the submission files.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] table;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String p = br.readLine();

		makeTable(p);
//		Scanner scanner = new Scanner(System.in);

		System.out.println(search(s,p));
	}

	public static void makeTable(String p)
	{
		int pSize = p.length();
		table = new int[pSize];
		int j = 0;
		for(int i = 1; i < pSize; i++)
		{
			while(j > 0 && p.charAt(i) != p.charAt(j))
			{
				j = table[j-1];
			}
			if(p.charAt(i) == p.charAt(j))
			{
				table[i] = ++j;
			}
		}
	}

	public static int search(String s, String p)
	{
		int sSize = s.length();
		int pSize = p.length();
		int j = 0;
		for(int i = 0; i < sSize; i++)
		{
			while(j > 0 && s.charAt(i) != p.charAt(j))
			{
				j = table[j-1];
			}
			if(s.charAt(i) == p.charAt(j))
			{
				if(j == pSize-1)
				{
					j = table[j];
					return 1;
				}
				else
				{
					j++;
				}
			}
		}
		return 0;
	}
}

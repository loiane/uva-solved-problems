package com.loiane.volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 10071 - Back to High School Physics
 * 
 * Simplest problem ever... just output 2*v*t
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=1012
 * 
 * Runtime: 1.584s
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10071 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] num;
		int v, t;
		while ((line = in.readLine()) != null)
		{
			num = line.split(" ");
			v = Integer.parseInt(num[0]);
			t = Integer.parseInt(num[1]);
			System.out.println(calcDistance(v,t));
		}
	}
	
	public static int calcDistance(int v, int t){
		return v*t*2;
	}
}
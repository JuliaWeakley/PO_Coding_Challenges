
/*
 * Author: Julia Weakley
 * 
 */

import java.util.*; 
import java.io.*; 
import java.lang.*;
	
public class TextTwist 
{
	
	
/*
 * function that takes in an array of already-guessed words, the unscrambled 6-letter word and returns the total number of points the player scored in a particular round using the following rubric:

3-letter words are 1 pt
4-letter words are 2 pts
5-letter words are 3 pts
6-letter words are 4 pts + 50 pt bonus (for unscrambling the word)
Remember that invalid words (words that cannot be formed from the 6-letter unscrambled words) count as 0 pts.
 */
	
	static public int totalPoints(String[] te, String word) 
	{
		int s =0; 
		
		for(int j = 0;  j < te.length; j ++)
		{
			String t = te[j];
			int i = t.length();
			
			for(int x =0; x < word.length(); x++)
			{ 
				// check length of original word and whether it contains all the letters from the original one 
				
				if(!t.contains(word.substring(x, x+1)) && t.length() == word.length()   )
				{
					i = 0; 
					break; 
				} // end of if
			} // end of for

			if(i == 3)
			{
				s = s +1; 
			} // end of if
			else if(i == 4)
			{
				s = s+ 2;
			} // end of else if
			else if(i == 5)
			{
				s = s+ 3; 
			} // end of else if
			else if(i == 6)
			{
				s = s + 54; 
			} // end of else if
			else
			{
				s = s +0;
			} // end of else
		} // end of for
		
		return s; 
	}// end of totalPoints
	
	
	// testing with given examples
	public static  void main(String args[])
	{
		
		String temp []= {"cat", "create", "sat" };
		// should return 2
		System.out.println( totalPoints( temp , "caster") );
		
		String temp1 []= {"trance", "recant" };
		// should return 108
		System.out.println( totalPoints( temp1 , "recant") );
		
		String temp2 []= {"dote", "dotes", "toes", "set", "dot", "dots", "sted" };
		// should return 13
		System.out.println( totalPoints( temp2 , "tossed") );
	} // end of main
}// end of class

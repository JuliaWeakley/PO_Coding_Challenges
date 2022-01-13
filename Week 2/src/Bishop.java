import java.awt.List;
import java.util.ArrayList;

/*  Author: Julia Weakley 
 * Date : 1/13/2022
 * 
 * Description/ Task: 
 * Your chess teacher wants to know if a bishop can reach a certain spot on the board in the given amount of moves.
 * Given a starting square start, ending square end and the maximum number of moves allowed n. Return true if the 
 * ending square can be reached from the starting square within the given amount of moves. 
 * Keep in mind the chessboard goes from a1 to h8 (8x8).
 * 
 * Examples
 * <code>
 * 	bishop("a1", "b4", 2) ➞ true
 *  bishop("a1", "b5", 5) ➞ false
 *  bishop("f1", "f1", 0) ➞ true
 *  </code>Notes
 * Chessboard is always empty (only the bishop is there).
 * Bishop can move in any direction diagonally.
 * If the starting and ending square are the same, return true (even if the move is 0)
 * Square names will always be lowercase and valid.
 * 
 * 
*/ 
public class Bishop 
{

	static public Boolean bishop(String s ,String e, int n)
	{
		if(s.equals(e))
		{
			return true;
		}
		
		
		ArrayList<String> places = getL(s, e);
		// if end can be met within 1 move
		if(places.contains(e))
		{
			return true;
		}
		// first check to see if if\t can be done in 1 move
		else
		{
			Boolean  same  = cross(places, e);
			return same; 
		}
		
		
		
	}
	
	
	
	static public ArrayList<String> getL(String s, String e)
	{
		ArrayList<String> places = new ArrayList<String>();
		
		int st = Integer.parseInt( s.substring(1)) ;
		char t = s.charAt(0);
		// numeric value of letter in s
		int st1 = t - 'a' + 1; 
		//System.out.println(t + " " + st);
		
		
		// edge cases 
		// a1, h1 , a8 , h8
		if(s.equals("a1"))
		{
			for(int i =0; i< 7; i++)
			{
				st1 = st1 + 1; 
				st = st +1; 
				
				
				places.add( String.valueOf((char)(st1 + 64)).toLowerCase() +""+ st);
			}
		}
		else if (s.equals("h1"))
		{
			for(int i =0; i< 7; i++)
			{
				st1 = st1 - 1; 
				st = st + 1; 
				
				
				places.add( String.valueOf((char)(st1 + 64)).toLowerCase() +""+ st);
			}
		}
		else if (s.equals("a8"))
		{
			for(int i =0; i< 7; i++)
			{
				st1 = st1 +1; 
				st = st - 1; 
				
				
				places.add( String.valueOf((char)(st1 + 64)).toLowerCase() +""+ st);
			}
		}
		else if (s.equals("h8"))
		{
			for(int i =0; i< 7; i++)
			{
				st1 = st1 -1; 
				st = st - 1; 
				
				
				places.add( String.valueOf((char)(st1 + 64)).toLowerCase() +""+ st);
			}
		}
		else
		{

			int row =  st - 1; 
			int r = st; 
			int column = st1 ; 
			
			// up to the right 
			for(int i =0; i < row; i++)
			{
				 column = column +  1; 
				  r = r - 1; 
				  
				  places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
				
			}
			
			// up to left 
			 	r = st; 
				column = st1 ;
				int col = st1 -1 ; 
				
				for(int i =0; i < col; i++)
				{
					 column = column -  1; 
					  r = r - 1; 
					  
					places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
					
					
				}
				
				// Down to left 
			 	r = st; 
				column = st1 ;
				col = st1 -1 ; 
				
				for(int i =0; i < col; i++)
				{
					 column = column -  1; 
					  r = r + 1; 
					  
					places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
					
					
				}
				
				
				// down to right
				row =  8- st ; 
				r = st; 
				column = st1 ; 
				
				// up to the right 
				for(int i =0; i < row; i++)
				{
					 column = column +  1; 
					  r = r + 1; 
					  
					  places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
					
				}
		
		} // end of else 
		
		
		
		
		
		int end = Integer.parseInt( e.substring(1)) ;
		char et = e.charAt(0);
		// numeric value of letter in e
		int end1 =  et - 'a' + 1;
		//System.out.println(et + " " + end);
		
		
		return places;
	}
	
	static public Boolean cross(ArrayList<String> p,String e)
	{
		ArrayList<String> places = new ArrayList<String>();
		
		// number
		int st = Integer.parseInt( e.substring(1)) ;
		
		// letter
		char t = e.charAt(0);
		// numeric value of letter in s
		int st1 = t - 'a' + 1; 
		
		
		int row =  st - 1; 
		int r = st; 
		int column = st1 ; 
		
		// up to the right 
		for(int i =0; i < row; i++)
		{
			 column = column +  1; 
			  r = r - 1; 
			  
			  places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
			if(p.contains( String.valueOf((char)(column+ 64)).toLowerCase() +""+ r))
			{
				return true; 
			}
		}
		
		// up to left 
		 	r = st; 
			column = st1 ;
			int col = st1 -1 ; 
			
			for(int i =0; i < col; i++)
			{
				 column = column -  1; 
				  r = r - 1; 
				  
				places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
				
				if(p.contains( String.valueOf((char)(column+ 64)).toLowerCase() +""+ r))
				{
					return true; 
				}
			}
			
			// Down to left 
		 	r = st; 
			column = st1 ;
			col = st1 -1 ; 
			
			for(int i =0; i < col; i++)
			{
				 column = column -  1; 
				  r = r + 1; 
				  
				places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
				
				if(p.contains( String.valueOf((char)(column+ 64)).toLowerCase() +""+ r))
				{
					return true; 
				}
			}
			
			
			// down to right
			row =  8- st ; 
			r = st; 
			column = st1 ; 
			
			// up to the right 
			for(int i =0; i < row; i++)
			{
				 column = column +  1; 
				  r = r + 1; 
				  
				  places.add( String.valueOf((char)(column + 64)).toLowerCase() +""+ r);
				if(p.contains( String.valueOf((char)(column+ 64)).toLowerCase() +""+ r))
				{
					return true; 
				}
			}
	
		return false; 
	}
	
	public static  void main(String args[])
	{
		System.out.println( bishop("f1", "f1", 0) ); 
	}
}

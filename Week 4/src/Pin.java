/*
 * Author: Julia Weakley
 * Date: 1-24-2022
 */


public class Pin 
{

	public static Boolean validate(String pin) 
	{
		// checks to see if pin is empty
		if(pin.isEmpty() )
		{
			return false;
		}
		
		String p [] = pin.split(""); 
		
		// checks lenght of pin
		if(p.length != 4 && p.length != 6)
		{
			return false;
		} // end of if
		
		
		// checks each character in string to make sure there are only digits 
		for(int i =0; i < p.length; i++)
		{
			try{
				int temp = Integer.parseInt(p[i]);
			}// end of try
			catch(NumberFormatException nfe)
			{
				return false; 
			} // end of catch
		}// end of for
		
		return true; 
	}// end of validate
	
	// testing with given examples
		public static  void main(String args[])
		{
			System.out.println(validate("121317"));
			System.out.println(validate("1234") );
			System.out.println(validate("45135"));
			System.out.println(validate("89abc1"));
			System.out.println(validate("900876"));
			System.out.println(validate(" 4983"));
			System.out.println(validate(""));
		} // end of main
}

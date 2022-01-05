
public class MenuItem 
{
	public String name; 
	public String type; 
	public Double price; 
	
	

	public MenuItem(String n, String t, Double p)
	{
		name = n; 
		type = t; 
		price  = p; 
	}
	
	// returns item name
	public String GetName()
	{
		return name; 
	}
	
	// return type of item
	public String GetType()
	{
		return type; 
		
	}
	
	// return price of item 
	public Double GetPrice()
	{
		return price; 
	}
}

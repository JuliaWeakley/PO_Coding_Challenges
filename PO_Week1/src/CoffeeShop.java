/*
*	Author : Julia Weakley
*	Date: 1/05/2022
*/
import java.awt.List;
import java.util.ArrayList;

public class CoffeeShop 
{
	public static String name; 

	// list of items that includes item name, type (food or drink), and price
	public static ArrayList<MenuItem> menu; 

	// empty array
	public static ArrayList<String> orders; 
	
	// Method 1
	// adds name of item to end of orders array if item exists oon menu
	public String addOrder()
	{
		// NEED to add functionality to actually check this 
		if(menu.contains(name))
		{
			orders.add(name);
		}
		return "This Item is currently unavailable";
	}
	
	// Method 2
	// if the orders array is not empty versus if orders is empty
	public static String fulfillOrders()
	{
		if(orders.isEmpty() == false)
		{
			return "The " + name + " is ready!" ;
		}

		return "All Orders have been fulfilled!";
	}
	
	// Method 3
	// returns list of orders taken
	public ArrayList<String> listOrders(String o)
	{
		if(!o.isBlank())
		{
			orders.add(o);
		}
		return orders; 
		
	}
	
	// Method 4
	// returns total amount due for the orders taken 
	public static Double dueAmount()
	{
		Double total =0.0; 
		for(String i : orders)
		{
			for(MenuItem m : menu)
			{
				if(m.GetName().equals(i))
				{
					total  = total + m.GetPrice();
				}
			}
			
		}
		return total;
	}
	
	// Method 5
	// returns name of the cheapest item on the menu 
	public static String CheapsItem()
	{
		String cheap = ""; 
		Double it = 100.0; 
		for(MenuItem m : menu)
		{
			if(m.GetPrice() < it)
			{
				it = m.GetPrice(); 
				cheap = m.GetName();
			}
		}
		return cheap; 
	}
	
	// Method 6
	//  returns only  the item names of type drink from the menu 
	public static ArrayList<String> drinksOnly()
	{
		ArrayList<String> drinks = new ArrayList<String>() ; 
		for(MenuItem m : menu)
		{
			if(m.GetType().equalsIgnoreCase("drink") )
			{
				drinks.add(m.GetName());
			}
		}
		
		return drinks; 
	}
	
	// Method 7
	//  returns only  the item names of type drink from the menu 
	public static ArrayList<String> foodOnly()
	{
		ArrayList<String> food = new ArrayList<String>() ; 
		for(MenuItem m : menu)
		{
			if(m.GetType().equalsIgnoreCase("food") )
			{
				food.add(m.GetName());
			}
		}
		
		return food; 
	}

	
	
	
	
	
}

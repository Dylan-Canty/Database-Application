//Dylan Canty R00141587

import java.util.ArrayList;

public class Order 
{
	ArrayList<OrderDetails> orders = new ArrayList<OrderDetails>(); //Arraylist will manage OrderDetails
	
	public void add(Product product, int quantity)
	{
		orders.add(new OrderDetails(product, quantity));
	}
	
	public void print()
	{
		for(OrderDetails order : orders)
			order.print();
	}
}

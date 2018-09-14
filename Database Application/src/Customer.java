//Dylan Canty R00141587

import java.util.ArrayList;

public class Customer 
{
	String name;
	String address;
	ArrayList<Order> orders = new ArrayList<Order>();
	
	public Customer(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void print()
	{
		for(Order order : orders)
			order.print();
	}
	
	public void addOrder(Order order)
	{
		orders.add(order);
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public ArrayList<Order> getOrders() 
	{
		return orders;
	}
	
	public void setOrders(ArrayList<Order> orders) 
	{
		this.orders = orders;
	}
	
	public void getOrderDetails()
    {
        System.out.println("Name: " + this.name + "\nAddress: " + this.address);
        for(int i = 0; i < orders.size(); i++)
            orders.get(i).print();        
    }
}

//Dylan Canty R00141587

public class TestClass 
{

	public static void main(String[] args) 
	{
		Phone p = new Phone("Apple", "iphone6",64);
        Phone p1 = new Phone("Samsung","Galaxy s6",128); 
        Phone p2 = new Phone("Apple","iphone5",32);  
        Phone p3 = new Phone("Samsung","Galaxy s5",64); 
        
        ProductDB database = new ProductDB();
        database.add(p1);
        database.add(p);
        database.add(p2);
        database.add(p3);

        Customer Mary = new Customer("Mary", "70 New Street");
        Order o = new Order();
        o.add(p,12);
        o.add(p1,1);
        Mary.addOrder(o);
        
        Order o1 = new Order();
        o1.add(p2,1);
        o1.add(p3,5);
        Mary.addOrder(o1);
	}

}

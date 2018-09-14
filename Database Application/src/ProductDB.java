//Dylan Canty R00141587

import java.util.ArrayList;

public class ProductDB
{
    private ArrayList<Product> products;
    public ProductDB()
    {
    	products = new ArrayList<Product>();
    }

    public void add(Product product)
    {
    	products.add(product);
    }

    public void remove(int i)
    {
        if(i < products.size())
        {
        	products.remove(i);
            System.out.println("Success");

        }
        else
            System.out.println("Invalid index");

    }
    
    public Product findProduct(int id)
	{
		for(int i = 0;i < products.size(); i++)
			if(products.get(i).getProductID() == id)
				return products.get(i);
		
		return null;
	}

    public void print()
    {
        Product[] product = new Product[products.size()];
        for(int i =0; i < products.size(); i++)
        {
            System.out.println("Product ID: " + (i + 1));
            products.get(i).print();
            System.out.println();
        }
        if(products.size() == 0)
        System.out.println("No Products in stock");
    }
}
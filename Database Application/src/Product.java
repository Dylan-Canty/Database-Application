//Dylan Canty R00141587

public class Product
{
    private String name;
    private String description;
    private String model;
    private int price;
    private static int productID = 0;
    
    public Product()
    {
    	
    }
    
    public Product(String name)
    {
        this.name = name;
        this.productID++;
    }
    
    public Product(String name, String description, int price)
    {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productID++;
    }
    
    public Product(String name, String model)
    {
        this.name = name;
        this.description = model;
        this.productID++;
    }
    
    public int getProductID()
	{
		return productID;
	}
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return this.price;
    }
    
    public void print()
    {
        String s= "\nProduct Name: " + this.name+"\nDescription: " + this.description + "\nPrice: " + this.price;
        System.out.println(s);
    }
    
    public void print(String make, int storage, String model)
    {
        System.out.println("Company: " + make + "\nModel: " + model + "\nStorage: " + storage + "GB");
    }
    
    public void print(String name, String type, int screenSize, boolean has3D)
    {
        System.out.println("Name: " + name + "\nType: " + type + "\nScreen Size: " + screenSize + "\n3-D Compatibility: " + has3D);
    }
}
    


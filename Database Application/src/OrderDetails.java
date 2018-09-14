//Dylan Canty R00141587

public class OrderDetails 
{
    Product product;
    int quantity;
    public OrderDetails(){}
    public OrderDetails(Product product, int quantity)
    {
        this.product = product;
        this.quantity= quantity;
    }
    public void print()
    {
        System.out.println("Product Name: " + product.getName()+ " " + product.getDescription() + "\nQuantity: " + this.quantity);
    }
}
    
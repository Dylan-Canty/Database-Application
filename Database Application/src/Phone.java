//Dylan Canty R00141587

public class Phone extends Product
{
    private String make;
    private String model;
    private int storage;
    public Phone(){}
    public Phone(String phoneMake, String phoneModel, int storageSpace)
    {
        super(phoneMake, phoneModel);
        this.storage= storageSpace;
    }
    
    public void setMake(String make)
    {
        super.setName(make);
    }
    
    public String getMake()
    {
       return super.getName();
    }
    
    public void setModel(String model)
    {
        super.setDescription(model);
    }
    
    public String getModel()
    {
        return super.getDescription();
    }
    
    public void setStorage(int storage)
    {
        this.storage = storage;
    }
    
    public int getStorage()
    {
        return this.storage;
    }
    
    public void print()
    {
        super.print(this.getMake(),this.getStorage(), this.getModel());
    }
}
    
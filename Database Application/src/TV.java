//Dylan Canty R00141587

public class TV extends Product
{
    private String name;
    private String type;
    private int screenSize;
    private boolean has3D;
    
    public TV() //Basic Constructor for TV
    {
    	
    }

    public TV(String name, String type, int screenSize, boolean has3D)
    {
        super(name);
        this.type = type;
        this.screenSize = screenSize;
        this.has3D = has3D;
    }

    public void setName(String name)
    {
        super.setName(name);
    }
    
    public String getName()
    {
        return super.getName();
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return this.type;
    }

    public void setScreenSize(int screen_size)
    {
        this.screenSize = screen_size;
    }
    
    public int getScreenSize()
    {
        return this.screenSize;
    }

    public void setThreeD(boolean has3D)
    {
        this.has3D = has3D;
    }
    
    public boolean gethas3D()
    {
        return this.has3D;
    }

    public void print()
    {
        super.print (super.getName(), this.type, this.screenSize, this.has3D);
    }
}

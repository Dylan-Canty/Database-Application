//Dylan Canty R00141587

import java.util.ArrayList;
import java.util.Scanner;

class TestMenuApplication 
{
    public static void main(String args[])
    {
    	ArrayList<Customer> customer = new ArrayList<Customer>(); //Initilising customer arraylist
		ProductDB database = new ProductDB(); //Initilising product arraylist
	
		Scanner kb = new Scanner(System.in);
		int userInput = 0;
		int deviceID = 0;
		int customerID = 0; 
		boolean check;
		
		//We implement a do-while loop to ensure the menu to run at least once.
        do
        {
            check = true;
            userInput = 0;
           
            try
            {
            	//Main menu
            	System.out.println("What would you like to do?");
    			System.out.println("1. Create(Add) a product");
    			System.out.println("2. Search for a product by supplying the productID");
    			System.out.println("3. Display all products");
    			System.out.println("4. Order products");
    			System.out.println("5. Display all orders");
    			System.out.println("6. Quit");
    			userInput = kb.nextInt();
            }
            
            catch(IndexOutOfBoundsException e)
            {
            	//If the index is out of bounds, program terminates.
            	System.out.println("Index out of bounds. Please restart the program and try again.");
				break;
            }
            
            if(check == true )
            {

            	switch(userInput)
                {
            		
                    case 1: //Add a new phone or TV
                    int choice = 0;
                    System.out.println("CREATE A PRODUCT");
                    
                    do
                    {
                        System.out.println("1. Make a new Phone");
                        System.out.println("2. Make a new TV");
                        try
                        {
                            choice = kb.nextInt();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Invalid Input");
                        }
                    }
                    while(choice < 1 || choice > 2);
                    
                    boolean add = true;
                    kb.nextLine(); //Clears scanner buffer
                    switch(choice)
                    {
                        case 1:
                        add = true;
                        int storageSpace = 0;
                        
                        System.out.println("Please enter the creator of the phone: ");
                        String make = kb.nextLine();
                        System.out.println("Please enter phone model: ");
                        String model = kb.nextLine();
                        System.out.println("Please enter the storage space of the phone: ");
                        try
                        {
                        	storageSpace = kb.nextInt();
                        }
                        catch(IndexOutOfBoundsException e)
                        {
                            System.out.println("Ivalid Storage space");
                            add=false;
                        }
                        if(add == true)
                        {
                            Phone p = new Phone(make, model, storageSpace);
                            database.add(p);
                            deviceID++;
                            System.out.println("Phone Added. Device ID is "+ deviceID);
                        }
                        break;

                        case 2:	
                        add = true;
                        int screenSize = 0;
                        boolean has3D = true;
                        
                        System.out.println("Enter the company of the TV");
                        String name = kb.nextLine();
                        System.out.println("Enter the type of the TV");
                        String type = kb.nextLine();
                        System.out.println("Does the screen have 3-D capability? \nType 'True' for yes and 'False' for no:");
                        
                        try
                        {
                            has3D = kb.nextBoolean();
                        }
                        
                        catch(IndexOutOfBoundsException e)
                        {
                            System.out.println("Enter either true or false");
                            add = false;
                        }
                        
                        if(add == true)
                        {
                            System.out.println("Please enter the size of the screen:");
                            try
                            {
                                screenSize = kb.nextInt();
                            }
                            
                            catch(IndexOutOfBoundsException e)
                            {
                                System.out.println("Invalid screen size");
                                add = false;
                            }
                            
                            if(add == true)
                            {
                                TV newTV = new TV(name, type, screenSize, has3D);
                                database.add(newTV);
                                deviceID++;
                                System.out.println("TV Added. Device ID is "+deviceID);
                            }
                        }
                    }
                    kb.nextLine(); //Clears scanner buffer
                    System.out.println("Press enter to continue");
                    kb.nextLine(); //Clears scanner buffer
                    break;

                    case 2: //Search for a product by supplying the productID
                    System.out.println("SEARCH FOR A PRODUCT");
                    int productID = 0;
                    try
                    {
                        System.out.println("Enter the Product ID of the Product");
                        productID = kb.nextInt();
                    }
                    
                    catch(IndexOutOfBoundsException e)
                    {
                        System.out.println("Invalid Input");
                    }
                    
                    if(productID > 0 && productID <= deviceID)
                    {
                        if(database.findProduct(productID)!=null)
                        {
                            Product pr = database.findProduct(productID);
                            kb.nextLine();
                            pr.print();
                        }
                    }
                    
                    else
                    {
                        System.out.println("Invalid Product ID");
                    }
                    
                    kb.nextLine();
                    System.out.println("Press Enter to continue");
                    kb.nextLine();
                    break;

                    case 3: //Display all products in the database
                    System.out.println("DISPLAY ALL PRODUCTS IN THE DATABASE");
                    kb.nextLine();
                    database.print();
                    System.out.println("Press Enter to continue");
                    kb.nextLine();
                    break;

                    case 4: //Allow a customer to order some products (by productID) and set a quantity for each product.
                    System.out.println("ORDER PRODUCTS");
                    int n = -1;
                    System.out.print("Please enter your Customer ID.\nEnter -1 to register as a new customer");
                    
                    try
                    {
                        n = kb.nextInt();
                    }
                    
                    catch(Exception e)
                    {
                        n = -1;
                    }
                    
                    Customer c; //Call to Customer class
                    boolean checkCustomer = false;
                    kb.nextLine();
                    if(n < 0 || n > customerID)
                    {
                        if((n < 0 || n > customerID) && n != -1)
                            System.out.println("Invalid ID. ID does not exist.");
                        	System.out.println("ID will now be created.");
                        	System.out.println("Please enter your Name: ");
                        	String customerName = kb.nextLine();
                        	System.out.println("Please enter your Address: ");
                        	String address = kb.nextLine();
                        	c = new Customer(customerName, address); //Creating new customer object
                        	
                        if(customerName.length() > 0 && address.length() > 0)
                        {
                            customerID++;
                            System.out.println("Your Customer ID is " + customerID + ".");
                            customer.add(c); //Adding customer object to arraylist
                            checkCustomer = true;
                        }
                    }
                    
                    else
                    {
                        c = customer.get(customerID - 1);
                        checkCustomer = true;
                    }
                    
                    if(checkCustomer == true)
                    {
                        System.out.println("Enter the product ID followed by the quantity (Eg: 1 2)");
                        String s = kb.nextLine();
                        s.trim();
                      
                        int getproductID = 0;
                        int quantity = 0;
                        String i = "0";
                        String q = "0";
                        boolean valid = false;
                        
                        for(int j = 0; j < s.length(); j++)
                        {
                            if(s.charAt(j)!= ' ' && valid == false)
                                i += s.charAt(j);
                            
                            else if(s.charAt(j) == ' ')
                            {
                            	valid = true;
                                continue; //Continue to try
                            }
                            
                            if(valid == true)
                                q += s.charAt(j);
                        }
                        
                        try
                        {
                        	getproductID = Integer.parseInt(i);
                        	quantity = Integer.parseInt(q);
                        }
                        
                        catch(IndexOutOfBoundsException e)
                        {
                            System.out.println("Invalid Input. Eg of correct input is \"product_ID Quantity\" ");
                            valid = false;
                        }
                        
                        if(database.findProduct(getproductID)!=null&&valid==true)
                        {
                            Product pr = database.findProduct(getproductID);
                            Order o = new Order();
                            o.add(pr, quantity);
                            System.out.println("Your have ordered " + quantity + " " + pr.getName() + " " + pr.getDescription());
                            c.addOrder(o);

                        }
                        
                        else
                            System.out.println("Invalid Product ID");
                        System.out.println("Press Enter to continue");
                        kb.nextLine();
                    }
                    break;

                    case 5: //Display all orders
                    System.out.println("DISPLAY ALL ORDERS");
                    int x = -1;
                    try
                    {
                        System.out.println("Enter Customer ID");
                        x = kb.nextInt();
                    }
                    
                    catch(Exception e)
                    {
                        x = -1;
                    }
                    
                    if(x <= customerID && x > 0)
                        customer.get(x - 1).getOrderDetails();
                    
                    else
                        System.out.println("Invalid Customer ID");
                    	kb.nextLine();
                    	System.out.println("Press Enter to continue");
                    	kb.nextLine();
                    break;

                    case 6: //Quit
                    System.out.println("QUIT");
                    check = true;
                    userInput = -1;
                    System.out.println("Exiting.");
                    break; 

                    default:
                    if(userInput != -1)
                        System.out.println("Invalid integer. Please enter a number between 1-6");
                    else
                        System.exit(0);
                    check = false;

                }
            }
        }
        
        while(check == false || userInput != -1);
        kb.close();
    }
}
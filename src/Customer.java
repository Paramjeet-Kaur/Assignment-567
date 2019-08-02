import java.util.*;
public class Customer implements IDisplay, Comparable<Customer>
{
	//properties
	private int Customer_Id;
	private String First_Name;
	private String Last_Name;
	private String Full_Name;
	private String Email_Id;
	private ArrayList<Bill> Bills=new ArrayList<Bill>();
	private float Total_Amount;
public Customer(int CustomerId,String FirstName,String LastName,String email,ArrayList<Bill> Bills,float TotalAmount)
{
	//constructor
	this.Customer_Id=CustomerId;
	this.First_Name=FirstName;
	this.Last_Name=LastName;
	this.Full_Name=FirstName+ " "+LastName;
	this.Email_Id=email;
	this.Bills=Bills;
	this.Total_Amount=TotalAmount;
}

//getter setters
public int getCustomer_Id() {
	return Customer_Id;
}
public void setCustomer_Id(int customer_Id) {
	Customer_Id = customer_Id;
}
public String getFirst_Name() {
	return First_Name;
}
public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}
public String getLast_Name() {
	return Last_Name;
}
public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}
public String getFull_Name() {
	return Full_Name;
}
public void setFull_Name(String full_Name) {
	Full_Name = full_Name;
}
public String getEmail_Id() {
	return Email_Id;
}
public void setEmail_Id(String email_Id) {
	Email_Id = email_Id;
}
public ArrayList<Bill> getBills() {
	return Bills;
}
public void setBills(ArrayList<Bill> bills) {
	Bills = bills;
}
public float getTotal_Amount() {
	return Total_Amount;
}
public void setTotal_Amount(float total_Amount) {
	Total_Amount = total_Amount;
}

public void getCustomerById(Customer [] comparison)
{
	//Search customer by its id and displaying message if customer with that id does not exist
	Scanner Keyboard=new Scanner(System.in);
	System.out.println("Enter your customer ID");
	int customerId=Keyboard.nextInt();
	
	Boolean x=false;
	for(int i=0;i<comparison.length;i++)
	{
	if(customerId==comparison[i].Customer_Id)
	{
		x=true;
		System.out.println("Customer Full Name: "+comparison[i].Full_Name);
	}
	}
	if(x==false)
	{
		System.out.println("Please enter a valid Customer ID");
	}
	Keyboard.close();
}

//Display all bill details 
public void Display(ArrayList<Customer> getInfo)
{
	Collections.sort(getInfo);
	for(int i=0;i<getInfo.size();i++)
	{   	
		Collections.sort(getInfo.get(i).Bills);  //Syntax for dispaying sorted list of bills
		
		System.out.println("Customer ID is: "+ getInfo.get(i).Customer_Id);
		System.out.println("Customer Full Name: "+getInfo.get(i).Full_Name);
		System.out.println("Customer Email ID: "+getInfo.get(i).Email_Id);
		System.out.println("                         ----Bill information----");
		System.out.println("      *******************************************************");
		for(int j=0;j<getInfo.get(i).Bills.size();j++)
		{
			System.out.println("Bill ID: "+getInfo.get(i).Bills.get(j).getBill_Id());
			System.out.println("Bill Date :"+getInfo.get(i).Bills.get(j).getBill_Date());
			System.out.println("Bill Type :"+getInfo.get(i).Bills.get(j).getBill_Type());
			System.out.println("Bill Amount :"+getInfo.get(i).Bills.get(j).getTotal_Bill_Amount());
			{
				if(getInfo.get(i).Bills.get(j).getBill_Type()=="Internet Bill")
				{
				Internet internetInfoDisplay=(Internet)getInfo.get(i).Bills.get(j);
				System.out.println("Providers Name :"+internetInfoDisplay.getProvider_Name());
				System.out.println("Total GB used :"+internetInfoDisplay.getGB_used());
				}
				else if(getInfo.get(i).Bills.get(j).getBill_Type()=="Mobile Bill")
				{
				Mobile internetInfoDisplay=(Mobile)getInfo.get(i).Bills.get(j);
				System.out.println("Providers Name :"+internetInfoDisplay.getManufacturer_Name());
				System.out.println("Internet Usage :"+internetInfoDisplay.getGB_Used());
				}
				else if(getInfo.get(i).Bills.get(j).getBill_Type()=="Hydro Bill")
				{
				Hydro internetInfoDisplay=(Hydro)getInfo.get(i).Bills.get(j);
				System.out.println("Providers Name :"+internetInfoDisplay.getAgencyName());
				System.out.println("Total GB used :"+internetInfoDisplay.getUnit_Consumed());	
				}
				
				
			}
			
		}
		//Displaying total amount of Bill of each customer
		float Total=0;
		{
			for(int s=0;s<getInfo.get(i).Bills.size();s++)
		
		{
			Total+=getInfo.get(i).Bills.get(s).getTotal_Bill_Amount();
		}
			if(Total==0.0)
			{
				System.out.println("This person have NO Bills");
				System.out.println("");
			}
			else
			{
				System.out.println("********************************************************************");		
				System.out.println("Total bill amount to pay is: "+Total);
				System.out.println("********************************************************************");
			}
		
			
		}
	}
			
 }
//Comparator is used to compare customer ID in ascending order
@Override
public int compareTo(Customer c) {
	if(this.getCustomer_Id() < c.getCustomer_Id()) {
		return -1;
	} else if(this.getCustomer_Id() > c.getCustomer_Id()) {
		return 1;
	} else {
		return 0;
	}
}
}








import java.util.ArrayList;

public class MainCalling {

	public static void main(String[] args)
	{
		//creating  Internet bill
		Internet MacInt=new Internet(1,"2 April 2019","Internet Bill",32.0f,"Telus",3);
		Internet LizaInt=new Internet(2,"3 March 2019","Internet Bill",31.5f,"FIDO",4);
		
		//creating Mobile bill
		
		Mobile MacMob=new Mobile(3,"7 May 2018","Mobile Bill",35.2f,"Rogers","rog-34",432788888,10f,564);
		Mobile LizaMob=new Mobile(4,"6 May 2018","Mobile Bill",38.2f,"Chatter","chatter-72",436767558,11f,554);
		
		//creating Hydro Billpublic Hydro
		Hydro MacHydro=new Hydro(5,"9 May 2018","Hydro Bill",33.2f,"Enbridge",23f);
	    Hydro LizaHydro=new Hydro(6,"10 May 2018","Hydro Bill",37.2f,"purify",34f);
	    
	    //creating 3 customerspublic Customer(int CustomerId,String FirstName,String LastName,String FullName,ArrayList<Bill> Bills,float TotalAmount)
	    ArrayList<Bill> Bill1=new ArrayList<Bill>(3);  //creating array list for displaying customer1 bills having 3 bills
	    Bill1.add(MacInt);
	    Bill1.add(LizaMob);
	    Bill1.add(MacMob);
	    Customer Customer1=new Customer(2,"Parneet","Kaur","parneet67@yahoo.com",Bill1,34f);
	    
	    ArrayList<Bill> Bill2=new ArrayList<Bill>(2);   //creating array list for displaying customer2 bills having 2 bills
	    Bill2.add(MacHydro);
	    Bill2.add(LizaHydro);
	    Customer Customer2=new Customer(1,"Mehak","Chahal","mehakchahal45@gmail.com",Bill2,39f);
	   
	    ArrayList<Bill> Bill3=new ArrayList<Bill>(1);//creating array list for displaying customer3 bills having 1 bill
	    Bill3.add(LizaInt);
	    Customer Customer3=new Customer(4,"Roop","Sidhu","rupneet@yahoo.com",Bill3,79f);
	    
	    ArrayList<Bill> Bill4=new ArrayList<Bill>(0);//creating array list for displaying customer4 bills having 0 bill
	    Customer Customer4=new Customer(3,"Nav","Brar","Nav78@yahoo.com",Bill4,59f);
	    
	    ArrayList<Customer> C1= new ArrayList<Customer>();  //creating arraylist of customers 
	    C1.add(Customer1);
	    C1.add(Customer2);
	    C1.add(Customer3);
	    C1.add(Customer4);
	    
	    Customer customerList[]=new Customer[4];   //Store all customers in Array
	    customerList[0]=Customer1;
	    customerList[1]=Customer2;
	    customerList[2]=Customer3;
	    customerList[3]=Customer4;
	    
	   
	    Customer1.getCustomerById(customerList);
	    Customer1.Display(C1);
	}

}

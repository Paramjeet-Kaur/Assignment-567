
public class Customer 
{
	//properties
	int Customer_Id;
	String First_Name;
	String Last_Name;
	String Full_Name;
	String Email_Id;
	String Bill_List;
	float Total_Amount;
public Customer(int CustomerId,String FirstName,String LastName,String FullName,String BillList,float TotalAmount)
{
	//constructor
	this.Customer_Id=CustomerId;
	this.First_Name=FirstName;
	this.Last_Name=LastName;
	this.Email_Id=FullName;
	this.Bill_List=BillList;
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
public String getBill_List() {
	return Bill_List;
}
public void setBill_List(String bill_List) {
	Bill_List = bill_List;
}
public float getTotal_Amount() {
	return Total_Amount;
}
public void setTotal_Amount(int total_Amount) {
	Total_Amount = total_Amount;
}

}



public class Bill
{
	//Bill class properties
	int Bill_Id;
	int Bill_Date;
	String Bill_Type; 
	float Total_Bill_Amount;

	//Bill class constructor
public  Bill(int id,int date,String type,float total)
{
	this.Bill_Id=id;
	this.Bill_Id=date;
	this.Bill_Type=type;
	this.Total_Bill_Amount=total;
			
}

//Getter setters of Bill class
public int getBill_Id() {
	return Bill_Id;
}

public void setBill_Id(int bill_Id) {
	Bill_Id = bill_Id;
}

public int getBill_Date() {
	return Bill_Date;
}

public void setBill_Date(int bill_Date) {
	Bill_Date = bill_Date;
}

public String getBill_Type() {
	return Bill_Type;
}

public void setBill_Type(String bill_Type) {
	Bill_Type = bill_Type;
}

public float getTotal_Bill_Amount() {
	return Total_Bill_Amount;
}

public void setTotal_Bill_Amount(int total_Bill_Amount) {
	Total_Bill_Amount = total_Bill_Amount;
}

}
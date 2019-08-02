
public class Bill implements Comparable<Bill>
{
	//Bill class properties
	private int Bill_Id;
	private String Bill_Date;
	private String Bill_Type; 
	private float Total_Bill_Amount;

	//Bill class constructor
public  Bill(int id,String date,String type,float total)
{
	this.Bill_Id=id;
	this.Bill_Date=date;
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

public String getBill_Date() {
	return Bill_Date;
}

public void setBill_Date(String bill_Date) {
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
//Comparator is used to compar Bills  in descending order
@Override
public int compareTo(Bill o) 
{
	if(this.getTotal_Bill_Amount() < o.getTotal_Bill_Amount()) {
		return -1;
	} else if(this.getTotal_Bill_Amount() > o.getTotal_Bill_Amount()) {
		return 1;
	} else 
	return 0;
}
}
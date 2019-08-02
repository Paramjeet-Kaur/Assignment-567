
public class Mobile extends Bill
{
	//properties
	private String Manufacturer_Name;
	private String Plan_Name;
	private int Mobile_Number;
	private float GB_Used;
	private int Minute_Used;
	
	//Constructor
public Mobile(int id,String date,String type,float total,String ManufacturerName,String PlanName,int mob,float GB,int minute)
{
	super( id, date, type, total);
	this.Manufacturer_Name=ManufacturerName;
	this.Plan_Name=PlanName;
	this.Mobile_Number=mob;
	this.GB_Used=GB;
	this.Minute_Used=minute;
}

//getter setters
public String getManufacturer_Name() {
	return Manufacturer_Name;
}
public void setManufacturer_Name(String manufacturer_Name) {
	Manufacturer_Name = manufacturer_Name;
}
public String getPlan_Name() {
	return Plan_Name;
}
public void setPlan_Name(String plan_Name) {
	Plan_Name = plan_Name;
}
public int getMobile_Number() {
	return Mobile_Number;
}
public void setMobile_Number(int mobile_Number) {
	Mobile_Number = mobile_Number;
}
public float getGB_Used() {
	return GB_Used;
}
public void setGB_Used(int gB_Used) {
	GB_Used = gB_Used;
}
public int getMinute_Used() {
	return Minute_Used;
}
public void setMinute_Used(int minute_Used) {
	Minute_Used = minute_Used;
}

}

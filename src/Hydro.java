
public class Hydro extends Bill
{
	
	//properties
	String AgencyName;
	float Unit_Consumed;
	
	//Constructor
public Hydro(int id,int date,String type,float total,String agencyName,float Unit)
{
	super( id, date, type, total);
	this.AgencyName=agencyName;
	this.Unit_Consumed=Unit;
}

//getter setters
public String getAgencyName() {
	return AgencyName;
}
public void setAgencyName(String agencyName) {
	AgencyName = agencyName;
}
public float getUnit_Consumed() {
	return Unit_Consumed;
}
public void setUnit_Consumed(int unit_Consumed) {
	Unit_Consumed = unit_Consumed;
}

}

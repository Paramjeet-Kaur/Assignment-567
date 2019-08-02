
public class Internet extends Bill

{
	//properties
  private String Provider_Name;
  private float GB_used;
   
   //Constructor
public Internet(int id,String date,String type,float total,String name,float GB)
{
	super( id, date, type, total);
	this.Provider_Name=name;
	this.GB_used=GB;
}

//getter setters
public String getProvider_Name() {
	return Provider_Name;
}
public void setProvider_Name(String provider_Name) {
	Provider_Name = provider_Name;
}
public float getGB_used() {
	return GB_used;
}
public void setGB_used(int gB_used) {
	GB_used = gB_used;
}

}


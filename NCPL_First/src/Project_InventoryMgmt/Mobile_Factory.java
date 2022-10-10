package Project_InventoryMgmt;

public class Mobile_Factory {

	public Mobile_Inventory getMobile(String name) {
		
		
		if(name == null)
			return null;
		
		if(name.equalsIgnoreCase("iphone"))
			return new Apple_Mobile();
		else if(name.equalsIgnoreCase("samsung"))
			return new Samsung_Mobile();
		else if(name.equalsIgnoreCase("oneplus"))
			return new Oneplus_Mobile();
		
		return null;
	}
}

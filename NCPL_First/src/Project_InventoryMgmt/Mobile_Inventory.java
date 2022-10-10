package Project_InventoryMgmt;

public abstract class Mobile_Inventory {

	protected float price;
	boolean buy;
//	abstract void getPrice();
	public abstract void addMobile(int n);
	public abstract void sellMobile(int n);
	
	public abstract String getDetails();
}

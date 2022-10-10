package Project3_InventoryMgmt;

public abstract class Apple_mobile implements MyMobile_Factory {

	String m_name;
	
	public Apple_mobile() {
		// TODO Auto-generated constructor stub
		m_name = "Iphone";
	}
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return m_name;
	}
	
	
	public abstract int getQuantity();
	public abstract float getPrice();
	public abstract String getDetails();
}

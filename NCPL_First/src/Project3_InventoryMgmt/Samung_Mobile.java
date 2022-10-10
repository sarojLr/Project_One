package Project3_InventoryMgmt;

public abstract class Samung_Mobile implements MyMobile_Factory {

	String m_name;
	
	public Samung_Mobile() {
		// TODO Auto-generated constructor stub
		m_name = "Samsung";
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

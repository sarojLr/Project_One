package Project3_InventoryMgmt;

public abstract class OnePlus_Nord extends Oneplus_Mobile {

	String model;
	int quantity;
	float price;
	
	
	public OnePlus_Nord() {
		// TODO Auto-generated constructor stub
		super();
		model = "OnePlus Nord";
		quantity = 47;
		price = 39200.50f;
	}

	@Override
	public String getDetails() {
		return "OnePlus Mobiles:  [model=" + model + ", quantity=" + quantity + ", price=" + price + "]";
	}


	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}

package Project3_InventoryMgmt;

public abstract class OnePlus_6t extends Oneplus_Mobile {

	String model;
	int quantity;
	float price;
	
	
	public OnePlus_6t() {
		// TODO Auto-generated constructor stub
		super();
		model = "OnePlus 6T";
		quantity = 11;
		price = 55200.50f;
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

package Project3_InventoryMgmt;

public abstract class OnePlus_10RE extends Oneplus_Mobile {

	String model;
	int quantity;
	float price;
	
	
	public OnePlus_10RE() {
		// TODO Auto-generated constructor stub
		super();
		model = "OnePlus 10 RE";
		quantity = 23;
		price = 47890.7f;
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

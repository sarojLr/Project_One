package Project3_InventoryMgmt;

public abstract class Samsung_Lite extends Samung_Mobile {

	String model;
	int quantity;
	float price;
	
	
	public Samsung_Lite() {
		// TODO Auto-generated constructor stub
		super();
		model = "Samsung lite";
		quantity = 36;
		price = 35470.21f;
	}

	@Override
	public String getDetails() {
		return "Samsung Mobiles:  [model=" + model + ", quantity=" + quantity + ", price=" + price + "]";
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

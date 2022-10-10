package Project3_InventoryMgmt;

public abstract class Iphone_12 extends Apple_mobile {

	String model;
	int quantity;
	float price;
	
	
	public Iphone_12() {
		super();
		model = "Iphone 12 ultra";
		quantity = 22;
		price = 65000.50f;
	}

	@Override
	public String getDetails() {
		return "Apple Mobiles:  [model=" + model + ", quantity=" + quantity + ", price=" + price + "]";
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

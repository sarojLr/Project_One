package Project3_InventoryMgmt;

public abstract class Iphone_13 extends Apple_mobile {

	String model;
	int quantity;
	float price;
	
	
	public Iphone_13() {
		super();
		model = "Iphone 13 prox ma";
		quantity = 18;
		price = 85000f;
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

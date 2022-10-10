package Project3_InventoryMgmt;

public abstract class Samsung_Note extends Samung_Mobile {

	String model;
	int quantity;
	float price;
	
	
	public Samsung_Note() {
		// TODO Auto-generated constructor stub
		super();
		model = "Samsung galaxy note";
		quantity = 16;
		price = 75000.50f;
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

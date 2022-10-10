package Project3_InventoryMgmt;

public abstract class SamsungEdge extends Samung_Mobile {

	String model;
	int quantity;
	float price;
	
	
	public SamsungEdge() {
		// TODO Auto-generated constructor stub
		super();
		model = "Samsung galaxy Edge pro";
		quantity = 26;
		price = 47000.50f;
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

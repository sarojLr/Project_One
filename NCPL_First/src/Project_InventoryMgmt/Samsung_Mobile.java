package Project_InventoryMgmt;

public class Samsung_Mobile extends Mobile_Inventory{
	
	static String m_name;
	static int quantity =15;
	final float  price = 80000f;

	
	@Override
	public void addMobile(int n) {
		// TODO Auto-generated method stub
		quantity+=n;
		System.out.println("Product added  !!! ");
		System.out.println("Total quantity : "+quantity);
		System.out.println("Total price : "+ price*n);
		
	}

	@Override
	public void sellMobile(int n) {
		// TODO Auto-generated method stub
		if(quantity<n)
			System.out.println("Not enough product in stock");
		else {
//			TotPrice(n);
			quantity-=n;

			System.out.println("product sold: ");
			System.out.println("remaining product quantity : "+quantity);
		}
		
	}

	@Override
	public String getDetails() {
		return "Mobile brand = Samsung mobiles , quantity left=" + quantity + " , 1 unit price = "+price+" ]";
	} 

}

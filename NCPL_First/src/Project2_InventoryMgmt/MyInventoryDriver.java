package Project2_InventoryMgmt;

import java.util.Scanner;

abstract class Mobile {

	
	abstract String getMobileName();
	abstract int getQuantity();
	abstract float getPrice();
	abstract String getDetails();
	
}

class Apple extends Mobile {

	private final String mName;
	protected static int quantity;
	protected static float price;
	
	public Apple() {
		mName = "Iphone";
		quantity = 10;
		price = 150000.50f;
	}
	@Override
	public String getMobileName() {
		// TODO Auto-generated method stub
		return mName;
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
	@Override
	public String getDetails() {
		return "Mobile brand = Apple Mobiles " + ", quantity left=" + quantity + " , 1 unit price = "+price+" ]";
	} 
	
}


class Oneplus extends Mobile {

	private final String mName;
	protected static int quantity;
	protected static float price;
	
	public Oneplus() {
		mName = "OnePlus";
		quantity = 27;
		price = 50000.20f;
	}
	@Override
	public String getMobileName() {
		// TODO Auto-generated method stub
		return mName;
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
	@Override
	public String getDetails() {
		return "Mobile brand = OnePlus Mobiles " + ", quantity left=" + quantity + " , 1 unit price = "+price+" ]";
	} 
	
}
class Samsung extends Mobile {

	private final String mName;
	protected static int quantity;
	protected static float price;
	
	public Samsung() {
		mName = "samsung";
		quantity = 18;
		price = 82000f;
	}
	@Override
	public String getMobileName() {
		// TODO Auto-generated method stub
		return mName;
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
	@Override
	public String getDetails() {
		return "Mobile brand = Samsung Mobiles " + ", quantity left=" + quantity + " , 1 unit price = "+price+" ]";
	} 
	
}


interface  Management {
	abstract void doTransaction(int n);
	

}



class StockProduct implements Management {

	@Override
	public void doTransaction(int n) {
		// TODO Auto-generated method stub
		
		
	}
	
}

class SellProduct implements Management{

	@Override
	public void doTransaction(int n) {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class MyInventory {
	public abstract Mobile getMobile(String mob);
	public abstract Management getMgmt(String task);
}

class MobileFactory extends MyInventory{

	@Override
	public Mobile getMobile(String mob) {
		// TODO Auto-generated method stub
		if(mob.equalsIgnoreCase("iphone")){
			return new Apple();
		}
		if( mob.equalsIgnoreCase("samsung")) 	return new Samsung();
		
		if(mob.equalsIgnoreCase("oneplus"))	return new Oneplus();
		
		
		return null;
	}

	@Override
	public Management getMgmt(String task) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


class MgmtFactory extends MyInventory{

	@Override
	public Mobile getMobile(String mob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Management getMgmt(String task) {
		// TODO Auto-generated method stub
		
		if(task.equalsIgnoreCase("add"))	return new StockProduct();
		
		if(task.equalsIgnoreCase("sell"))	return new SellProduct();
		
		
		return null;
	}
	
}

class InventoryManager{
	
	public static MyInventory getInventory(String choice) {
		if(choice.equalsIgnoreCase("mobile"))    return new MobileFactory();
		
		else if(choice.equalsIgnoreCase("management")) return new MgmtFactory();
		
		return null;
	}
	
}





public class MyInventoryDriver {
	{
		System.out.println("----------Welcome to your Inventory---------");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		boolean loop1 =true;
//		
		try {
			MobileFactory mFac = new MobileFactory();
			while(loop1) {
						System.out.println("-----Enter your choice-----\n");
//						System.out.println("1) see your inventory products");
						System.out.println("1) Get inside your Mobile inventory");
////						System.out.println("2) Buy product from inventory");
						System.out.println("2) Exit");
//
//
						int choice = sc.nextInt();
//					
//						
						switch(choice){
						case 1:{
							System.out.println("Enter the mobile brand :(iphone, samsung or onePlus)\n");
							String mobile = sc.next();
							Mobile mob = mFac.getMobile(mobile);
//							
						while(loop) {
//								
							System.out.println("\n\n1) See details of product : ");
							System.out.println("2) Add product : ");
							System.out.println("3) Sell product : ");
							System.out.println("4) Exit : ");
//							
							int choice1 =sc.nextInt();
							switch(choice1) {
							case 1:{
								System.out.println(mob.getDetails());
								continue;
							}
							case 2:{
								System.out.println("enter number of units: ");
								int num = sc.nextInt();
								
//								continue;
//							}
//							case 3:{
//								System.out.println("enter no. of units : ");
//								int num = sc.nextInt();
//								mob.sellMobile(num);
//								continue;
//							}
//							case 4:{
//								System.out.println("visit again !!!");
//								loop= false;
//								continue;
//							}
//							default:{
//								System.out.println("please enter valid options ");
//								continue;
//							}	
//							}	
//							
//						}
//						continue;
//						}
//						case 2:{
//							System.out.println("thank You...");
//							loop1=false;
//							break;
//							
//			
//						}
//						
//						}
//			}
//		}catch(Exception e) {System.out.println("Bad Input");}
//	}
//
		
	}

}

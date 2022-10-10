package Project_InventoryMgmt;

import java.util.Scanner;

public class InventoryMain {
	{
		System.out.println("Welcome to your Mobile Inventory\n\n");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		boolean loop1 =true;
		
		try {
			Mobile_Factory mFac = new Mobile_Factory();
			while(loop1) {
						System.out.println("-----Enter your choice-----");
//						System.out.println("1) see your inventory products");
						System.out.println("1) Get inside your Mobile inventory");
//						System.out.println("2) Buy product from inventory");
						System.out.println("2) Exit");


						int choice = sc.nextInt();
					
						
						switch(choice){
						case 1:{
							System.out.println("Enter the mobile brand :(iphone, samsung or onePlus\n");
							String mobile = sc.next();
							Mobile_Inventory mob = mFac.getMobile(mobile);
							
						while(loop) {
								
							System.out.println("\n\n1) See details of product : ");
							System.out.println("2) Add product : ");
							System.out.println("3) Sell product : ");
							System.out.println("4) Exit : ");
							
							int choice1 =sc.nextInt();
							switch(choice1) {
							case 1:{
								System.out.println(mob.getDetails());
								continue;
							}
							case 2:{
								System.out.println("enter number of units: ");
								int num = sc.nextInt();
								mob.addMobile(num);
								continue;
							}
							case 3:{
								System.out.println("enter no. of units : ");
								int num = sc.nextInt();
								mob.sellMobile(num);
								continue;
							}
							case 4:{
								System.out.println("visit again !!!");
								loop= false;
								continue;
							}
							default:{
								System.out.println("please enter valid options ");
								continue;
							}	
							}	
							
						}
						continue;
						}
						case 2:{
							System.out.println("thank You...");
							loop1=false;
							break;
							
			
						}
						
						}
			}
		}catch(Exception e) {System.out.println("Bad Input");}
	}

}

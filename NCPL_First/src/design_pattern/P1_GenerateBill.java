package design_pattern;

import java.util.Scanner;

public class P1_GenerateBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		P1_PlanFactory pf = new P1_PlanFactory();
		System.out.println("enter ou plan: ");
		
		String myPlan = sc.nextLine();
		
		System.out.println("enter no. of units needed");
		int units = sc.nextInt();
		
		P1_Plan p = pf.getPlan(myPlan);
		
		p.getRate();					// without getting rate , you cant calculate bills;
		p.calculateBill(units);
	}
}

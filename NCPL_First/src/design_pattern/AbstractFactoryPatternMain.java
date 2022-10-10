package design_pattern;

import java.util.Scanner;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the bank name: ");
		String bankName =  sc.next();
		
		System.out.println("enter the loan type: ");
		String loanType =  sc.next();
		
		P3_MyFactory Bankfactory1 = P3_FactoryCreator.getFactory("banks");
		
		P3_Bank b1 = Bankfactory1.getBank(bankName);
		
		System.out.println("enter interest rate: ");
		double iRate =  sc.nextDouble();
		
		System.out.println("enter no. years: ");
		int yrs = sc.nextInt();
		
		
		P3_MyFactory loanFactory1 = P3_FactoryCreator.getFactory("loans");
		P3_Loan l1 = loanFactory1.getLoan(loanType);
		l1.getIntrestRate(iRate);
		
		l1.calculateLoanPayment(2000000, yrs);
	}
}

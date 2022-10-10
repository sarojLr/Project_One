package design_pattern;

public abstract class P3_Loan {

	protected double rate;
	abstract void getIntrestRate(double rate);
	
	public void calculateLoanPayment(double loanamount,int year) {
		double EMI;
		int months;
		
		months = year*12;
		rate = (rate/12)*100;
		
		EMI = ((rate*Math.pow((1+rate),months))/((Math.pow((1+rate),months))-1))*loanamount;  
		
		System.out.println("your EMI: "+EMI);
	}
}

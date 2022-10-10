package design_pattern;

public class P3_LoanFactory extends P3_MyFactory {

	@Override
	public P3_Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P3_Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		
		if(loan == null)
			return null;
		
		if(loan.equalsIgnoreCase("home"))
			return new P3_HomeLoan();
		if(loan.equalsIgnoreCase("car"))
			return new P3_CarLoan();
		if(loan.equalsIgnoreCase("study"))
			return new P3_StudyLoan();
		return null;
	}
	

}

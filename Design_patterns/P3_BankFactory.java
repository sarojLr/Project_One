package design_pattern;

public class P3_BankFactory extends P3_MyFactory{

	@Override
	public P3_Bank getBank(String bank) {
		// TODO Auto-generated method stub
		if(bank == null)
			return null;
		if(bank.equalsIgnoreCase("rbi"))
			return new P3_Rbi();
		if(bank.equalsIgnoreCase("sbi"))
			return new P3_Sbi();
		if(bank.equalsIgnoreCase("hdfc"))
			return new P3_Hdfc();
		
		return null;
	}

	@Override
	public P3_Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}

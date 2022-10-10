package design_pattern;

public class P3_Sbi implements P3_Bank{

	private String bName;
	
	public P3_Sbi() {
		bName = "SBI Bank";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bName;
	}
	
}

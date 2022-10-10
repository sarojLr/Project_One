package design_pattern;

public class P3_Hdfc implements P3_Bank{

	private String bName;
	
	public P3_Hdfc() {
		bName = "HDFC Bank";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bName;
	}

}

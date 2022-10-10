package design_pattern;

public class P3_Rbi implements P3_Bank{

	private String bName;
	
	public P3_Rbi() {
		bName = "RBI Bank";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bName;
	}

}

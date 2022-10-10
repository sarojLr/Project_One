package design_pattern;

// Factory method pattern; 


public abstract class P1_Plan {

	protected double rate;
	
	abstract void getRate();
	
	void calculateBill(int unit) {
		System.out.println(rate*unit);
	}
}

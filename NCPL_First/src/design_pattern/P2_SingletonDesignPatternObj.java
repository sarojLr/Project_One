package design_pattern;

// Singleton design pattern;

public class P2_SingletonDesignPatternObj {
	protected int num;

	private P2_SingletonDesignPatternObj() {}
	
	private static P2_SingletonDesignPatternObj myInstance = new P2_SingletonDesignPatternObj();		// early instance;
	
	public static P2_SingletonDesignPatternObj getInstance() {
		return myInstance;
	}
	
	public void getMessage() {
		System.out.println("my singleton object: "+num);
	}
	public void changeNum(int num1) {
		num=num1;
	}
}

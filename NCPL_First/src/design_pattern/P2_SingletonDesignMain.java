package design_pattern;

import java.util.Scanner;

public class P2_SingletonDesignMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		P2_SingletonDesignPatternObj p1s = new P2_SingletonDesignPatternObj();
		
		P2_SingletonDesignPatternObj p2 = P2_SingletonDesignPatternObj.getInstance();

		P2_SingletonDesignPatternObj p21 = P2_SingletonDesignPatternObj.getInstance();
		
		p2.getMessage();
		p21.changeNum(21);
		p2.getMessage();
		p21.getMessage();
	}
}

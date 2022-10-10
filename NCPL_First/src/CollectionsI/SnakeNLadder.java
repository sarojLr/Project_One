package CollectionsI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnakeNLadder {
	final int max = 100;
		 Map<Integer,Integer > snake;
		 Map<Integer,Integer > ladder;
		{
		snake.put(32,10);
		snake.put(36,6);
		snake.put(48,26);
		snake.put(62,18);
		snake.put(88,24);
		snake.put(95,56);
		snake.put(97,78);
		ladder.put(4,14);
		ladder.put(8,30);
		ladder.put(21,42);
		ladder.put(28,76);
		ladder.put(50,67);
		ladder.put(71,92);
		ladder.put(80,99);
		}
		
		
		public int dice(int num) throws InterruptedException {
			int num1 = (int) (Math.random()*79)*num;

	        int digits = (int)(Math.log10(num1));
	        num1 = (int)(num1 / (int)(Math.pow(10, digits)));
	        if(num1<=0|| num>6)
	        	return dice(num1);
	        System.out.println("you rolled : "+num1);
//	        Thread.sleep(2000);
	        return num1;
		}
		
		public int playerPoint(int i,int val) {
		
			val = val+i;
			if(snake.containsKey(val)) {
				System.out.println("You are eaten by snake.... now your position : "+snake.get(val));
				val = snake.get(val);
			}
			else if(ladder.containsKey(val)) {
				System.out.println("you climbed ladder.... ou position now : "+ladder.get(val));
				val = ladder.get(val);
			}
			return val;
		}

}

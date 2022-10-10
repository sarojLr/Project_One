package CollectionsI;

import java.util.Scanner;
import java.util.SortedMap;

public class SnL_Main {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		SnakeNLadder sl = new SnakeNLadder();
		SortedMap<Integer, String> as =  new SortedMap<Integer, String>() {
			
		};
		
		System.out.println("enter no. of players");
		
		int no = sc.nextInt();
		
		int [] arr= new int[no];
		
		int di =0;
		System.out.println("----------lets play Snake and Ladder----------\n\n");
		
		for(int i = 0;i<no;i++) {
			System.out.println("Player ["+i+1+"] turn.... enter a number.. roll the dice");
			di = sc.nextInt();
			di = sl.dice(di);
			arr[i] = sl.playerPoint(di, arr[i]);
			if(arr[i]==100) {
				System.out.println("you won .... you reacherd 100 ");
				break;
			}
			else if(arr[i]>100) {
				System.out.println("roll again next Time..");
				arr[i]-=di;
			}
			else {
				System.out.println("player ["+i+1+"] points is  : "+arr[i]);
			}
			if(i==no-1) {
				i=0;
			}
		}
	}

}

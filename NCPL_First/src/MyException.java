import java.util.Scanner;
import java.lang.*;

class CustomExp extends Exception{
	public CustomExp(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
}


public class MyException extends Thread {
	static void findID(int [] arr, int id) throws CustomExp {
		boolean b = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == id) {
				b = true;
				break;
			}
		}
		if(!b){
			throw new CustomExp("ID is not valid");
		}
		else {
			System.out.println("ID is valid");
			
		}
		
	}

	public void run() {
		System.out.println("thread is running");
	}
	
	public static void main(String[] args) {
		int arr[] = {102,561,837,138,718,918,372};
		Scanner sc = new Scanner(System.in);
		MyException mi = new MyException();
		
		int ids = sc.nextInt();
		
		try {
			findID(arr, ids);
			mi.start();
			System.out.println("do some");
			
			
			
			
		}
		catch(CustomExp e)
		{
			System.out.println(e);
			mi.start();
		}
	}
	
}

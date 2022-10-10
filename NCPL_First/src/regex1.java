import java.util.Scanner;
import java.util.regex.Pattern;

public class regex1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-->0) {
//			^(?!\.)(?!.*\.$)(?!.*?\.\.)[a-zA-Z0-9_.]+$
			String rege = "";
//			System.out.println("Enter a valid email: ");
			String s1 = sc.next();
//			sc.next();
//			sc.nextLine();
//			try{
//			rege  = "\\A\\S+@\\S+\\Z";      only middle @
			
//			rege = "^\\W+@\\w+$";		//having both side no spl charactor
//			rege ="\\A[a-z0-9A-Z+[._-]]+@[A-Za-z0-9+.]+\\Z";    	//having spl charactor.
			
//			rege = "^[A-Z0-9a-z+[_!#$%&'*+/=?`{|}~^.-]?]+@[A-Z0-9a-z+[.-_]?]+$";
			
//			rege = "^(?!\\.)(?!.*\\.$)(?!.*?\\.\\.)[A-Za-z0-9+[.-_]]+@[A-Za-z0-9+[._-]]+$";
			
			rege = "^[\\w](?!\\w*[-_.@]{2})[\\w._-]+@[\\w.-_]+[\\w]$";		//negative lockkhead
				
//			rege1 = "^(?!0)[0-9]{10}?";
//			Pattern p1 = Pattern.compile(rege);	
			
			
			System.out.println(s1.matches(rege));
			
//			System.out.println("Enter ph. number: ");
//			String ph = sc.next();
//			String rege1 = "^(?!0)[0-9]{10}";
			
//			System.out.println(ph.matches(rege1)?"valid ph no":"Invalid ph no.");
//			sc.nextLine();
//			}
//			catch(Exception e) {
//				System.out.println("invalid");
//			}
		}
	}
}

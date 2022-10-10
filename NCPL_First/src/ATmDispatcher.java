import java.util.Scanner;
class MyException extends Exception
{
public MyException(String s)
{
super(s);
}
}
class ATmDispatcher
{
void priceCheck(int num) throws MyException{
    String s1="";
		String s2="";
		String s3="";
    if(num<0) {
			throw new MyException("Invalid Amount");
    }
    else if(num%10 !=0) {
    throw new MyException("The amount entered needs to be multiples of 10");
    }
    else {
	    if(num/50>0) {
	        s1= (num/50)+"*50 ";
	        num= num%50;
	        }
    }
	    if(num/20>0) {
		    s2 = (num/20)+"*20 ";
	        num=num%20;
		    }
	    if(num/10>0) {
	        
	        s3 = (num/10)+"*10";
	        num = num%10;
		    }
	    System.out.println(s1+s2+s3);
}
public static void main(String args[])
{
ATmDispatcher atm = new ATmDispatcher();
Scanner sc = new Scanner(System.in);
int price = sc.nextInt();
try
{
atm.priceCheck(price);
}
catch (MyException e)
{
System.out.print("Error: ");
System.out.print(e.getMessage());
}
}
}
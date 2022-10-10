import java.io.*;

class TestExceptionPropagation1{
  void m(){
//	  System.out.println("mice");
    throw new ArithmeticException("hire");
  }
  void n(){
    m();
//    int d = 9/0;
   System.out.println("hiraku");
  }
  void p(){
   try{
    n();
   }catch(Exception e){System.out.println("exception handled");}
  }
}
public class Draft2{
  public static void main(String args[]) throws Exception{
   TestExceptionPropagation1 obj=new TestExceptionPropagation1();
   obj.p();
   System.out.println("normal flow...");
  }
}

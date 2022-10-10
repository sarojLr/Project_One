package MultiThreading;

public class threadPrac extends Thread {


    public void run()  
    {
        try  
        {    System.out.println("okey");
            Thread.sleep(1000);    
            System.out.println("java");    
        }catch(InterruptedException e){    
            throw new RuntimeException("Thread interrupted..."+e);  
              
        }    
    }    
    public static void main(String args[])  
    {    
        threadPrac t1=new threadPrac();    
        t1.start();    
        try  
        {    
//            t1.interrupt();    
            System.out.println("hi there");

            System.out.println(t1.isAlive());
            t1.sleep(1500);

            System.out.println(t1.isAlive());
            System.out.println("ok");
            t1.interrupt();
            System.out.println(t1.isAlive());
        }catch(Exception e){System.out.println("Exception handled "+e);}    
    }    
}    

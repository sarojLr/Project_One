import java.io.*;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;
 
class Ncpl_Draft1 {
	public static void method() throws Exception {  
		  
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
  
      
        throw new FileNotFoundException();  
      
    }  
    //main method  
    public static void main(String args[]){  
        try  
        {  
            method();  
        }   
        catch (Exception e)   
        {  
        	System.out.println(e);
            e.printStackTrace();
        }  
        System.out.println("rest of the code...");    
  } 
	               
}
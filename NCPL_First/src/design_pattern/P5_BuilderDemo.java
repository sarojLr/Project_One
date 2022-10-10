package design_pattern;

import java.io.IOException;

public class P5_BuilderDemo {


    public static void main(String[] args) throws IOException {  
        // TODO code application logic here  
          
        P5_MealMaker builder=new P5_MealMaker();  
          
        P5_OrderMeal orderedItems =builder.prepareBurger();  
          
        orderedItems.showItems();  
          
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getPrice());  
          
    }  
}

package design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5_MealMaker {

	public P5_OrderMeal prepareBurger() throws IOException
	{
        
        P5_OrderMeal meals=new P5_OrderMeal();
         
         
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
         
        System.out.println(" Enter the choice of Burger ");
        System.out.println("============================");
        System.out.println("        1. Veg-Burger       ");
        System.out.println("        2. Non-Veg Burger   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");
        
        int burgerNdrink=Integer.parseInt(br.readLine());
        
        switch(burgerNdrink)
        {
            
            case 1:{
                     
                     System.out.println("You ordered Veg Burger");
                     System.out.println("\n\n");
                     
                     System.out.println(" Enter the types of Veg-Burger ");
                     System.out.println("------------------------------");
                     System.out.println("        1.Burger : SMALL        ");
                     System.out.println("        2.Burger : Large        ");
                     System.out.println("        3.EXit        ");
                     System.out.println("------------------------------");
                 
                     int veg=Integer.parseInt(br.readLine());
                     
                     switch(veg)
                     {
                         
                         case 1:
                             meals.addMeal(new P5_SmallVegBurger());
                             break;
                         case 2 :
                        	 meals.addMeal(new P5_LargeVegBurger());
                        	 break;
                         case 3:
                        	 break;
                        	 
                         default:
                        	 break;
                      }
                     break;
            }
                
                
                
            case 2:
                   {
                       System.out.println("You ordered Non-Veg Burger");
                       System.out.println("\n\n");
                       
                                    System.out.println("Enter the Non-Veg Burger");
                                    System.out.println("------------------------------------");
                                    System.out.println("    1. Small Non-Veg  Burger ");
                                    System.out.println("    2. Large Non-Veg  Burger ");
                                    System.out.println("    3. Eit");
                                    System.out.println("------------------------------------");
                                    
                       
                       int nonveg=Integer.parseInt(br.readLine()); 
                      
                        switch(nonveg)
                             {
                               
                                  case 1:
                                      meals.addMeal(new P5_SmallNonVegBurger());
                                      break;
                                                    
                                  case 2:
                                      meals.addMeal(new P5_LargeNonVegBurger());
                                      break;  
                                                   
                                  case 3:
                                      break;  
                                                      
                                  default:
                                	  break;
                             }
                        break;
                
                }
            case 3:
            	System.out.println("Thank you !!");
            	break;
            	
            default:
            	break;
        }
            	
        
        
        System.out.println(" Enter the choice of Beverage ");
        System.out.println("============================");
        System.out.println("        1. Juice            ");
        System.out.println("        2. Cold Drink             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");  
        
        int coldDrink=Integer.parseInt(br.readLine());
        
        
        switch (coldDrink) 
            {
               case 1:
                                {
                                    System.out.println("You ordered juice ");
                                    
                                    System.out.println("Enter the  juice Size ");
                                    System.out.println("------------------------");
                                    System.out.println("    1. Small  ");
                                    System.out.println("    2. Large ");
                                    System.out.println("------------------------");
                                    
                                    
                                    int pep=Integer.parseInt(br.readLine());
                                    switch(pep)
                                              {
                                                  case 1:
                                                   meals.addMeal(new P5_SmallCupJuice());
                                                   break;
                                                    
                                                  case 2:
                                                   meals.addMeal(new P5_LargeCupJuice());
                                                   break;  
                                                   
                                                  default: break; 
                                              }
                                    break;
                                }
                                                  
                         case 2:
                                {
                                  
                                    System.out.println("You ordered Cold Drink");
                                    
                                    System.out.println("Enter the Cold drink");
                                    System.out.println("------------------------");
                                    System.out.println("    1. Small Cold drink ");
                                    System.out.println("    2. Large Cold drink ");
                                    System.out.println("------------------------");
                                    
                                    int cd=Integer.parseInt(br.readLine());
                                    switch(cd)
                                              {
                                                  case 1:
                                                   meals.addMeal(new P5_SmallCupDrink());
                                                   break;
                                                    
                                                  case 2:
                                                   meals.addMeal(new P5_LargeCupDrink());
                                                   break;  
                                                   
                                                  default:
                                                   break;  
                                                   
                                              }
                                    break;
                 
                           }
                         case 3:
                        	 System.out.println("Thnkks !!!");
                        	 break;   	 
                        	 
            }
        
            return meals;
    
	}
 }

package design_pattern;

import java.util.ArrayList;
import java.util.List;

public class P5_OrderMeal {
	List<P5_BurgerKing> order = new ArrayList<P5_BurgerKing>();
	
	public  void addMeal( P5_BurgerKing meal) {
		order.add(meal);
	}
	public float getPrice() {
		float cost = 0.0f;
		for(P5_BurgerKing item : order)
			cost+=item.price();
		return cost;
	}
	
	public void showItems(){
        
        for (P5_BurgerKing item : order) {
            System.out.println("Meal is:" +item.name());
            System.out.println("Size is:" +item.size());
            System.out.println("Price is: " +item.price());
            
        }
    }
	

}

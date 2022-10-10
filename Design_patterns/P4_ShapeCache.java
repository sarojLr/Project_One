package design_pattern;

import java.util.HashMap;
import java.util.Hashtable;

public class P4_ShapeCache{

	public static Hashtable<Integer, P4_Shape> hMap  = new Hashtable<>();
	
	public static P4_Shape getShape(int id){
		P4_Shape cachedShape = hMap.get(id);
		return (P4_Shape) cachedShape.clone();
	}
	
	
	public static void loadCache() {
		P4_Circle c = new P4_Circle();
		c.setId(101);
		hMap.put(c.getId(),c);
		
		P4_Rect r = new P4_Rect();
		r.setId(102);
		hMap.put(r.getId(),r);
		
		P4_Square sq = new P4_Square();
		sq.setId(103);
		hMap.put(sq.getId(),sq);
		
		
	}
}

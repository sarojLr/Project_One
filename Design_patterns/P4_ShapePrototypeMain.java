package design_pattern;

public class P4_ShapePrototypeMain {

	public static void main(String[] args) {
		  P4_ShapeCache.loadCache();

	      P4_Shape clonedShape = (P4_Shape) P4_ShapeCache.getShape(101);
	      System.out.println("Shape : " + clonedShape.getType());		

	      P4_Shape clonedShape2 = (P4_Shape) P4_ShapeCache.getShape(102);
	      System.out.println("Shape : " + clonedShape2.getType());		

	      P4_Shape clonedShape3 = (P4_Shape) P4_ShapeCache.getShape(103);
	      System.out.println("Shape : " + clonedShape3.getType());		
	   }
	
}

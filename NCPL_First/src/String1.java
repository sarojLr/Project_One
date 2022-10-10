
public class String1 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("tp2e");
		StringBuffer sb2 = new StringBuffer("wrong turn");
		sb1.append(" underfg sdfghjhgfdsaasdfghk");
//		sb1.ensureCapacity(21);
		sb1.setLength(10);
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		System.out.println(sb2);

	}
}

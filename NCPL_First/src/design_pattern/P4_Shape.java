package design_pattern;

public abstract class P4_Shape implements Cloneable {
	

	private int id;
	protected String type;
	
	abstract void draw();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	@Override
	protected Object clone(){
		Object clone = null;
		try{
			clone = super.clone();
		}catch (CloneNotSupportedException s) {
			s.printStackTrace();
		}
		return clone;
	}
	
	
	
}

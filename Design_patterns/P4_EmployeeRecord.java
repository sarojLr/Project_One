package design_pattern;

public class P4_EmployeeRecord implements P4_Prototype{
	
	private int id;
	private String name;
	private double salary;
	
	public P4_EmployeeRecord() {}

	public P4_EmployeeRecord(int id, String name, double salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void showRecord() {
		System.out.println("P4_EmployeeRecord [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}

	
	@Override
	public P4_Prototype getClone() {
		// TODO Auto-generated method stub
		return new P4_EmployeeRecord(id, name, salary);
	}
	
	

}

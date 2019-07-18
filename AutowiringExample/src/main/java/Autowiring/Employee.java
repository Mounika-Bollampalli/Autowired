package Autowiring;

public class Employee {
	
	private String name;
	private int id;

	private Address adr;
	
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}

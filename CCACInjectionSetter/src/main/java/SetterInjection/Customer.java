package SetterInjection;

public class Customer {
	private int id;  
	private String name;  
	private Address address;  
	  
	public Customer(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		 System.out.println("Hello");
		System.out.println(id+" "+name);  
	    System.out.println(address);  		
	}

}

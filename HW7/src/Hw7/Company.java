package Hw7;

import java.util.Set;

public class Company {
	private String name;
	private String address;
	private String phone_number;
	private Product primary_product;
	private Set<Department> departments;
	private Set<Person> people;
	
	void hire(Person man) {}
	void fire(Person man) {}
	
/*	public Company() {
		departments=new Set<Department>();
	}
	protected void finalize() {
		departments=null;
	}*/
}

class Department{
	private String name;
	private Manager manager;
	private Set<Product> products;
}
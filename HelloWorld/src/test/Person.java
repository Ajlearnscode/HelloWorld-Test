package test;

public class Person {

	private String name;
	
	//Primary COnstructor
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

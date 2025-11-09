package test;

public class HelloWorld {

	public static void main(String[] args) {
		
		Person asher = new Person("Asher Maxwell", 2107584, 23);
		Person p2 = new Person("Monique Whittaker", 2207554, 24);
		Person p3 = new Person("Jhamar Brown", 2017524, 20);
		
		System.out.println("Person 1 Details:");
		System.out.println(asher.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}

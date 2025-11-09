package test;

public class HelloWorld {

	public static void main(String[] args) {
		
		Person asher = new Person("Asher Maxwell", 2107584, 23);
		Person p2 = new Person("Monique Whittaker", 2207554, 24);
		Person p3 = new Person("Jhamar Brown", 2017524, 20);
		Person p4 = new Person("Latanya Davis", 2187743, 21);
		Person p5 = new Person("Tamara Hernandez", 2086473, 25);
		
		System.out.println("Person 1 Details:");
		System.out.println(asher.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
	}

}


public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Whenes";
		person.age = 34;
		person.cpf = "99999999999";
		person.say();
		System.out.println(Person.walk());
		System.out.println("Hello world " + person.name);
		
		Person person2 = new Person("Will", 34, "888888888888");		
		person2.say();		
		System.out.println("Hello world " + person2.name);
		
		PersonEncap person3 = new PersonEncap();
		person3.setName("José");
		person3.setAge(34);
		System.out.println(person3.getName());
		
		Car car1 = new Car();
		car1.setColor("Azul");
		car1.setTopSpeed(120);
		car1.setShifts(3);
		System.out.println(car1.getColor() + " - " + car1.getTopSpeed() + " - " + car1.getShifts());
		
		CarComposition carComposition = new CarComposition();
		carComposition.getVechicle().setColor("green");
		carComposition.getVechicle().setTopSpeed(210);
		System.out.println(carComposition.getVechicle().getColor() + " - " + carComposition.getVechicle().getTopSpeed());
	
		PersonEncap person4 = new PersonEncap("Whenes", 34);
		System.out.println(person4.walk("Walking"));
		System.out.println(person4.walk("Walking", 4));
		
		Animal dog = new Dog();
		dog.makeNoise();
		Animal cat = new Cat();
		cat.makeNoise();
	}

}

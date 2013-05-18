
public class main {

	public static void main(String[] args) {
		
		Person alex = new Person("Alex", "Baratti", 14);
		Person ryan = new Person("Ryan", "Nemiroff", 13);
		Person kyle = new Person("Kyle", "Hawthorne", 13);
		Person aj = new Person("AJ", "Watt", 13);
		Person jeffery = new Person("Jeffery", "Sardina", 13);
		Person kate = new Person("Kate", "Huppert", 14);
		Person logan = new Person("Logan", "Welsh", 13);
		Person jake = new Person("Jake", "Watkins", 13);
		Person connor = new Person("Connor", "Hannon", 13);
		
//		CellPhone alexiPhone("iPhone 5", true, alex, "Verizon");
		
		alex.setBestFriend(ryan);
		ryan.setBestFriend(alex);
		kyle.setBestFriend(aj);
		aj.setBestFriend(kyle);
		
		alex.addFriend(kyle);
		alex.addFriend(aj);
		ryan.addFriend(kyle);
		ryan.addFriend(aj);
		kyle.addFriend(alex);
		kyle.addFriend(ryan);
		aj.addFriend(alex);
		aj.addFriend(ryan);
		
//		alex.printFriends();
		
		alex.setEmail("alex.techtalk4geeks@gmail.com");
		ryan.setEmail("ryguyn@gmail.com");

		alex.FindTheAnswerToTheUniverse();
		
		alex.setTechSide("Apple");
		ryan.setTechSide("Apple");
		kyle.setTechSide("Apple");
		aj.setTechSide("Apple");
		jeffery.setTechSide("Apple");
		kate.setTechSide("Apple");
		logan.setTechSide("Windows and Android");
		jake.setTechSide("Android");
	}

}

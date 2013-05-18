import java.util.ArrayList;

public class Person {

	private String myFirstName = " ";
	private int myAge = 0;
	private String myLastName = " ";
	private Person myBestFriend;
	private String myEmail;
	private CellPhone myCellPhone;
	private ArrayList<Person> friends;
	private String techSide;

	public Person(String firstName, String lastName, int age) {
		myFirstName = firstName;
		myLastName = lastName;
		myAge = age;
	}

	public String getFirstName() {
		return myFirstName;
	}
	
	public String getLastName() {
		return myLastName;
	}
	
	public String getFullName() {
		return myFirstName + " " + myLastName;
	}
	
	public void setPhone(CellPhone cellPhone) {
		myCellPhone = cellPhone;
	}
	
	public void printAge() {
		System.out.println(getFullName() + "'s age is " + getAge());
	}
	
	public void setTechSide(String whatTechSide) {
		techSide = whatTechSide;
		System.out.println(getFullName() + " is a");
		if(whatTechSide.substring(0, 1).equals("a") || whatTechSide.substring(0, 1).equals("e") || whatTechSide.substring(0, 1).equals("i") || whatTechSide.substring(0, 1).equals("o") || whatTechSide.substring(0, 1).equals("u")) {
			System.out.print("n " + whatTechSide);
		} else {
			System.out.print(" " + whatTechSide);
		}
	}

	public void setEmail(String email) {
		myEmail = email;
		System.out.println(getFullName() + "'s email is: " + myEmail);
	}
	
	public void addFriend(Person friend) {
//		friends.add(friend);
	}
	
	public ArrayList<Person> getFriends() {
		return friends;
	}
	
	public void printFriends() {
		System.out.println(getFullName() + "'s friends are:");
		for(Person p: friends) {
			System.out.println("- " + p.getFullName());
		}
	}

	public void setBestFriend(Person bestFriend) {
		myBestFriend = bestFriend;
		System.out.println(getFullName() + "'s best friend is: " + myBestFriend.getFullName());
//		friends.add(bestFriend);
	}

	public int getAge() {
		return myAge;
	}
	
	public Person getBestFriend() {
		return myBestFriend;
	}
	
	public String getEmail() {
		return myEmail;
	}
	
	public int FindTheAnswerToTheUniverse() {
		System.out.println(getFirstName() + " found the answer to the universe. It's 42.");
		return 42;
	}
}

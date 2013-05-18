public class CellPhone {

	String myName;

	Boolean isSmartPhone;

	Person myPerson;

	String myCarrier;

	int myNumber;

	public CellPhone(String name, Boolean smartphone, Person owner,
			String carrier) {

		myName = name;

		isSmartPhone = smartphone;

		myPerson = owner;

		myCarrier = carrier;

	}

	public void playDefaultRingtone() {

		// play(DefaultRingtone);

	}

	public void displayCallPrompt(String displayThis) {

		// interface.display(displayThis);

	}

	public int getPhoneNumber() {

		return myNumber;

	}

	public Person getPhoneOwner() {

		return myPerson;

	}

	public void call(CellPhone cellphone, CellPhone callingPhone) {

		ring(callingPhone, cellphone);

		// System.out.println(ÒCalling Ó + cellphone.getPhoneOwner());

	}

	public void ring(CellPhone recievingPhone, CellPhone sendingPhone) {

		recievingPhone.playDefaultRingtone();

		// recievingPhone.displayCallPrompt(sendingPhone.getPhoneNumber());

		for (int i = 0; i < 3; i++) {

			// System.out.println(ÒRinging...Ó);

		}

		// System.out.println(ÒCall AnsweredÓ);

	}

}
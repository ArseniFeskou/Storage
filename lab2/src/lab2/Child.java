package lab2;

public class Child extends Human {
	private String numberOfKindergarten;

	public String getNumberOfKindergarten() {
		return numberOfKindergarten;
	}

	public void setNumberOfKindergarten(String numberOfKindergarten) {
		this.numberOfKindergarten = numberOfKindergarten;
	}

	public Child(String firstName, String surname, String middleName, String gender, int age) {
		super(firstName, surname, middleName, gender, age);
	}

	public Child(String firstName, String surname, String middleName, String gender, int age,
			String numberOfKindergarten) {
		super(firstName, surname, middleName, gender, age);
		this.numberOfKindergarten = numberOfKindergarten;
	}
	public Child(String firstName, String surname, String middleName, String gender, String numberOfKindergarten) {
		super(firstName, surname, middleName, gender);
		this.numberOfKindergarten = numberOfKindergarten;
	}

	@Override
	public String toString() {
		return "Child [" + getFirstName() + ", " + getSurname() + ", " + getMiddleName() + ", "
				+ getGender() + ", " + getAge() + ", " + numberOfKindergarten + "]";
	}
	@Override
	public void Name() {
		System.out.println("Name child");
	}
}

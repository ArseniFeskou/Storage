package lab2;

public class Parent extends Human {
	private int amountOfChildren;
	private String placeOfWork;
	public int getAmountOfChildren() {
		return amountOfChildren;
	}
	public void setAmountOfChildren(int amountOfChildren) {
		this.amountOfChildren = amountOfChildren;
	}
	public String getPlaceOfWork() {
		return placeOfWork;
	}
	public void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}
	public Parent(String firstName, String surname, String middleName, String gender, int age) {
		super(firstName, surname, middleName, gender, age);
	}
	public Parent(String firstName, String surname, String middleName, String gender, int age, int amountOfChildren,
			String placeOfWork) {
		super(firstName, surname, middleName, gender, age);
		this.amountOfChildren = amountOfChildren;
		this.placeOfWork = placeOfWork;
	}
	public Parent(String firstName, String surname, String middleName, String gender, int amountOfChildren,
			String placeOfWork) {
		super(firstName, surname, middleName, gender);
		this.amountOfChildren = amountOfChildren;
		this.placeOfWork = placeOfWork;
	}
	@Override
	public String toString() {
		return "Parent [" + getFirstName() + ", " + getSurname() + ", " + getMiddleName()
				+ ", " + getGender() + ", " + getAge() + ", " + amountOfChildren + ", " + placeOfWork +"]";
	}
	@Override
	public void Name() {
		System.out.println("Name parent");
	}
}

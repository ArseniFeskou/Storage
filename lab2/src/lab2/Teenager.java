package lab2;

public class Teenager extends Human {
	private int schoolNumber;
	private int schoolPerformance;
	
	public int getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public int getSchoolPerformance() {
		return schoolPerformance;
	}
	public void setSchoolPerformance(int schoolPerformance) {
		this.schoolPerformance = schoolPerformance;
	}
	public Teenager(String firstName, String surname, String middleName, String gender, int age) {
		super(firstName, surname, middleName, gender, age);
	}
	public Teenager(String firstName, String surname, String middleName, String gender, int age, int schoolNumber,
			int schoolPerformance) {
		super(firstName, surname, middleName, gender, age);
		this.schoolNumber = schoolNumber;
		this.schoolPerformance = schoolPerformance;
	}
	public Teenager(String firstName, String surname, String middleName, String gender, int schoolNumber,
			int schoolPerformance) {
		super(firstName, surname, middleName, gender);
		this.schoolNumber = schoolNumber;
		this.schoolPerformance = schoolPerformance;
	}
	@Override
	public String toString() {
		return "Teenager [" + getFirstName() + ", " + getSurname() + ", " + getMiddleName() + ", "
	+ getGender() + ", " + getAge() + ", " + schoolNumber + ", " + schoolPerformance+ "]";
	}
	@Override
	public void Name() {
		System.out.println("Name teenager");
	}
}

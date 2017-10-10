package lab2;

public class Human {
	private String firstName;
	private String surname;
	private String middleName;
	private String gender;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
    public Human(String firstName, String surname, String middleName, String gender, int age) {
    	super();
    	this.firstName = firstName;
    	this.surname = surname;
    	this.middleName = middleName;
    	this.gender = gender;
    	this.age = age;
    }
	public Human() {
		super();
	}
	public Human(String firstName, String surname, String middleName, String gender) {
	    	super();
	    	this.firstName = firstName;
	    	this.surname = surname;
	    	this.middleName = middleName;
	    	this.gender = gender;
	}
	public void Name() {
		System.out.println("Name human");
	}
	public String toString() {
		return "Human [" + firstName + ", " + surname + ", " + middleName + ", "
				+ gender + ", " + age + "]";
	}
}
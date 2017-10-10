package lab2;

public class Runner {
	public static void main(String[] args){
	Human[] allHuman = {
		new Human("FirstNameOne", "SurnameOne", "MiddleNameOne", "M", 19),
		new Human("FirstNameTwo", "SurnameTwo", "MiddleNameTwo", "M"),
		new Child("FirstNameThree", "SurnameThree", "MiddleNameThree", "M", 19),
		new Child("FirstNameFour", "SurnameFour", "MiddleNameFour", "M", 19, "131b"),
		new Child("FirstNameFive", "SurnameFive", "MiddleNameFive", "M", "131b"),
		new Teenager("FirstNameSix", "SurnameSix", "MiddleNameSix", "M", 13, 56, 8),
		new Teenager("FirstNameSeven", "SurnameSeven", "MiddleNameSeven", "M", 56, 9),
		new Parent("FirstNameEight", "SurnameEight", "MiddleNameEight", "M",33, 2, "PlaceOfWorkOne"),
		new Parent("FirstNameNine", "SurnameNine", "MiddleNameNine", "M", 2, "PlaceOfWorkTwo"),
		new Parent("FirstNameTen", "SernameTen", "MiddleNemaTen", "M",35)
	};
	for(int i=0;i<allHuman.length;i++){
		System.out.println(allHuman[i]);
	};
}
}
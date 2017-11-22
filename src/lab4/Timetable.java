package lab4;
import java.io.Serializable;

public class Timetable implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nameSubject;
	private String techer;
	private int course;
	private int amountOfLecture;
	private int amountOfPractice;
	private String date;
	
	public Timetable(String nameSubject, String techer, int course, int amountOfLecture, int amountOfPractice,
			String date) throws TimetableException{
		super();
		this.nameSubject = nameSubject;
		if (nameSubject.length()<=0){
			 throw new TimetableException("Subject name should consist of at least 3 symbols", nameSubject);
		}
		this.techer = techer;
		if (techer.length()<=0){
			 throw new TimetableException("Techer should consist of at least 5 symbols", techer);
		}
		this.course = course;
		if (course <= 0 || course >=5){
			throw new TimetableException("Invalid course, it should be in range from 1 to 5", course);
		}
		this.amountOfLecture = amountOfLecture;
		this.amountOfPractice = amountOfPractice;
		this.date = date;
	}
	
	public Timetable() {
		super();
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public String getTecher() {
		return techer;
	}

	public int getCourse() {
		return course;
	}

	public int getAmountOfLecture() {
		return amountOfLecture;
	}

	public int getAmountOfPractice() {
		return amountOfPractice;
	}

	public String getDate() {
		return date;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}

	public void setTecher(String techer) {
		this.techer = techer;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void setAmountOfLecture(int amountOfLecture) {
		this.amountOfLecture = amountOfLecture;
	}

	public void setAmountOfPractice(int amountOfPractice) {
		this.amountOfPractice = amountOfPractice;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "" + nameSubject + ";" + techer + ";" + course
				+ ";" + amountOfLecture + ";" + amountOfPractice + ";" + date
				+ "";
	}
}

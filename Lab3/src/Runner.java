import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Lab3.Timetable;

public class Runner {
	public static void main(String[] args) throws IOException{
		Timetable timetable[] = new Timetable[1];
		java.util.Scanner ins = new java.util.Scanner(System.in);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("temp.txt"));
		for (int i=0;i<timetable.length;i++) {
			System.out.println("get nameSubject");
			String nameSubject = ins.nextLine();
			System.out.println("get techer");
			String techer = ins.nextLine();
			System.out.println("get date");
			String date = ins.nextLine();
			System.out.println("get course");
			int course = ins.nextInt();
			System.out.println("get amountOfLecture");
			int amountOfLecture = ins.nextInt();
			System.out.println("get amountOfPractice");
			int amountOfPractice = ins.nextInt();
			timetable[i] = new Timetable(nameSubject, techer, course, amountOfLecture, amountOfPractice, date);
			out.writeObject(timetable[i]);
		}
		ins.close();
		//Timetable timetable = new Timetable("math", "ivanov", 3,10,10,"24.10.2017");
		out.flush();
		out.close(); 
		ObjectInputStream in = new ObjectInputStream (new FileInputStream("temp.txt"));
		Timetable timetable1[] = new Timetable[1];
		try {
			timetable1[0]=(Timetable)in.readObject();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}catch(ClassNotFoundException e1) {
		e1.printStackTrace();	
		}
		for (Timetable Timetable : timetable1) {
		System.out.println(Timetable);  
	}
}
}
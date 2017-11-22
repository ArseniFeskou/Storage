package lab4;

public class TimetableException extends Exception{
	private static final long serialVersionUID = 1L;
	private int number;
	private String line;
	
	public TimetableException(final String message, final int number) {
		super(message);
		this.number = number;
	}

	public TimetableException(final String message,final String line) {
		super(message);
		this.line = line;
	}

	public int getNumber() {
		return this.number;
	}

	public String getLine(){
		return this.line;
	}
}

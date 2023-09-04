package Concepts.exceptionHandling;

public class CustomException extends Exception {
private String message;
	public CustomException(String message) {
		super(message);
		this.message=message;
	}
	
	public  String toString() {
		return message;
	}

	public static void main(String[] args) {
		try {
			throw new CustomException("This  is a custom Exception");
		} catch (CustomException e) {
			System.out.println(e);
		}
	}

}

package JavaBootCamp;

class Overload {
	public void subtraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void subtraction(int num1, int num2, int num3) {
		System.out.println(num1 - num2 - num3);
	}
}

public class OverloadMain {
	public static void main(String[] args) {
		Overload subtractionTest = new Overload();
		subtractionTest.subtraction(150, 100);
		Overload.subtraction(150, 100, 20);
	}
}
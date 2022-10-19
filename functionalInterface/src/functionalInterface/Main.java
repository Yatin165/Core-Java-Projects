package functionalInterface;

public class Main {

	public static void main(String[] args) {

		Student s = new Student(45,"Raman",45000);
		Bonus b1 = s :: bonusCalculate;
	}

}

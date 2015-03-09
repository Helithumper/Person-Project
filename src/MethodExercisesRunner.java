import java.util.Scanner;


public class MethodExercisesRunner {

	public static void main(String[] args) {
			Person method1 = new Person();
			Cell cell1 = new Cell();
			//Get gender is here so that it is calculated first, so that the name can be printed first, but the gender is still printed second
			method1.getGender();
			//method1.guessAge();
			method1.setAge(method1.guessAge());
			System.out.println(method1.toString());
			System.out.println(cell1.toString());
				

	}

}

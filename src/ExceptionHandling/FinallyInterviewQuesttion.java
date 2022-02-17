package ExceptionHandling;

import java.io.ObjectInputStream.GetField;

public class FinallyInterviewQuesttion {

	public static int getMarks(String name) {

		System.out.println("Getting marks for :" +name);
		int marks = 0;
		if (name.equals("Sush")) {
			try {
			//marks = 90/0;
				marks = 90/2;
				System.exit(1);// showndown the jvm,->for o or 1 the jvm will b shut down
				return marks;
			
			}
			catch (ArithmeticException e) {
			System.out.println("AE is coming..");
			return -2;
			}
			finally { // even if marks=90/2 -this will go to finally n return -3. so it always goes to finally
				System.out.println("student is failed"); // always cones to finally and returns -3
				return -3;
			}

		} else if (name.equals("Vijju")) {
			marks = 100;
		} else if (name.equals("Adhu")) {
			marks = 95;
		} else {
			System.out.println("student not found");
			marks = -1;
		}
		return marks;
	}

	public static void main(String[] args) {
		int m = getMarks("Sush");
		System.out.println(m);

	}

}

package javasessionpackage;

public class Student {

	// WAF
	// name:getStudentMarks
	// input param:name( String)
	// return:marks(int)

//	public int getStudentMarks(String studentName) {
//		int marks = -1;
//		System.out.println("Getting marks for student: " + studentName);
//		if (studentName.equals("Sameer")) {
//			marks = 90;
//			// return 90; // v can use return statement or this way.its just readability
//		} else if (studentName.equals("Harshini")) {
//			// return 95;// here v can return this 95 thru syso also but v cant manipulate
//			// the marks
//			marks = 90;
//		} else if (studentName.equals("Ram")) {
//			marks = 100;
//			// return 100;
//		} else if (studentName.equals("Naveen")) {
//			marks = 10;
//			// return 10;
//		} else {
//			System.out.println("Please pass the correct student name....");
//			// return -1;
//		}
//		return marks;
//	}
	
	///---Assignment switch case-----////
	
	public int getStudentMarks(String name) {
		System.out.println("Getting student marks: " +name);
		switch(name) {
		case "Sameer":
			return 90;
		case "Harshini":
			return 95;
		case "Ram":
			return 100;
		case "Naveen":
			return 10;
			default:
				System.out.println("Please enter the correct student name");
				return -1;
				
		}
		
	}

//	public static void main(String[] args) {
//		Student st = new Student();
//		int m = st.getStudentMarks("Sameer");
//		System.out.println(m + 5);// 95 // v can play with value of m only if u return marks etc
//		// System.out.println(m+5-3); eg
//		m = st.getStudentMarks("Sri");
//		System.out.println(m);
//		if (m == -1) {
//			System.out.println("Dont generate the marks sheet");
//		}
//}

	
	////----Assignment main method-----////
	public static void main(String[] args) {
		Student st=new Student();
		int m=st.getStudentMarks("Sameer");
		System.out.println(m);
	}
	

}

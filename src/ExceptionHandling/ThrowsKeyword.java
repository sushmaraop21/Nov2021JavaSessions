package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {
		m2();
	}

	public void m2() {
		try {
		m3();
		}
		catch (ArithmeticException e) {
			System.out.println("AE is comign");
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException { //right way of using handling exception and using throws
		int i = 9 / 0;
//		try {
//			int i = 9 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("AE is comign");
//			e.printStackTrace();
//		}
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();

	}

}

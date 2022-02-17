package ExceptionHandling;

public class TryCatchBlock {

	// compile time exception-> also called checked exception
	// run time exception->unchecked
	String name;

	public static void main(String[] args) {

		// int i=9/0;
		// int k[]=new int[2];
		// k[4]=20; //this is eg for runtime exception

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj=new TryCatchBlock();
		obj=null;
		try {
			obj.name="Sush";
		}
		catch (NullPointerException e) { // we have handling npe exception here and later AIOB exception
			System.out.println("NPE ic coming... ");
			e.printStackTrace();
		}
		try {
			
			 int i=9/0; // execution stops after this goes to respective catch 
			int k[] = new int[2]; // in this case the exception is Array index and it would not go to catch which is bad
									// way of handling exception
			k[4] = 20;
		

			System.out.println("Hello"); // it wouldnt come here after the exception it would go to catch
			System.out.println("Hello");
			System.out.println("Hello");
		}
//		catch (Object e) { // ths s not possible the highest is throwable which v ca use.
//			System.out.println("some exception ic coming... ");
//			e.printStackTrace();
//		}

//		catch (Exception e) {
//			System.out.println("some exception ic coming... ");
//			e.printStackTrace();
//		}
//		catch (Throwable e) { // parent of exception class
//			System.out.println("some exception ic coming... ");
//			e.printStackTrace();
//		}
//		catch (NullPointerException e) {
//			System.out.println("NPE ic coming... ");
//			e.printStackTrace();
//		}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("AIOB ic coming... ");
				e.printStackTrace();
			}
			// int i=9/3; in this case it wouldnt go to ctach n print bye
		 catch (ArithmeticException e) {
			System.out.println("Arithmatic exception ic coming... "); // now it would print bye in the next line after catching the
														// exception
			e.printStackTrace();
		}

		System.out.println("Bye"); // this wont get printed cos the exception is in line 18
		System.out.println("Bye");
		System.out.println("Bye");

	}

}

package ExceptionHandling;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FinallyBlock {
	//try block is compulsory for finally block 
	//but catch is not compulsory -> if catch is commented it wont handle the exception 
	//but it always goes to finally block

	public static void main(String[] args) {
	//	int i=0; //local var this i has to be local or global vari and intialzed to 0.
		System.out.println("A");
		try {
			int i = 9 / 0;
			// i=9/3; //so in this case there is no exception but still goes to finally block
		} 
		catch (ArithmeticException e) {
			System.out.println("AE is coming..");
			e.printStackTrace();
		}
		finally {
			System.out.println("this is finally block"); //this has to be executed finally
		//	System.out.println(i);
		//	int k=9/0; //u can still have a try catch inside the finally block for this eg
		
		}

	}

}

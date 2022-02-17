package javasessionpackage;

/*
  This session is about data types in java
 */
public class DataType {

	public static void main(String[] args) {
		
		//This is my java code
		//1.byte:
		    byte b = 10;
		         b = 20;	
		         b = 30;
		    byte b1 = -20;
		    byte b4 = 0;
		         System.out.println(b);
		         System.out.println(b+b1);
		 
		 //2.Short:
		    short s1 = 1234;
		    short s2 = 1;
		      // prefer s2 to be byte just to store 1
		 
		//3. int:
		    int i= 1000;
		    int j = 1;
		     // again wastage of memory
		 
		//4. long:
		    long distance = 12121212121L;
		        System.out.println(distance);
		 
	    //5.float:
		   float f1 = 12.33f;
		        System.out.println(f1);
		   float f2 = 100;
		        System.out.println(f2);
		 
		 //6.double:
		       double d1 = 12.333399999;
		        System.out.println(d1);
		 
		 //7.char: single digit value
		 
		      char c = 'a';
		      char c1 = '1';
		      char c2 = '$';
		      char h11='b';
		      
		         System.out.println(c);
		         //c=a		         
		         System.out.println(c2);
		         System.out.println(c+h11);
		         //Ascii values c=97+98=195
		         //a-z= 97 to 122
		         //A=Z= 65 to 90
		         //0-9= 48 to 57
		         System.out.println((int)c);
		         //gives 97 
		         System.out.println((byte)c);
		 //8.boolean : 
		 
		      boolean flag = true;
		      boolean h = false;
		         System.out.println(flag);
		         System.out.println(h);
		 
		 
		 
				 

	}

}

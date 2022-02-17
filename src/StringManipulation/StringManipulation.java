package StringManipulation;

public class StringManipulation {
	public static void main(String[] args) {

		String str = "Hello this is my java code";
		System.out.println(str.length());

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(25));
		System.out.println(str.length() - 1); // e ->gives u last letter
		// System.out.println(str.charAt(26)); //string IOB

		System.out.println(str.indexOf('H')); // 0
		System.out.println(str.indexOf('i'));// 1st occurance of i->8th position
		System.out.println(str.indexOf('i', 9));// 11 position->but hard coded(what if the poisition of 'i' s chnaged
		System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // 2nd occurance- this s formula which works for any
																	// string

		// Assignment 3rd occurance of i with the above formula

		String str1 = "Hello this is my java code i am so happy";

		System.out.println(str1.indexOf('i')); // 1st occurance
		System.out.println(str1.indexOf('i', str1.indexOf('i') + 1));// 11 ->2nd occurance
		// System.out.println(str1.indexOf('i', str1.lastIndexOf('i')));// 27
		System.out.println(str1.indexOf('i', str1.indexOf('i', str1.indexOf('i') + 1) + 1));

		System.out.println(str.indexOf("java")); // 17
		System.out.println(str.indexOf("world")); // it gives -1 //on mouseover it says it returns int so -1

		// String mesg = "Hello Naveen"; //this will go to if not else
		String mesg = "Hello null";
		if (mesg.indexOf("Naveen") != -1) {
			System.out.println("mesg is correct");
		} else {
			System.out.println("mesg is incorrect");// this case it comes to else cos Naveen s not found
		}

		String test = "welcome to java";
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());

		// string literals
		String s1 = "Hello world";
		String s2 = "Hello world";
		System.out.println(s1 == s2);// this case gives true

		String s3 = new String("Hello java"); //2 objs
		// 2 objects created for this 1 in heap with s3 reference and 1 in scp with no
		// reference
		String s4 = new String("Hello java");
		// in this case it creates only 1 object inside Heap and inside scp already has
		// a copy so it wont create
		String s5 = "Hello java"; // 0 objects
		// here 0 objects r created as this is a literal and object wont b created in
		// heap and checks scp andrefers with s5	
		
		System.out.println(s3==s5); //false ->comparing 2 different references
		System.out.println(s3.equals(s5)); // true->now it compares 
		
		String s6="Hello world";//0 objects
		
		String s7="Hello Python";//1 
		s7="Hello js";
		System.out.println(s7);
		
		s4=null; //assume this null is coming from an excel->its always good to use this trick
	//	System.out.println(s4.equals(s5)); //NPE
		System.out.println(s5.equals(s4)); //false->programming trick
		
//		if(s4.equals(s5)) { // this gives NPE-> 
//			System.out.println("PASS");
//		}else {
//			System.out.println("Fail");
//		}
		if(s5.equals(s4)) { //it gives fail
			System.out.println("PASS");
		}else {
			System.out.println("Fail");
		}
		
		//equals
		String t1="Hello World"; 
		String t2="hello world  ";
		// 2 entries in scp
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2.trim())); //true
		
		//contains
		System.out.println(t1.contains("hello")); //false ->case sensitive
		
		//trim
		String tr="      helo   testing";
	//	System.out.println(tr.trim());//helo   testing-> wont clear the center space
		System.out.println(tr.replace(" ", ""));
		//replace
		
		String tt="hello             world";
		System.out.println(tt.replace(" ", "")); //helloworld
		
		String dob ="01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-","/"));
		
		//split ->return type is String[]
		
		String lang="JAVA_PYTHON_JS_RUBY";
		String lg[]=lang.split("_");
		System.out.println(lg.length);//4
		System.out.println(lg[0]); //Java
		
		String pop="xXTestingxxXseleniumXxXQTPXXxXCypress";
		String p[]=pop.split("xX");
		System.out.println("----");
		System.out.println(p[0]); // testing is at position 1 ->it prints nothing
		System.out.println(p[1]);//Testingx 
		System.out.println(p[2]);//seleniumX
		System.out.println(p[3]);//QTPXX
		System.out.println(p[4]);//Cypress
	//	System.out.println(p[5]);//AIOB
		System.out.println("----");
		
		String empData="Devesh;Kumar;pune;India;SDET2;IBM";		
		String emp[]=empData.split(";");
		
		for(String e:emp) {
			System.out.println(e);
		}
		//Assignment->reverse string
		String s11="Selenium";
		String revstr="";
		//char ch='\0'; // this is how to initialize char as null
		char ch;
		for(int i=0;i<s11.length();i++) {
			ch=s11.charAt(i);
			revstr=ch+revstr;
		}
		System.out.println("Reverse of Selenium is: "+ revstr);
		//System.out.println(ch);// incase v r using ch v have to initialize
		
		
	}
}

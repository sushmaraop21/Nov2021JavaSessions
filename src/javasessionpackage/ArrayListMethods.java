package javasessionpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> emplist = new ArrayList<>();
		emplist.add("Tom");
		emplist.add("Naveen");
		emplist.add("Haroon");
		emplist.add("Keshav");
		
		System.out.println(emplist);
		
		//Sort
		Collections.sort(emplist);
		System.out.println(emplist);
		//Descending order
		Collections.sort(emplist, Collections.reverseOrder());
		System.out.println(emplist);
		
		//Reverse order using for loop 
		ArrayList<String> stlist = new ArrayList<>();
		stlist.add("Tom");//0
		stlist.add("Harshini");//1
		stlist.add("Divya");//2
		stlist.add("Pradeep");//3 loop has to start from HI as this is reverse order
		
		for(int i=stlist.size()-1;i>=0;i--) { // stlist.size-1 gives HI
			System.out.println(stlist.get(i));
		}
		ArrayList<String> trlist = new ArrayList<>();
		trlist.add("Lisa");//0
		trlist.add("Peter");//1
		trlist.add("Naveen");//2
		trlist.addAll(stlist);
		System.out.println(trlist);
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		List<Integer> data=Arrays.asList(10,20,30);
		System.out.println(data);
		
		List<String> names=Arrays.asList("A","AA","AAA");
		System.out.println(names);	
		
		//Different ways of using static Array
		
		int d[]=new int[3];//using new keyword
		d[0]=10;
		int dd[]= {1,2,3,4,1,2,3,4};//int literal array
		for(int e:dd) {
		System.out.println(e);
		}
		System.out.println(dd[2]);//3
		int ddd[]=new int[]{10,20,30};// v dont need to mention size of the array
		//System.out.println(ddd[3]);//AIOB as the size is 2
		System.out.println("___________");
		System.out.println(ddd.length);//3
		
		String s="Hello";//string literal
		String s1=new String("Hello");//String object
		
		
		
		
	}

}

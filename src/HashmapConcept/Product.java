package HashmapConcept;

import java.util.HashMap;

public class Product {

	public static void main(String[] args) {
		
		//key-value pair
		//<k,v>
		//not order based collection
		
		HashMap<String,String> prodmap=new HashMap<String,String>();
		
		prodmap.put("name", "macbook pro");
		prodmap.put("seller", "xyz ent");
		prodmap.put("size", "macbookpro 16 inch");
		
		System.out.println(prodmap.get("name"));
		System.out.println(prodmap.get("size"));
		
		prodmap.forEach((k,v)->System.out.println(k+":"+v));
		
		HashMap<Integer,String>stMap=new HashMap<Integer,String>();
		stMap.put(1, "Anil");
		stMap.put(2, "Ravi");
		stMap.put(3, "Puja");
		stMap.put(4, "Anil");
		
		System.out.println(stMap.get(4)); //Anil
		System.out.println(stMap.get(8));//null not AIOB->its checking the key not the index
		System.out.println(stMap.size()); //4
		
		//stMap.forEach((a,b)->System.out.println(a+":"+b)); -> can be used with any vars
		stMap.forEach((k,v)->System.out.println(k+":"+v));
	}

}

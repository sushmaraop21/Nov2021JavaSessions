package javasessionpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {

	// WAF
	// name:getCompInfo
	// inputparam:compName(String)
	// return:name,Bangalore,2000,5.5,Tom --->ObjectStatic Array-->Object[]

	public Object[] getComInfo(String compName) {
		System.out.println("getting info for :" + compName);
		Object info[] = new Object[5]; // Static object array

		if (compName.equals("IBM")) {
			info[0] = "IBM";
			info[1] = 1000;
			info[2] = 5.5;
			info[3] = "Bangalore";
			info[4] = "Tom";

		} else if (compName.equals("MS")) {
			info[0] = "MS";
			info[1] = 2000;
			info[2] = 4.5;
			info[3] = "Hyd";
			info[4] = "Peter";
		} else {
			System.out.println("Company name not found..");
		}

		return info;

	}

	// Dynamic Array
	// name:getProductList
	// inputparam:compName(String)
	// return: ArrayList<String>

	public ArrayList<String> getProductList(String compName) {
		System.out.println("getting product list for:" + compName);
		ArrayList<String> prodList = new ArrayList<String>();
	//	System.out.println("prodlist"+prodList.size()); // when u create a blant list then u get 
														//size is 0 as initial PC size is 0
		switch (compName.toLowerCase()) {
		case "amazon":
			prodList.add("macbook");
			prodList.add("samsung");
			prodList.add("imac");
			break;
		case "walmart":
			prodList.add("nike");
			prodList.add("reebok");
			prodList.add("adidas");
			break;
		case "flipkart":
			prodList.add("zara");
			prodList.add("H&M");
			prodList.add("H&B");
			break;

		default:
			System.out.println("company not found :" + compName);
			break;
		}

		return prodList;

	}

	public static void main(String[] args) {
		Company obj = new Company();
		ArrayList<String> amzList = obj.getProductList("Amazon"); // tolowercase will tc of this Amazon
		System.out.println(amzList);
		System.out.println("amazon prod count :" + amzList.size()); //3
			
		
		ArrayList<String> wlmList = obj.getProductList("Walmart");
		System.out.println(wlmList);
		
		//for loop
		System.out.println("-----for loop----");
		for(int i=0;i<wlmList.size();i++) {
			System.out.println(wlmList.get(i));
		}
		//for each loop
		System.out.println("-----for each loop----");
		for(Object e:amzList) {
			System.out.println(e);
		}
		
		ArrayList<String> sdlList = obj.getProductList("snapdeal");
		System.out.println(sdlList); // will return a blank list
		
		//static array 
		Object comp[] = obj.getComInfo("MS");
		System.out.println(Arrays.toString(comp));
	

		Object comp1[] = obj.getComInfo("NAL");
		System.out.println(Arrays.toString(comp1));// [null, null, null, null, null]
		
		//for loop
		System.out.println("-----Static array for loop----");
		for(int i=0;i<comp.length;i++) {
			System.out.println(comp[i]);
		}
		//for each loop
		System.out.println("-----Static array for each loop----");
		for(Object e:comp1) {
			System.out.println(e);
		}
	}
	

}

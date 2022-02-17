package ConstructorConcept;

import java.util.ArrayList;

//class with no main method
public class Company {

	String name;
	int empCount;
	ArrayList<String> catList; // just defining the arraylist not creating the object for arraylist
	boolean isFunded;
	double sharePrice;
	
	
	//method
	public void getCompInfo() {
		System.out.println("Getting company info..");
	}
	public String getCompPlans() {
		System.out.println("getting company plans..");
		return "2022 plans";
	}

	// i will restrict anyone coming and creating the object for this company by
	// creating a const

	// if i create a defualt const anyone will create an object of the company
	// so u cant create a company without giving any specific value
	public Company(String name) {

		this.name = name;
		// practical usecase willbe: u give atleast the company name then v can register ur company
	}

	public Company(String name, int empCount) {

		this.name = name;
		this.empCount = empCount;

	}

	public Company(String name, int empCount, ArrayList<String> catList) {

		this.name = name;
		this.empCount = empCount;
		this.catList = catList;

	}

	// my acceptance criteria in the requirement given by the product owner :that
	// these are the 4 rules(4 constructors) to define
	public Company(String name, int empCount, ArrayList<String> catList, boolean isFunded, double sharePrice) {

		this.name = name;
		this.empCount = empCount;
		this.catList = catList;
		this.isFunded = isFunded;
		this.sharePrice = sharePrice;
	}

}

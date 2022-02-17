package OOP_Interface;

public class TestHospital {
//	final string=name; // final is not for class vars->only for local vars

	public static void main(String[] args) {

//		final int i = 10; //constant var
		
//		i = 20;
//		i = 30;
//		System.out.println(i); // final keyword-> now i cannot have any other values.

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.physioServices();
		fh.medicalfunds();
		fh.covidReport("OMicron");
		fh.medicalfunds(100);
		
		System.out.println(USMedical.min_fee); //10 -> static so v can call this with classname
	//	USMedical.min_fee=20;// cant chnage this value->final n static by default

		USMedical.billing(); //static method can be called with interface name
		//FortisHospital.billing ();// this static method billing can be accessed only by USMedical I
	System.out.println(FortisHospital.min_fee); // same time FortisHospital can access the static var
	
		
		
		
		
		
		
		// USMedical us=new USMedical();//cant create object for an interface

		// top casting:
		// child class object can be referred by parent interface ref variable

		USMedical us = new FortisHospital();
		// ref type check is passed
		us.cardioServices();
		us.emergencyServices(); // this s common method in all interfaces
		us.physioServices();
		us.oncologyServices();
		us.medicalfunds(); // us can access this method from parent

		// this is from ukmedical- ref type check will b failed
		// us.radiologyServices();

		// from indian- refcheck is failed
		// us.dentalServices();

		// from fortisHospital class
		// us.medicalTraining //Failed -this is an individual method

		// Assignment-Topcasting with uk

		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.entServices();
		uk.radiologyServices();
//		uk.physioServices();// this is us .so cant access
//		uk.dentalServices();//this is indian..so cant access
//		uk.medicalInsurance();//this is Fortis class individual method

		// Assignment-Topcasting with indian

		IndianMedical im = new FortisHospital();
		im.dentalServices();
		im.emergencyServices();
		im.pediaServices();

	}

}

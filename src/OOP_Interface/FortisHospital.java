package OOP_Interface;

public class FortisHospital extends UNHG implements USMedical,UKMedical,IndianMedical {

	//US
	@Override
	public void physioServices() {
		System.out.println("FHospital-- physioServices ");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FHospital-- cardioServices ");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FHospital-- oncologyServices ");
		
	}

	//UK
	@Override
	public void radiologyServices() {
		System.out.println("FHospital-- radiologyServices ");
		
	}

	@Override
	public void entServices() {
		System.out.println("FHospital-- entServices ");
		
	}

	//Indian
	@Override
	public void dentalServices() {
		System.out.println("FHospital-- dentalServices ");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FHospital-- pediaServices ");
		
	}

	//common
	@Override
	public void emergencyServices() {
		System.out.println("FHospital-- emergencyServices ");
	}

	//Individual methods
	public void medicalTraining() {
		System.out.println("FHospital-- medicalTraining ");
	}
	public void medicalInsurance() {
		System.out.println("FHospital-- medicalInsurance ");
	}

	//Medical I
	@Override
	public void medicalfunds() {
		System.out.println("FHospital-- medicalfunds ");
		
	}

	@Override
	public void medicalfunds(int fee) {
		System.out.println("FHospital-- medicalfunds "+ fee);
		
	}

	
	//who
	@Override
	public void covidTest() {
		System.out.println("FHospital-- covidTest ");
	}

	
	@Override
	public void vaccination() {
		System.out.println("FHospital-- vaccination ");
		
	}

	@Override
	public void covidReport(String version) {
		System.out.println("FHospital-- covidReport "+version);
		
	}
	//@Override// this cant be overriden 
	//but can have same static method in child class which is called as method hiding
	public static void billing() {  
		System.out.println("FH...billing...");
	}

	@Override
	public void optServices() { // default method in interface should be public here when u override
		System.out.println("FH...opt...");
	}
	
}

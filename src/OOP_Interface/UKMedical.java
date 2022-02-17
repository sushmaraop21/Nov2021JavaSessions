package OOP_Interface;

public interface UKMedical extends Medical {
	
	public void radiologyServices();
	
	public void entServices();
	
	public void emergencyServices();

	
	@Override
	public void vaccination(); //overriding is possible in the child interface but of no use without body
}

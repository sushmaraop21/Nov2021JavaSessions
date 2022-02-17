package OOP_Encapsulation;

public class CustTest {

	public static void main(String[] args) {

		Customer c1=new Customer("Ram",30,"LA"); //(API->POST
		System.out.println(c1.getName()); //(-API-GET)
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());// LA
		
		c1.setCity("Bangalore");// update (API->PUT/Patch)

		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());//Bangalore
	}

}

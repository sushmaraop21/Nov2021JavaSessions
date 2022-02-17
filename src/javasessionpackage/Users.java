package javasessionpackage;

public class Users {

	// methods: class data member
	// method should be parallel to each other
	// method cannot be created inside a method
	// cannot create a duplicate method-but i can overload

	// 1.no input and no return:
	// void: cannot return anything
	// return type :void
	public void test() {
		System.out.println("test method...");
	}

	// 2.no input and some return
	// return type: int
	public int getNumber() {
		System.out.println("get number method...");
		return 100;
	}

	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen Automation Lab";
		return name;
	}

	public boolean isForgotPwdLinkExist() {
		System.out.println("Checking forgot pwd link");
		return true;
	}
	//some  input and some return
	
	public int add(int a,int b) { // a,b are parameters
		System.out.println("add method..");
		int c=a+b;
		return c;
		
		
	}

	public static void main(String[] args) {
		Users obj = new Users();
		obj.test();
		int num = obj.getNumber();
		// long num=obj.getNumber(); // long can be used as its big bro of int but not
		// short
		// short cannot be used cos its a small bro of int
		System.out.println(num);
		String name = obj.getTrainerName();
		System.out.println(name);
		// System.out.println((obj.isForgotPwdLinkExist())); // never write this type of
		// code
		// the problem of this type of code is v should call this function multiple
		// times
		boolean flag = obj.isForgotPwdLinkExist(); // instead use a holding paramter
		System.out.println(flag);
		if (flag) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");//here else is not dead code as in future flag might change to false
			
		}
			int sum=obj.add(20, 10); // here the actual values tht r passed r called arguements 
			System.out.println(sum);
			 
			int s=obj.add(40, 30);
			System.out.println(s+30);// v can use the same add method in different places 
		
	}

}

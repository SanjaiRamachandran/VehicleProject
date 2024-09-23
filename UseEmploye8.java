package task_oops;

public class UseEmploye8 {
	public static void main (String[]args) {
		Address6 a=new Address6(10,"Nagar","CHN","Chennai","TN",9078986);
		
		
		Employe8 e1=new Employe8();
		e1.id=10;
		e1.name="Vijay";
		e1.dept="Engineering";
		e1.age=25;
		e1.salary=25000;
		e1.role="Developer";
		e1.address6=a;
		
		System.out.println(e1.id+" "+e1.name+" "+e1.dept+" "+e1.age+" "+e1.salary+" "+e1.role);
		System.out.println(e1.address6);
		
		

	}
}


class Employe8 {
	int id;
	String name;
	String dept;
	int age;
	int salary;
	String role;
	Address6 address6;
}

class Address6 {
	private int doorNumber;
	private String streetName;
	private String townName;
	private String district;
	private String state;
	private int pincode;
	
	public Address6 (int d,String s,String t,String di,String sa,int p) {
		doorNumber=d;
		streetName=s;
		townName=t;
		district=di;
		state=sa;
		pincode=p;
	}
	public String toString () {
		return doorNumber+" "+streetName+" "+townName+" "+district+" "+state+" "+pincode;
	}
}


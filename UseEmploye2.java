package task_oops;

public class UseEmploye2 {
	public static void main (String[]args) {
		Address1 a=new Address1();
		a.doorNumber=12;
		a.streetName="Nagar";
		a.townName="Ekkatuthangal";
		a.district="Chennai";
		a.state="TN";
		a.pincode=679908;
		
		Employe2 e=new Employe2();
		e.id=20;
		e.name="Vijay";
		e.dept="Maths";
		e.age=28;
		e.salary=25000;
		e.role="Eng";
		e.address1=a;
		
		System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.age+" "+e.salary+" "+e.role);
	    System.out.println(e.address1.doorNumber+" "+e.address1.streetName+" "+e.address1.townName+" "+e.address1.district+" "+e.address1.state+" "+e.address1.pincode);
		
	}

}





class Employe2 {
	int id;
	String name;
	String dept;
	int age;
	int salary;
	String role;
	Address1 address1;
}

class Address1 {
	int doorNumber;
	String streetName;
	String townName;
	String district;
	String state;
	int pincode;
}








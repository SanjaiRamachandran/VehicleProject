package task_oops;

public class UseEmploye4 {
	public static void main (String[]args) {
		Address2 a=new Address2();
		a.doorNumber=12;
		a.streetName="Nagar";
		a.townName="Guindy";
		a.district="Chennai";
		a.state="TN";
		a.pincode=679908;
		
		Employe4 e=new Employe4();
		e.id=20;
		e.name="Vijay";
		e.dept="Maths";
		e.age=28;
		e.salary=25000;
		e.role="Eng";
		e.address2=a;
		
		System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.age+" "+e.salary+" "+e.role);
	    System.out.println(e.address2.doorNumber+" "+e.address2.streetName+" "+e.address2.townName+" "+e.address2.district+" "+e.address2.state+" "+e.address2.pincode);
		
	}

}





class Employe4 {
	int id;
	String name;
	String dept;
	int age;
	int salary;
	String role;
	Address2 address2;
}

class Address2 {
	int doorNumber;
	String streetName;
	String townName;
	String district;
	String state;
	int pincode;
}




package task_oops;

public class UseEmploye1 {
	public static void main (String[]args) {
		Address a=new Address();
		a.street="Nagar";
		a.isCity=true;
		a.pincode=679908;
		
		Employe1 e=new Employe1();
		e.id=20;
		e.name="Vijay";
		e.dept="Maths";
		e.age=28;
		e.salary=25000;
		e.role="Eng";
		e.address=a;
		
		System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.age+" "+e.salary+" "+e.role);
	    System.out.println(e.address.street+" "+e.address.isCity+" "+e.address.pincode);
		
	}

}





class Employe1 {
	int id;
	String name;
	String dept;
	int age;
	int salary;
	String role;
	Address address;
}

class Address {
	String street;
	boolean isCity;
	int pincode;
}




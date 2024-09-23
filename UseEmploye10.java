
package task_oops;

public class UseEmploye10 {
	public static void main (String[]args) {
		Employe e1=new Employe();
		e1.id=10;
		e1.name="Vijay";
		e1.dept="Engineering";
		e1.age=25;
		e1.salary=25000;
		e1.role="Developer";
		
		Employe e2=new Employe();
		e2.id=20;
		e2.name="Ajith";
		e2.dept="Engineering";
		e2.age=28;
		e2.salary=28000;
		e2.role="Tester";
		
		System.out.println(e1.id+" "+e1.name+" "+e1.dept+" "+e1.age+" "+e1.salary+" "+e1.role);
		System.out.println(e2.id+" "+e2.name+" "+e2.dept+" "+e2.age+" "+e2.salary+" "+e2.role);

		
	}

}



class Employe {
	int id;
	String name;
	String dept;
	int age;
	int salary;
	String role;
}

package task_oops;

public class UseEmploye7 {
	public static void main (String[]args) {
		Employe7 e=new Employe7(20,"Vijay","Mat",27,25000,"Eng");
		System.out.println(e);
		
	}
}



class Employe7 {
	private int id;
	private String name;
	private String dept;
	private int age;
	private int salary;
	private String role;
	
	public Employe7 (int i,String n,String d,int a,int s,String r) {
		id=i;
		name=n;
		dept=d;
		age=a;
		salary=s;
		role=r;
	}
	public String toString () {
		return id+" "+name+" "+dept+" "+age+" "+salary+" "+role;
	}

}

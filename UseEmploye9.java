package task_oops;

public class UseEmploye9 {
	public static void main (String[]args) {
		Address7 a=new Address7(10,"Nagar","CHN","Chennai","TN",9078986);
		Employe9 e=new Employe9(20,"Vijay","Mat",27,25000,"Eng",a);
		System.out.println(e);
		
	}
}



class Employe9 {
	private int id;
	private String name;
	private String dept;
	private int age;
	private int salary;
	private String role;
	private Address7 address7;
	
	public Employe9 (int i,String n,String d,int a,int s,String r,Address7 ad) {
		id=i;
		name=n;
		dept=d;
		age=a;
		salary=s;
		role=r;
		address7=ad;
	}
	public String toString () {
		return id+" "+name+" "+dept+" "+age+" "+salary+" "+role+" "+address7;
	}
}

class Address7 {
	private int doorNumber;
	private String streetName;
	private String townName;
	private String district;
	private String state;
	private int pincode;
	
	public Address7 (int d,String s,String t,String di,String sa,int p) {
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

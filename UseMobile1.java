package task_oops;

public class UseMobile1 {
	public static void main (String[]args) {
		Mobile1 m1=new Mobile1(25,"Apple","15pro",70000,16) ;
		System.out.println(m1);	
		Mobile1 m2=new Mobile1(35,"Samsung","Galaxy",50000,12) ;
		System.out.println(m2);	
		Mobile1 m3=new Mobile1(45,"Huweai","13x",60000,14) ;
		System.out.println(m3);	

	}
}




class Mobile1 {
	int id;
	String brand;
	String model;
	int price;
	int memory;
	
	public Mobile1 (int i,String b,String m,int p,int me) {
		id=i;
		brand=b;
		model=m;
		price=p;
		memory=me;
	}
	public String toString () {
		return id+" "+brand+" "+model+" "+price+" "+memory;
	}
}
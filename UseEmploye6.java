package task_oops;

public class UseEmploye6 {
		public static void main (String[]args) {
			Address5 a=new Address5();
			a.setDoorNumber(10);
			a.setStreetName("Nagar");
			a.setTownName("CHN");
			a.setDistrict("Chennai");
			a.setState("TN");
			a.setPincode(6709790);
			
			Employe6 e=new Employe6();
			
			e.setId(15);
			e.setName("Vijay");
			e.setDept("Mat");
			e.setAge(28);
			e.setSalary(25000);
			e.setRole("Eng");
			e.setAddress5(a);
			
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getRole());
			System.out.println(e.getAddress5().getDoorNumber()+" "+e.getAddress5().getStreetName()+" "+e.getAddress5().getTownName()+" "+e.getAddress5().getDistrict()+" "+e.getAddress5().getState()+" "+e.getAddress5().getPincode());

			
		}
	}




	class Employe6 {
		private int id;
		private String name;
		private String dept;
		private int age;
		private int salary;
		private String role;
		private Address5 address5;
		
		public void setId (int i) {
			id=i;
		}
		public int getId () {
			return id;
		}
		public void setName (String n) {
			name=n;
		}
		public String getName () {
			return name;
		}	
		public void setDept (String d) {
			dept=d;
		}
		public String getDept () {
			return dept;
		}	
		public void setAge (int a) {
			age=a;
		}
		public int getAge () {
			return age;
		}	
		public void setSalary (int s) {
			salary=s;
		}
		public int getSalary () {
			return salary;
		}	
		public void setRole (String r) {
			role=r;
		}
		public String getRole () {
			return role;
		}	
		public void setAddress5 (Address5 address5) {
			this.address5=address5;
		}
		public Address5 getAddress5 () {
			return address5;
		}
		
	}

	class Address5 {
		private int doorNumber;
		private String streetName;
		private String townName;
		private String district;
		private String state;
		private int pincode;
		
		public void setDoorNumber (int a) {
			doorNumber=a;
		}
		public int getDoorNumber () {
			return doorNumber;
		}
		public void setStreetName (String s) {
			streetName=s;
		}
		public String getStreetName () {
			return streetName;
		}
		public void setTownName (String t) {
			townName=t;
		}
		public String getTownName () {
			return townName;
		}
		public void setDistrict (String d) {
			district=d;
		}
		public String getDistrict () {
			return district;
		}
		public void setState (String sa) {
			state=sa;
		}
		public String getState () {
			return state;
		}
		public void setPincode (int p) {
			pincode=p;
		}
		public int getPincode () {
			return pincode;
		}	
	}


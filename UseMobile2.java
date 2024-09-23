package task_oops;

public class UseMobile2 {
	public static void main (String[]args) {
		Mobile2 m=new Mobile2();
		m.setId(25);
		m.setBrand("Apple");
		m.setModel("15Pro Max");
		m.setPrice(70000);
		m.setMemory(16);
		
		System.out.println(m.getId()+" "+m.getBrand()+" "+m.getModel()+" "+m.getPrice()+" "+m.getMemory());
		
	}
}





class Mobile2 {
	private int id;
	private String brand;
	private String model;
	private int price;
	private int memory;
	
	public void setId (int i) {
		id=i;
	}
	public int getId () {
		return id;
	}
	public void setBrand (String b) {
		brand=b;
	}
	public String getBrand () {
		return brand;
	}
	public void setModel (String m) {
		model=m;
	}
	public String getModel () {
		return model;
	}
	public void setPrice (int p) {
		price=p;
	}
	public int getPrice () {
		return price;
	}
	public void setMemory (int me) {
		memory=me;
	}
	public int getMemory () {
		return memory;
	}

}
package task_oops;

public class UseMobile3 {
	public static void main (String[]args) {
		Camera c=new Camera();
		c.brand="Sony";
		c.pixel=108;
		
		Mobile3 m=new Mobile3();
		m.id=15;
		m.brand="apple";
		m.model="15pro";
		m.price=75000;
		m.memory=16;
		m.camera=c;
		
		System.out.println(m.id+" "+m.brand+" "+m.model+" "+m.price+m.memory);
		System.out.println(m.camera.brand+" "+m.camera.pixel);
	}
}







class Mobile3 {
	int id;
	String brand;
	String model;
	int price;
	int memory;
	Camera camera;
}

class Camera {
	String brand;
	int pixel;
}
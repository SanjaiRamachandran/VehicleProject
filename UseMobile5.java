package task_oops;

public class UseMobile5 {
	public static void main (String[]args) {
		
		
	Camera2 c=new Camera2(108,"8X","16X",true);
	
	Mobile5 m=new Mobile5();
	m.id=45;
	m.brand="Samsung";
	m.model="S23";
	m.price=80000;
	m.memory=32;
	m.camera2=c;
	
	System.out.println(m.id+" "+m.brand+" "+m.model+" "+m.price+" "+m.memory);
	System.out.println(m.camera2);
	
	}
}



class Mobile5 {
	int id;
	String brand;
	String model;
	int price;
	int memory;
	Camera2 camera2;
}

class Camera2 {
	private int pixel;
	private String opticalZoom;
	private String digitalZoom;
	private boolean isBack;
	
	public Camera2 (int p,String o,String d,boolean i) {
		pixel=p;
		opticalZoom=o;
		digitalZoom=d;
		isBack=i;
	}
	public String toString () {
		return pixel+" "+opticalZoom+" "+digitalZoom+" "+isBack;
	}
}
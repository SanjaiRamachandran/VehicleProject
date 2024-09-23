package task_oops;

public class UseMobile4 {
	public static void main (String[]args) {
		Camera1 c=new Camera1();
		c.setPixel(108);
		c.setOpticalZoom("2X");
		c.setDigitalZoom("4X");
		c.setIsBack(true);
		
		Mobile4 m=new Mobile4();
		m.id=45;
		m.brand="Samsung";
		m.model="S23";
		m.price=80000;
		m.memory=32;
		m.camera1=c;
		
		System.out.println(m.id+" "+m.brand+" "+m.model+" "+m.price+" "+m.memory);
		System.out.println(m.camera1.getPixel()+" "+m.camera1.getOpticalZoon()+" "+m.camera1.getDigitalZoom()+" "+m.camera1.getIsBack());
		
		
	}
}



class Mobile4 {
	int id;
	String brand;
	String model;
	int price;
	int memory;
	Camera1 camera1;
}

class Camera1 {
	private int pixel;
	private String opticalZoon;
	private String digitalZoom;
	private boolean isBack;
	
	public void setPixel (int p) {
		pixel=p;
	}
	public int getPixel () {
		return pixel;
	}
	public void setOpticalZoom (String o) {
		opticalZoon=o;
	}
	public String getOpticalZoon () {
		return opticalZoon;
	}
	public void setDigitalZoom (String d) {
		digitalZoom=d;
	}
	public String getDigitalZoom () {
		return digitalZoom;
	}
	public void setIsBack (boolean i) {
		isBack=i;
	}
	public boolean getIsBack () {
		return isBack;
	}
	
}
package task_oops;

public class UseHuman1 {
	public static void main (String[]args) {
		SoftEngi s=new SoftEngi();
		System.out.println(s.eat(true)+" "+s.sleep("Night")+" "+s.walk(15)+" "+s.workForLiving("Developer")+" "+s.showSalary("10LPA")+" "+s.work("Eng"));
		
	}
}



interface Human1 {
	public boolean eat (boolean e);
	public String sleep (String s);
	public int walk (int w);
}
abstract class Engi implements Human1 {
	public abstract String workForLiving (String a);
	public abstract String showSalary (String s);
}
class SoftEngi extends Engi {
	public boolean eat (boolean e) {
		return e;
	}
	public String sleep (String sl) {
		return sl;
	}
	public int walk (int w) {
		return w;
	}
	public String workForLiving (String a) {
		return a;
	}
	public String showSalary (String s) {
		if(s.equals("4LPA")) {
			return "0-4 Years Experience";
		}
		else if(s.equals("7LPA")) {
			return "5-9 Years Experience";
		}
		else if(s.equals("10LPA")) {
			return "10-15 Years Experience";
		}
		else {
			return "Above 15 Years Experience";
		}
	}
	public String work (String wo) {
		return wo;
	}
}
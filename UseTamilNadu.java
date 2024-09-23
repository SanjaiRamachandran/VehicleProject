package task_oops;

public class UseTamilNadu {
	public static void main (String[]args) {
		TamilNadu t=new TamilNadu();
		System.out.println(t.displayFontSize(14)+" "+t.displayFontStyle("Calibric")+" "+t.displayColour("greenwithwhite")+" "+t.displayStateCode(600001));
	}

}



interface NumberPlate {
	public int displayFontSize (int a);
	public String displayFontStyle (String b);
	public String displayColour (String c);
	public int displayStateCode (int d);
}
abstract class CentralGovtRule implements NumberPlate {
	public String displayFontStyle (String a) {
		return a;
	}
	public int displayFontSize (int b) {
		return b;
	}
}
class TamilNadu extends CentralGovtRule {
	public String displayColour (String a) {
		if(a.equalsIgnoreCase("blackWithYellow")) {
			return "Public";
		}
		else if(a.equalsIgnoreCase("blackWithWhite")) {
			return "Private";
		}
		else {
			return "Electric";
		}
	}
	public int displayStateCode (int b) {
		return b;
	}
}
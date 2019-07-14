package packone;

public class CallMethods {

	public static void main(String[] args) throws Exception{
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com", "C:\\Users\\DELL\\Desktop\\WD8\\fb.png");
		m.elementPresent("email", true);
		m.elementPresent("pass", false);
		m.elementsCount("a", 30);
		m.elementsCount("select", 3);
		m.closeApp();
		m.launchApp("http://rediff.com", "C:\\Users\\DELL\\Desktop\\WD8\\rediff.png");
		m.elementsCount("img", 200);
		m.closeApp();
		
		
		

	}

}

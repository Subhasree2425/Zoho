package week2.day2;

public class Apple implements SmartPhone {

	public void fingerPrint() {
		System.out.println("Accessed");
		
	}

	public void mobileBrowser() {
		System.out.println("New Tab Opened");
		
	}

	public void embededMemory() {
		System.out.println("Memory embeded");
		
	}
	public static void main(String[] arg) {
		Apple app = new Apple();
		app.fingerPrint();
		app.mobileBrowser();
		app.embededMemory();
	}

}

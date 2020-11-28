/* OVERLOADING
 * 
 * 1.Create a class Calculator with three methods of same name multiply()
 * method 1-Two int values
 * method 2-two double values
 * method 3-three int values
 */





package week2.day1;

public class PolymorpCalculator {
	public void  mul(int a, int b) {
		System.out.println(a*b);
	}
	
	
	public void mul(double a,double b) {
		System.out.println(a*b);
		
	}

	public void mul(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	
	public static void main(String[] args) {
		PolymorpCalculator cc= new PolymorpCalculator();
		cc.mul(10, 20);
		cc.mul(20.5,10.5);
		cc.mul(10, 20, 30);
		
	}
}

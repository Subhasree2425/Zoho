package week1.works;

import week2.day1.LearnInheritanceCar;

public class LearnInheritanceBMW extends LearnInheritanceCar {
	
	public void selfDriving() {
		System.out.println("self driving enabled");
	}


public static void main(String[]args) {
	 LearnInheritanceBMW obj=new LearnInheritanceBMW();
	 obj.applyBreak();
	 obj.startEngine();
	 obj.selfDriving();
}
	
}
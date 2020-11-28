/*1.String[] companies= {"Wipro", "Google", "TCS","Microsoft"}-Print in reverse order(list)
 
*/


package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		String[] Comp= {"Wipro", "Google", "TCS","Microsoft"};
		List<String> values= new ArrayList<String>();
		/*
		 * values.add("Wipro"); values.add("Google"); values.add("TestLeaf");
		 * values.add("TCS"); values.add("Microsoft");
		 */
		
		
		for(String val: Comp) {
			values.add(val);
			
		}
		Collections.sort(values);
		Collections.reverse(values);
	
		System.out.println(values);
	}
	
}


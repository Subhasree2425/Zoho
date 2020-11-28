/*2.int[] num= {25,35,25,35,45,55,62}-Remove duplicates*/


package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.Set;

public class LearnSet {
 public static void main(String[] args) {
	/* Set<Integer> values=new HashSet<Integer>();
	 values.add(25);
	 values.add(35);
	 values.add(25);
	 values.add(35);
	 values.add(45);
	 values.add(55);
	 values.add(62);
	
	 for(Integer val: values) {
		 System.out.println(val);
	 }
	 
	 
}
}*/
	 
	 
int[] num= {25,35,25,35,45,55,62};
Set<Integer> values=new LinkedHashSet<Integer>();

for(Integer newValues : num) {
	values.add(newValues);

}
System.out.println(values);
 }
}
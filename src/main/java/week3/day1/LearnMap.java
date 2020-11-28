//String name="Hariprasad"

/*Psuedo Code
1.Convert string to tochar array
2.declare an empty map<Character,Integer>(<K,v>)
3.Declare a foreach and consider each char using array
4.declare a ifcondition and set condition as Map.contains char
5.declare a else and check whether the char is available or not
*/



package week3.day1;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {
	public static void main(String[] args) {
		String name="Hariprasad";
	    char[] charArray = name.toCharArray();
	    
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
	
		for (char ch: charArray) {
			if(map.containsKey(ch)) {
	
				map.put(ch,map.get(ch)+1);
					
			}else {
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
	}

}

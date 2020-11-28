/*write a java pgm to find the given string is palindrome
 * eg.madam
 */




package week1.works;

public class Palindrome {

	public static void main(String[] args) {
		String text="madam";
		String reverse="";
		char[] charArray = text.toCharArray();
		int length=charArray.length;
		System.out.println(length);
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+charArray[i];
			System.out.print(charArray[i]);
		}
		if(reverse.equalsIgnoreCase(text)) {
			System.out.println("Given String is Palindrome");
		}
		else
		{
			
			System.out.println("Given String is Not Palindrome");
		}
	}

}

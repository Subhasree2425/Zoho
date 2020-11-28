/*write a java pgm to print
 * Fibonacci sequence 0,1,1,2,3,5,8,13,21
 */
package week1.works;

public class FibonacciSeq {

	public static void main(String[] args) {
		int count=10;
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(+n1+",");
		System.out.print(+n2+",");
		//for(int i=0;i<count-2;i++);
		for(int i=2;i<count; i++) {
			
			//int fibonacci=n1+n2;
			//n1=n2;
			//n1=fibonacci;
			//System.out.print(+fibonacci+",");
			sum=n1+n2;
			System.out.print(+sum+",");
			n1=n2;
			n2=sum;
			
			
			
		}

	}

}

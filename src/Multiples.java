/* Allen Payne 
 * Project Euler #1
 * 9-16-18
 */


import java.util.ArrayList;

public class Multiples {
	public static void main(String[] args) {
		int total = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int x = 0; x<1000; x++) {
			if(x%3 == 0 && x%5 ==0) {
				nums.add(x); //added the Array to check that the multples were correct and not duplicating
			}
			else if(x%5 == 0) {
				nums.add(x);
			}
			else if(x%3 == 0) {
				nums.add(x);
			}
		}
		for (int y : nums) { // prints the multiples so I know they werent duplication
			System.out.print(y + " ");
			total = total + y; //adds up the numbers to a total
		}
		System.out.println(total); //displays the total for me
	
	}
}

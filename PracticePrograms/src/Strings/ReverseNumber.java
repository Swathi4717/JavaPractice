package Strings;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		// Taking number as an input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse the number: ");
		int x = sc.nextInt();

		long sum = 0, rem = 0; 
		// logic for reversing number
		while (x!=0) {
			rem = x%10;
			sum = (sum*10) + rem;
			x = x/10;
		} 
		
		// checking for overflow, if not print reversed number else print 0.
		if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE ) System.out.println(0);
		else   System.out.println("Reversed number: "+(int)sum);

	}
}

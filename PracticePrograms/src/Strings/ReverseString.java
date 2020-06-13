package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hard-coded array
		// char[] s = {'H', 'e', 'l', 'l', 'o', 'o'};
		
		// Taking array input from the keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array: ");
		int n = sc.nextInt();
		char[] s = new char[n];
		System.out.println("Enter elements: ");

		// loop for taking keyboard input into an array
		for(int i=0; i<n; i++) {
			s[i] = (char) sc.next().charAt(0);
		}
		
		// Printing actual string
		System.out.print("Actual string: ");
        for(char a : s) {
        	System.out.print(a+" ");
        }
        System.out.println();
		char temp = ' ';
        int i = s.length-1;
        for(int j=0; j<s.length/2; j++){
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i--;
        }
        
        // Printing reversed string
        System.out.print("Reversed string: ");
        for(char a : s) {
        	System.out.print(a+" ");
        }
        
	}

}

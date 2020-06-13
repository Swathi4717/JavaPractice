package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		// Hard-coded sorted array
		//int[] nums = {1,1,2,3,3,4,5,5,5,6};

		// Taking array input from the keyboard		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter elements: ");

		// loop for taking keyboard input into an array
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}

		//sorting array
		Arrays.sort(nums);

		// loop for removing duplicates from the sorted list
		int j = 0;
		for(int i=1; i<nums.length; i++) {
			if(nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];               
			}

		}

		for(int k=0; k<=j ;k++) {
			System.out.print(nums[k] + " ");
		}

	}
}


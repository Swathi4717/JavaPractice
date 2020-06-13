package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hard-coded test case
		//int[] nums = {2, 7, 11, 15};
		//int target = 9;
		
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

		// Take input target
		System.out.println("Enter target: ");
		int target = sc.nextInt();

		int[] k = new int[2];

		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++)
				if(i!=j && nums[i] + nums[j] == target) {
					k[0] = j;
					k[1] = 1;
				}

		}
		
		// return indices of the sum elements
		for(int a : k) {
			System.out.print(a+" ");
		}



	}

}

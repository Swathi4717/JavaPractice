package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4};
		boolean state = false;



		//		Set<Integer> s = new HashSet<>();
		//        for(int a : nums) {
		//            if(s.add(a) == false) state = true;
		//            
		//        }
		// Runtime 9ms for above approach
		

		// Alternative approach, Runtime 4ms
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1]) state = true;
		}       
		System.out.println(state);

	}

}

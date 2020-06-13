package Arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		LinkedList<Integer> num = new LinkedList<>();
		for (int id: nums) {
			num.add(id);
		}
		System.out.println(num);
		int l = num.size()-1;
		int temp = 0;
		for(int j=0; j<k; j++){
			temp = num.remove(l);
			num.addFirst(temp);
		}

		//Collections.rotate(num, k);
		System.out.println(num);
	}

}

package MoveZeroes;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		System.out.println(Arrays.toString(moveZeros(nums)));
		int[] nums2 = {0,0,1};
		//System.out.println(Arrays.toString(moveZeros(nums2)));
	}
	
	public static int[] moveZeros(int[] nums) {
		for(int i=0; i < nums.length; i++) {
			if(nums[i] == 0) {
				for(int j=i; j< nums.length; j++) {
					if(nums[j] !=0) {
						nums[i] = nums[j];
						nums[j] =0;
						break;
					}
				}	
			}
		}
		return nums;
	}

}

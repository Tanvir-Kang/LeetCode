package SingleNumber;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 1, 2 };
		// System.out.println(singleNumber(nums));
		int[] nums2 = { 2, 2, 1 };
		System.out.println(singleNumber(nums2));
	}

	public static int singleNumber(int[] nums) {
		int index = 0;
		Boolean match = false;
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					match = true;
					break;
				}
			}
			if(!match) {
				return nums[i];
			}

		}
		return index;
	}

}

// https://leetcode.com/problems/two-sum/

package day20;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int target = 9;
        int target2 = 6;
        TwoSum ts = new TwoSum();
        int[] arr = ts.twoSum(nums2, target2);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

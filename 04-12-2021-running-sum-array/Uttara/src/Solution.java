import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intArrays = new int[][]{{1, 2, 3, 4}, {1, 1, 1, 1, 1}, {3, 1, 2, 10, 1}};

        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(Arrays.toString(solution.runningSum1(intArrays[i])));
            System.out.println(Arrays.toString(solution.runningSum2(intArrays[i])));
        }
    }

    //Time Complexity = O(n) & Space Complexity = O(n)
    public int[] runningSum1(int[] nums) {
        int outArray[] = new int[nums.length];
        outArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            outArray[i] = outArray[i - 1] + nums[i];
        }
        return outArray;
    }

    //Time Complexity = O(n) & Space Complexity = O(1)
    public int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}

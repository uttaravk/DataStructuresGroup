import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intArrays = new int[][]{{2, 7, 11, 15}, {3, 2, 4}, {3, 3}};
        int[] targets = new int[]{9, 6, 6};

        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(Arrays.toString(solution.twoSum1(intArrays[i], targets[i])));
            System.out.println(Arrays.toString(solution.twoSum2(intArrays[i], targets[i])));
        }

    }


    //Brute Force Solution
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    //Optimized Solution
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> mapnums = new HashMap<>();
        for (int pos = 0; pos < nums.length; pos++) {
            if (mapnums.containsKey(target - nums[pos])) {
                return new int[]{pos, mapnums.get(target - nums[pos])};
            } else {
                mapnums.put(nums[pos], pos);
            }
        }
        return null;
    }
}

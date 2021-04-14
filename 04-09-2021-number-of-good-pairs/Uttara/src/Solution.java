import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intArrays = new int[][]{{1, 2, 3, 1, 1, 3}, {1, 1, 1, 1}, {1, 2, 3}};

        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(solution.numIdenticalPairs1(intArrays[i]));
            System.out.println(solution.numIdenticalPairs2(intArrays[i]));
        }

    }

    //Brute Force Solution
    //Time Complexity: O(n-1)^2
    public int numIdenticalPairs1(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt = cnt + 1;
                }
            }
        }
        return cnt;
    }


    //Optimized Solution: nC2 solution [(n(n-1))/2]
    //Time Complexity: 2 x O(n)
    public int numIdenticalPairs2(int[] nums) {
        int cnt = 0;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = numsMap.containsKey(nums[i]) ? numsMap.get(nums[i]) : 0;
            numsMap.put(nums[i], val + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            Integer value = entry.getValue();
            if (value > 1) {
                cnt = cnt + ((value * (value - 1)) / 2);
            }
        }
        return cnt;
    }
}

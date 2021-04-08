import java.util.Arrays;

public class TwoSumSolution {

    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[][] intArrays = new int[][]{{2, 7, 11, 15}, {3, 2, 4}, {3, 3}};
        int[] targets = new int[]{9, 6, 6};

        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(Arrays.toString(twoSumSolution.twoSum(intArrays[i], targets[i])));
        }

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

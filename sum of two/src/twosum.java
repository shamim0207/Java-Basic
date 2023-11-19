import java.util.HashMap;
public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the difference between the target and each element along with their index
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numMap.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{numMap.get(complement), i};
            }

            // Put the current number and its index into the map
            numMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }
}

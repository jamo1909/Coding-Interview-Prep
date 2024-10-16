import java.util.HashMap;
import java.util.Map;

/**
 * @Author James Murphy (Jmurph08)
 *
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 **/
public class twoSum {

        //Attempt 1
        public int[] twoSum(int[] nums, int target) {
            int result [] = {0,0};
            for(int i=0; i < nums.length; i++){
                for(int j=0; j < nums.length; j++){
                    if(i != j){
                        int sum = nums[i] + nums[j];
                        if(target == sum){
                            result [0] = i;
                            result [1] = j;
                            break;
                        }
                    }
                }
            }
            return result;
        }

    //Attempt 2
    public int[] twoSumAttempt2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); //Declare Hashmap
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i); //Populate new hashmap with array items
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];//Complement is equal to minus the current item from the target, to get the number we are looking for.
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {//Check the hashmap is in the hashmap, and make sure that its not the same numbers that we have used to get the complement
                return new int[]{i, numMap.get(complement)};// Return an array with the item that we're on and the key on the complement
            }
        }

        return new int[]{}; //If no solution found return an empty array
    }

}

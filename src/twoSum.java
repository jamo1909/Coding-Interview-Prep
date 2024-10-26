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


    public int[] twoSumAttempt2(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){
            int num = target - nums[i];
            for(int j=0; j < nums.length; j++){
                if(i != j && nums[j] == num){
                    return new int[] {i, j} ;
                }
            }
        }
        return null;
    }

    //Attempt 2
    public int[] twoSumAttempt3(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }

        for(int j=0; j < nums.length; j++){
            int comp = target - nums[j];

            if(numMap.containsKey(comp) && numMap.get(comp) != j){
                return new int[]{j, numMap.get(comp)};
            }
        }

        return null;
    }

}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {2,7,1,15};
        TwoSum twoSum = new TwoSum();
        int target = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(arr, target)));

    }
    /*
     Two Sum Pattern:
        ✔ "Find pair"
        ✔ "target - current"
        ✔ use hashmap for O(1) lookup
        ✔ One pass traversal

        Time: O(n)
        Space: O(n)
     */

    public int[] twoSum(int[]  arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff)) {
                return new int[] { map.get(diff), i};
            }
            map.put(arr[i],i);
        }
        return null;
    }
}

import java.util.HashSet;
import java.util.Set;

public class containDuplicates {

    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(containDuplicates(nums));
    }

    public static boolean containDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

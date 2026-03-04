
import java.util.HashSet;
import java.util.Set;

public class containDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 7, 8, 9, 6, 5, 4, 2, 6, 8};
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                System.out.println("true");
            }
            set.add(num);
        }
        System.out.println("false");
    }
}

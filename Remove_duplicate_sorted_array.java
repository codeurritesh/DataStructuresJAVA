import java.util.*;
public class Remove_duplicate_sorted_array {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            l.add(nums[i]);
        HashSet<Integer> sets = new HashSet(l);
        return sets.size();
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        Remove_duplicate_sorted_array obj =new Remove_duplicate_sorted_array();
        System.out.println(obj.removeDuplicates(arr));
    }
}

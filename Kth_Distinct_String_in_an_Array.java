import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Kth_Distinct_String_in_an_Array {
    public static void main(String[] args) {
        String arr[] = {"d","b","c","b","c","a"};
        int  k = 2;
        System.out.println(kthDistinct(arr,k));
    }
    public static String kthDistinct(String[] arr, int k) {
        ArrayList<String> set=new ArrayList<>();
        int count=0;
        List<String> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for(String s:set) {
            count=0;
            for (int j = 0; j < arr.length ; j++) {
                if(s.equals(set.get(j))){
                    count++;
                }
            }
            if(count==1)
                list.add(s);
        }

        if(list.size()<k)
            return "";
        return list.get(k-1);
    }
}

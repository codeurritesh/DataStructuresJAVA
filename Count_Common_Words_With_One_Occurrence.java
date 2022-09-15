import java.util.HashSet;
import java.util.Set;

public class Count_Common_Words_With_One_Occurrence {
    public static void main(String[] args) {
        String[] arr1 = {"leetcode", "is", "amazing", "as", "is"};


        String[] arr2 = {"amazing", "leetcode", "is"};

        System.out.println(countWords(arr1, arr2));
    }

    public static int countWords(String[] arr1, String[] arr2) {


        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            int j = 0;
            int t = 0;
            while (j < arr1.length) {
                if (arr1[i].equals(arr1[j])) {
                    t++;

                }

                j++;
            }
            if (t == 1) {

                s1.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            int j = 0;
            int t = 0;
            while (j < arr2.length) {
                if (arr2[i].equals(arr2[j])) {
                    t++;

                }

                j++;
            }
            if (t == 1) {

                s2.add(arr2[i]);
            }
        }
        s1.retainAll(s2);
        return s1.size();
    }
}


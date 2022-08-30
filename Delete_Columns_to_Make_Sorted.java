import java.util.Arrays;

public class Delete_Columns_to_Make_Sorted {
    public static int minDeletionSize(String[] s) {
    int count=0;
    if(s[0].length()==1)
        return 0;
        for (String t:s) {
            char[] ans1=t.toCharArray();
             char[] ans=t.toCharArray();
            Arrays.sort(ans);
            String s1=new String(ans);
            String s2=new String(ans1);

                     if(s1.equals(s2))
            {
             count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String strs[] = {"a","b"};
        System.out.println(minDeletionSize(strs));
    }
}

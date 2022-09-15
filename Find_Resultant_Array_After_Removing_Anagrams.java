import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Resultant_Array_After_Removing_Anagrams {
    public static void main(String[] args) {
String words[] = {"abba","baba","bbaa","cd","cd"};
List<String> lt=new ArrayList<>();
lt=removeAnagrams(words);
        System.out.println(lt);
    }
    public static List<String> removeAnagrams(String[] words) {
        List<String>lt=new ArrayList<>();
        List<String>lt2=new ArrayList<>();
        for (int i = words.length-1; i >0 ; i--) {
            if(check(words[i],words[i-1])){
                words[i]="";
            }
            else
                lt.add(words[i]);

        }
        lt.add(words[0]);
        for (int i=lt.size()-1;i>=0;i--) {
            lt2.add(lt.get(i));
        }
        return lt2;
    }

    public static boolean check(String str,String str1){
        char temp[]=str.toCharArray();
        Arrays.sort(temp);
        String str3 = new String(temp);
        char temp1[]=str1.toCharArray();
        Arrays.sort(temp1);
        String str2 = new String(temp1);
        if(str3.equals(str2))
            return true;
        return false;
    }
}

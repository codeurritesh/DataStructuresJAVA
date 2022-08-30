import java.util.ArrayList;
import java.util.List;

public class Find_Common_Characters
{
    public static List<String> commonChars(String[] words) {
        List<String> st=new ArrayList<>();
        int count=0;
        for (int i = 0; i < words[0].length() ; i++) {
            count=0;
            for (int j = 1; j < words.length ; j++) {
                int k=words[j].indexOf(words[0].charAt(i));

                if(k!=-1)
                {
                    String s=""+words[0].charAt(i);//c
                    words[j]=words[j].replaceFirst(s,"");//k,ok
                    System.out.println(words[j]);
                    s="";//""
                    count++;//1
                }
                else
                    break;
            }
            if(count== words.length-1){
                String str=Character.toString(words[0].charAt(i));
                st.add(str);
                str="";
            }
        }

return st;
    }
    public static void main(String[] args) {
        String words[] = {"bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"};
        List<String> st=commonChars(words);
        System.out.println(st);
    }
}

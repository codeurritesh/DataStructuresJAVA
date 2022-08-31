import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class String_Matching_in_an_Array {
    public static List<String> stringMatching(String[] words) {
        String words2[]=words;
//        System.out.println(words2[0]);
        List<String> lt=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(j!=i){
                    if(words2[j].contains(words[i])){
                        lt.add(words[i]);
                        break;
                    }

                }
            }

        }
//        System.out.println(words2[2].contains(words[2]));
        return lt;
    }
    public static  void main(String[] args) {
        String words[] = {"leetcode","et","code"};
     List<String> lt=stringMatching(words);
        System.out.println(lt);
    }
}

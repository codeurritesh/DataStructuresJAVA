import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Shortest_completing_word {
    public String shortestCompletingWord(String lp, String[] words) {
        String ab="";
        String words2[]=words;
        lp=lp.toLowerCase();
        lp=lp.replaceAll(" ","");
        lp=lp.replaceAll("[0-9]","");
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> sw=new ArrayList<>();
        int p=-1;
        for (String s:words) {//step,steps,stripe//spst
            p++;//1
            for (int i = 0; i < lp.length(); i++) {//spst
                String check = "";
                check = "" + lp.charAt(i);
                if (s.contains(check)) {
                    s = s.replaceFirst(check, "");//e

                } else {//words[]:step,steps,stripe
                    sw.add(words2[p]);//sw[]:step,stripe
                    break;
                }
            }
        }
int z=0;

        ArrayList<String>ans=new ArrayList<>();
        for (String s:words2) {//words[]:step,steps,stripe
            p=0;
            for (int i = 0; i < sw.size(); i++) {//sw[]:step,stripe
                if(s.contentEquals(sw.get(i)))
                {
                    p=1;
                    break;
                }
            }
            if(p==0)
                ans.add(s);
        }//ans:steps

       //Collections.sort(ans);
        int min=1000;
        for (int i = 0; i < ans.size(); i++) {
            if(ans.get(i).length()<min)
            {
                min=ans.get(i).length();
                p=i;
            }

        }
        sw.clear();
        for (String s:ans) {
            if(s.length()==min)
                sw.add(s);
        }


        System.out.println(sw);
        return sw.get(0);
    }

    public static void main(String[] args) {
        String lp= "B687015"; //spst
        String words[] = {"born","give","would","nice","in","understand","blue","force","have","that"};
        Shortest_completing_word obj=new Shortest_completing_word();
        System.out.println(obj.shortestCompletingWord(lp,words));

    }
}
//lp:"1s3 456"=s
//ans:"looks","pest","stew","show" sl=4
//pest,stew,show;

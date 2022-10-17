import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String str="NITIN";
        List<String> list=new ArrayList<>();
        List<List<String>> output=new ArrayList<>();
        part(str,list, output);
        System.out.println(output);
    }
    public static void part(String ques, List<String> list, List<List<String>>output){
        if(ques.length()==0){
            output.add(new ArrayList<>(list)); // output.add(List.of(ans));
            return;
        }
        for (int cut = 1; cut <=ques.length() ; cut++) {
            String s1=ques.substring(0,cut);
            if(ispal(s1)){
                list.add(s1);
            part(ques.substring(cut),list, output);
            list.remove(list.size()-1);
        }}
    }
    public static boolean ispal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

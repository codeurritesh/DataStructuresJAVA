import java.util.Arrays;

public class count_the_number_of_consistent_strings {
    public static void main(String[] args) {
        String allowed = "cad", words[] = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
//        char string[]=allowed.toCharArray();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < allowed.length(); j++) {
                String s=""+allowed.charAt(j);
                if(words[i].contains(s)){
                    words[i]=words[i].replaceAll(s,"");
                }
                s="";
            }
            if(words[i].equals(""))
                count++;
        }
        return count;
    }
    }


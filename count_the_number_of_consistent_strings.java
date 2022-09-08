import java.util.Arrays;

public class count_the_number_of_consistent_strings {
    public static void main(String[] args) {
        String allowed = "abc", words[] = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        char string[]=allowed.toCharArray();
        for (int i = 0; i < allowed.length(); i++) {
            for (int j = 0; j < words.length; j++) {
                if(words[i].contains("ab")){

                }
            }
        }
        return count;
    }
    }


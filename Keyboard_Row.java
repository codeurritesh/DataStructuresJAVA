import java.util.*;
public class Keyboard_Row {
    public static void main(String[] args) {
        String[] st={"qwertyuiopQWERTYUIOP","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        String[] words = {"Hello","Alaska","Dad","Peace"};
        int k=0;
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        for (String s:st) {
            for (String s2:words) { //alaska
                for (int i = 0; i <s2.length(); i++) {   // h>>E>>L>>L>>O
                    for (int j = 0; j <s.length() ; j++) {
                        if (s2.charAt(i) == s.charAt(j)) {
                            k++;
                        }
                    }

                }

                if(k==s2.length())
                    list.add(s2);
                k=0;
            }

        }
        System.out.println(list);
    }}

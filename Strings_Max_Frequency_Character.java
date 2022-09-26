import java.util.Scanner;

public class Strings_Max_Frequency_Character {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int max=0;
        char ch='a';
        for (int i = 0; i < str.length(); i++) {
            if(max<find(str,str.charAt(i))){
                max=find(str,str.charAt(i));
                ch=str.charAt(i);
            }

        }
        System.out.println(ch);
    }
    public static int  find(String str,char ch){
        int c=0;
        for (int i = 0; i <str.length() ; i++) {
            if(ch==str.charAt(i))
                c++;
        }
        return c;
    }
}

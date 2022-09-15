public class Find_First_Palindromic_String_in_the_Array {
    public static void main(String[] args) {
        String Words[]={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(Words));
    }
    public static String firstPalindrome(String[] words) {
        String s=new String();
        for (int i = 0; i < words.length ; i++) {
            if(find(words[i])){
             s=words[i];
             break;
            }
        }
        return s;
    }
    public static boolean find(String st){
        int end=st.length()-1;
        int start=0;
        while(start<=end){
        if(st.charAt(start)!=st.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
return true;
    }
}

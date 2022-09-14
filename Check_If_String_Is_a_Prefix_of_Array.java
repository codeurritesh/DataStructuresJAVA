public class Check_If_String_Is_a_Prefix_of_Array {
    public static void main(String[] args) {
        String s="a";
        String st[]={"aa","aaaa","banana"};
        System.out.println(isPrefixString(s,st));
    }
    public static boolean isPrefixString(String s, String[] words) {
        String st="";
        for (int i = 0; i < words.length; i++) {
            st+=words[i];
            if(st.equals(s)){
                return true;
            }
        }
     return false;
    }
}

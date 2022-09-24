public class Reverse_Word_in_String {
    public static void main(String[] args) {
        String  s = "hello      world";
        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\s+");
        String str="";

        for (int i = arr.length-1; i >=0 ; i--) {
            if(i!=0)
                str=str+arr[i]+" ";
            else
                str=str+arr[i];
        }
        return str;
    }
}

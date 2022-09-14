public class Truncate_Sentence {
    public static void main(String[] args) {
String s="Hello this is ritesh verma here in front of you";
    int k=4;
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k) {
        String st[]=s.split(" ");
        String str="";
        for (int i = 0; i <k ; i++) {
            if(i!=k-1){
                str=str+st[i]+" ";
            }else
                str=str+st[i];
        }
return str;
    }
}

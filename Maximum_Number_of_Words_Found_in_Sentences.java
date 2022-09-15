public class Maximum_Number_of_Words_Found_in_Sentences {
        public static int mostWordsFound(String[] sentences) {
            int max=Integer.MIN_VALUE;
            for (String i:sentences) {
                int m=cheak(i);
                if(m>max)
                    max=m;
            }
    return  max+1;
        }
        public static int cheak(String str){
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==' '){
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
       String  se[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(se));
    }
}

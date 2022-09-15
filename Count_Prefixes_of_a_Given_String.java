public class Count_Prefixes_of_a_Given_String {
    public static void main(String[] args) {
        String words[] = {"a","b","c","ab","bc","abc"}, s = "abc";
        System.out.println(countPrefixes(words,s));
    }
        public static int countPrefixes(String[] words, String s) {
            int count=0;
            for (String c:words) {
                if(s.indexOf(c)==0)
                    count++;
            }
            return count;
        }
}

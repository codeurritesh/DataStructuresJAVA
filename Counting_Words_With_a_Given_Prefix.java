public class Counting_Words_With_a_Given_Prefix {
    public static void main(String[] args) {
         String words[] = {"pay","attention","practice","attend"}, pref = "at";
        System.out.println(prefixCount(words,pref));

    }
    public static int prefixCount(String[] words, String pref) {
        int count=0;
        for (String s:words) {
        if(s.indexOf(pref)==0){
            count++;
        }
        }
        return count;
    }

}

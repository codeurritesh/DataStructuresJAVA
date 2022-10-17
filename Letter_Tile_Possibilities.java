public class Letter_Tile_Possibilities {
    public static void main(String[] args) {
        String str="AAB";
        int [] freq=new int[26];
        for (int i = 0; i <str.length() ; i++) {
            int ind=str.charAt(i)-'A';
            freq[ind]++;
        }
//        for (int i = 0; i < freq.length; i++) {
//            System.out.println(freq[i]+" ");
//        }
        System.out.println(tile(freq,""));
    }
    public static int tile(int [] freq, String ans){
//        System.out.println(ans);
        int count=0;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>=1){
                char ch=(char)(i+'A');
                freq[i]--;
             count+=tile(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return count;
    }
}

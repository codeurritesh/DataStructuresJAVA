public class DI_String_Match {
    public static int[] diStringMatch(String s) {
    int arr[]=new int[s.length()+1];
    int min=0;
    int max=s.length();
        int i;
        for (i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='D'){
                arr[i]=max--;
            }
            else
            {
                arr[i]=min++;
            }
        }
        arr[i]=max;
    return arr;
    }
    public static void main(String[] args) {
        String s="IDID";




        int arr[]=diStringMatch(s);
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

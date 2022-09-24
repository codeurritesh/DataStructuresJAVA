public class Substring_of_String {
    public static void main(String[] args) {
        String s="hello";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length()+1; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}

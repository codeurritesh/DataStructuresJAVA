import java.util.Scanner;

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Excel_Sheet_Column_Title obj=new Excel_Sheet_Column_Title();
        System.out.println( obj.convertToTitle(num));
    }
        public String convertToTitle(int n) {
            StringBuilder sb = new StringBuilder();

            while (n > 0) {
                int tmp = (n - 1) % 26;
                sb.append((char) ('A' + tmp));

                n = (n - 1) / 26;
            }

            return sb.reverse().toString();
        }

}

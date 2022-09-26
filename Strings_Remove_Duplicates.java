import java.util.Scanner;
public class Strings_Remove_Duplicates {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String st= sc.next();
            System.out.print(removedup(st));
        }
        public static String removedup(String st)
        {
            if(st.length()<=1)
            {
                return st;
            }
            if(st.charAt(0)==st.charAt(1))
            {

                return removedup(st.substring(1));
            }
            else
            {
                return st.charAt(0)+removedup(st.substring(1));
            }
        }
    }
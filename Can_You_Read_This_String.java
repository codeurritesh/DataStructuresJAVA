import java.util.Scanner;

public class Can_You_Read_This_String {

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(Character.isUpperCase(s.charAt(i))){
                    System.out.println();
                }
                System.out.print(s.charAt(i));
            }

        }
    }
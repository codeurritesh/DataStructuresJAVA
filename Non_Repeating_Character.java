import java.util.*;
public class Non_Repeating_Character {
    public static void main(String args[]) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=s.next();
        }
        for(String t:str)
        {
            check(t);
        }

    }
    public static void check(String st){
        int count=0;
        int n=st.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(st.charAt(i)==st.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(st.charAt(i));
                break;
            }
            else if(i==n-1){
                System.out.println("-1");
            }
            count=0;
        }
    }
}

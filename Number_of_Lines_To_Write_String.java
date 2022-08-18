import java.util.ArrayList;

public class Number_of_Lines_To_Write_String {
    public static int [] numberOfLines(int[] arr2, String s) {
        int ans []= new int [2];
        int k=0;
        char arr1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int c=0;
        int t=0;
        for(int i=0;i<s.length();i++)
        {
            for(char j=0;j<arr1.length;j++)
            {
                if(s.charAt(i)==arr1[j])
                {
                    c+=arr2[j];
                    t+=arr2[j];
                    if(c>100)
                    {
                        k++;
                        i--;
                        c=0;
                        t=0;
                    }
                    break;
                }
            }
        }

        ans[0]=k+1;
        ans[1]=t;
        return ans;
        
    }

    public static void main(String[] args) {
        int arr2[]={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s="bbbcccdddaaa";
        int ans[]=numberOfLines(arr2,s);
        for(int i:ans)
        {
            System.out.print(i);
        }
//        numberOfLines(arr2,s);

    }
}
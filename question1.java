package Heap_Priority_Queue;
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=sum(arr,n);
        System.out.println(ans);
    }
    public static int sum(int input1[],int input2){
        int sum=0;
        for(int i=0;i<input2;i++){
            if(!isprime(i)){
                sum+=input1[i];
            }
        }
        return sum;
    }
    public static boolean isprime(int num){
        if(num==0 || num==1){
            return false;
        }
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0)
            count++;
        }
        if(count ==0){
            return true;
        }
        return false;
    }
}

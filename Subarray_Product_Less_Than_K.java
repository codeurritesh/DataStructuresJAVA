public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,2,3};
        int k=10;
        System.out.println(NoofSubArray(arr,k));
    }
    public static  int NoofSubArray(int[] arr,int k){
        int ans=0,si=0,ei=0,p=1;

        while(ei< arr.length)
        {
            //window grow
            p*=arr[ei];


            //window shrink
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;
            }

            //ans calculate
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }
}

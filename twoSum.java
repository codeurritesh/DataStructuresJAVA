class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int c;
        int m=0,n=0;
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                c=nums[i]+nums[j];
                if(c==target)
                {
                    m=i;
                    n=j;
                    t=1;
                    break;
                }
            }
            if(t==1)
            {
                break;
            }
        }
        arr[0]=m;
        arr[1]=n;
        return arr;
}}

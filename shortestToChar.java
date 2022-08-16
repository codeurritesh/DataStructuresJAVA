class Solution {
    public int[] shortestToChar(String s, char c) {
      ArrayList<Integer> arr=new ArrayList<Integer>();//temp. storing 
        ArrayList<Integer> in=new ArrayList<Integer>();//indexes
        int ans[]=new int [s.length()];//final arr
        ArrayList<Integer> ans1=new ArrayList<Integer>();//virtual
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                in.add(i);
            }
        }
        // System.out.print(in);
            for(int i=0;i<s.length();i++)
            {
                for(int j=0;j<in.size();j++)
                {
                   int z=Math.abs(in.get(j)-i);
                    arr.add(z);
                }
                int p=Collections.min(arr);
                ans1.add(p);
                
                arr.clear();
                
            }
        int k=0;
        for(int i:ans1)
        {
            ans[k]=i;
            k++;
        }
        
        
return ans;
    }
}

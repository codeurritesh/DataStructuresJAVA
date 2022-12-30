class Solution {
   
        public List<Boolean> prefixesDivBy5(int[] A) {
        int r=0;
        List<Boolean> res=new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            r= (r<<1)+A[i];
            r%=5;
            res.add(r==0);
        }
        return res;
   
    }
}

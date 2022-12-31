class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
          StringBuilder st1=new StringBuilder();
        StringBuilder st2=new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            st1.append(word1[i]);
           
        }
         for (int i = 0; i < word2.length; i++) {
           
            st2.append(word2[i]);
        }
        if(st1.toString().equals(st2.toString())){
            return true;
        }

return false;
    
}
    
}

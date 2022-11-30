class Solution {
    public String discountPrices(String sentence, int discount) {
           String[] words=sentence.split("\\s");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            String word1=words[i];
            String newString="";
            if(word1.charAt(0)=='$')
            {
                String word=word1.substring(1);
                if (word == null) 
                {
                    newString=word1;
                }
                    
                else
                {
                    int length = word.length();
                    if (length == 0) 
                    {
                        newString=word1;
                    }
                    else
                    {
                        int j = 0,f=0;
                        if (word.charAt(0) == '-') 
                        {
                            if(length==1)
                            {
                                newString=word1;
                                f=1;
                            }
                        }
                        if(f==0)
                        {
                            int flag=0;
                            for (; j < length; j++) 
                            {
                                char c = word.charAt(j);
                                if (c < '0' || c > '9') 
                                {
                                    newString=word1;
                                    flag=1;
                                    break;
                                }
                            }
                            if(flag==0)
                            {
                                double price=Double.parseDouble(word);
                                double dis=(discount/100.0)*price;
                                price=price-dis;
                                newString="$"+String.format("%.2f", price)+"";
                            }
                        }
                        
                    }
                    
                }
                
                
            }
            else
                newString=word1;
            ans.append(newString+" ");
        }
        return ans.toString().trim();
    }
}
 

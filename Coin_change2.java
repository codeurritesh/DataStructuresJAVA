public class Coin_change2 {
    public static int change(int amount, int[] coins) {
        int []ch=new int[amount+1];
        ch[0]=1;
        for(int coin:coins){
            for(int i=coin;i<amount+1;i++)
            {
                ch[i]+=ch[i-coin];
            }
        }
        return ch[amount];

    }
    public static void main(String[] args) {
        int []coins = {1,2,5};
        int amount = 11;
        System.out.println(change(amount,coins));
    }
}

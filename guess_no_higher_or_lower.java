
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int h = Integer.MAX_VALUE;
        
        while (l <= h) {
            int mid = l + (h - l)/2;
            
            if (guess(mid) == 0)
                return mid;
            
            if (guess(mid) == 1)
                l = mid + 1;
            
            else
                h = mid - 1;
        }
        
        return h;
    }
}

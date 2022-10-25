import java.util.*;
public class Word_Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[][] arr = new char[][]{{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}};
        String word = s.next();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==word.charAt(0)){
                    boolean ans= searchword(arr,i,j,word,0);
                    if(ans) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
public static boolean searchword(char[][] board, int cr, int cc, String word, int idx){
        if(idx==word.length()) {
            return true;
        }

        if(cr<0 || cc<0 || cr>= board.length || cc>=board[0].length || board[cr][cc]!=word.charAt(idx)){
            return false;
        }

        board[cr][cc] = '*';
        int [] r={-1,1,0,0};
        int [] c={0,0,-1,1};
        for (int i = 0; i <c.length ; i++) {
            boolean ans = searchword(board,cr+r[i],cc+c[i],word,idx+1);
            if (ans)
                return true;
        }

        board[cr][cc] = word.charAt(idx);
        return false;
    }
}

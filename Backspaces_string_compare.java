import java.util.Scanner;
import java.util.Stack;

public class Backspaces_string_compare {

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            String str1 = s.next();
            String str2=s.next();
            System.out.println(backspaceCompare(str1,str2));
        }
        public static boolean backspaceCompare(String s, String t) {
            Stack<Character> stack = new Stack<>();
            Stack<Character> stack2 = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == '#') {if(!stack.isEmpty())
                    stack.pop();
                } else
//                stack.equals(stack2);
                    stack.push(ch);
            }
            for (char ch : t.toCharArray()) {
                if (ch == '#') {
                    if(!stack2.isEmpty())
                        stack2.pop();
                } else
                    stack2.push(ch);
            }
            if(stack.equals(stack2)){
                return true;
            }
            else
                return false;
        }

    }


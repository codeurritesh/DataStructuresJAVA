import java.util.*;
public class Playing_with_Good_Strings {
        public static void main(String args[]) {
            Scanner st = new Scanner(System.in);
            int max = 0, count = 0;

            String s = st.next();

            for (char i : s.toCharArray()) {
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
                    count++;
                else if (max < count) {
                    max = count;
                    count = 0;
                } else {
                    count = 0;
                }
            }
            if (max < count)
                max = count;
            System.out.println(max);
        }
    }


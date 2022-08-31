//import java.util.Collections;
//
//public class Verifying_an_Alien_Dictionary {
//    public static boolean isAlienSorted(String[] words, String order) {
//    boolean check=true;
//    char c1,c2;
//        for (int i = 0; i < words.length-1; i++) {//0
//            int ind = Math.max(words[i].length(), words[i + 1].length());
//            for (int j = 0; j < ind; j++) {//0 1 2 3 4
//
//                if (j < words[i].length())
//                    c1 = words[i].charAt(j);//d
//                else
//                    c1 = '@';
//
//                if (j < words[i+1].length())
//                    c2 = words[i + 1].charAt(j);
//                else
//                    c2 = '@';
//
//                if (c1 == '@' || c2 == '@') {
//                    if (c1 == '@' && c2 != '@') {
//                        check = true;
//                        break;
//                    } else if (c1 != '@' && c2 == '@') {
//                        check = false;
//                        break;
//                    }
//                } else {
//
//                    int c1_index = order.indexOf(c1);//4
//                    int c2_index = order.indexOf(c2);//3
//                    System.out.println(c1_index + "  <  " + c2_index);
//                    if (c1_index < c2_index) {
//                        check = true;
//                        break;
//                    } else if (c1_index > c2_index) {
//                        check = false;
//                        break;
//                    }
//                }}
//                if (check == false)
//                    break;
//                else
//                    break;
//
//
//
//        }
//    return check;
//    }
//    public static void main(String[] args) {
//        String[] words ={"apple","app"};
//
//        String order =  "abcdefghijklmnopqrstuvwxyz";
//        System.out.println(isAlienSorted(words,order));
//    }
//}

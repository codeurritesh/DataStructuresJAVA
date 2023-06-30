package Binary_tree;

import java.util.Scanner;

public class String_operations_0_ans_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int choose=s.nextInt();
        char[] array=str.toCharArray();
        int result=0;
        String sans="";
        if(choose==0){
            for(char i:array){
                if(Character.isDigit(i))
                result+=Integer.parseInt(""+i);
            }
            System.out.println(result);
        }else if(choose==1){
            for(char i:array){
                if(Character.isLetter(i)){
                    sans=sans+i;
                }
            }
            System.out.println(sans);
        }

    }
}

public class Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        String op[]={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(op));
    }
    public static int finalValueAfterOperations(String[] operations) {
int temp=0;
        for (int i = 0; i <operations.length ; i++) {
            if(operations[i].equals("++X") || operations[i].equals("X++"))
                temp++;
            else
                if(operations[i].equals("--X") || operations[i].equals("X--"))
                    temp--;
        }
    return temp;
    }
}

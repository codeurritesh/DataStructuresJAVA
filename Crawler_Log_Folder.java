public class Crawler_Log_Folder {
    public static int minOperations(String[] logs) {
int count=0;
        for (int i = 0; i < logs.length; i++) {
            if(!(logs[i].equals("../")||logs[i].equals("./")))
            {
                count++;
            }
            else if(logs[i].equals("../"))
            {
                if(count-1>=0)
                count-=1;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));

    }
}

import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        List<List<String>> aList = new ArrayList<List<String>>();

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("phone");
        a1.add("blue");
        a1.add("pixel");
        aList.add(a1);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("computer");
        a2.add("silver");
        a2.add("phone");
        aList.add(a2);

        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("phone");
        a3.add("gold");
        a3.add("iphone");
        aList.add(a3);
        String rk="type";
        String rv="phone";
        System.out.println(countMatches(aList,rk,rv));
    }
    public static int countMatches(List<List<String>> items, String rk, String rv) {
int p=0,count=0;
        switch (rk) {
            case "type" -> p = 0;
            case "color" -> p = 1;
            case "name" -> p = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(p).equals(rv)){
                count++;
            }
        }
        return count;
    }

}

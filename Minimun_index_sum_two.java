import java.util.*;

public class Minimun_index_sum_two {
    String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> str=new ArrayList<>();
        ArrayList<String> str2=new ArrayList<>();
        ArrayList<Integer> index=new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {


                if (list1[i].compareTo(list2[j])==0){
                    str.add(list1[i]);
                    index.add(i+j);

                }
            }
        }
        int min=Collections.min(index);
        for (int i = 0; i < index.size(); i++) {
            if (index.get(i)==min)
                str2.add(str.get(i));
        }

        String[] Arr=new String[str2.size()];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i]=str2.get(i);
        }
        return Arr;



    }
    public static void main(String[] args) {
        String[] l1 =    {"Shogun","Tapioca Express","Burger King","KFC"} ;
        String[] l2 =  {"KFC","Burger King","Tapioca Express","Shogun"};


        Minimun_index_sum_two obj=new Minimun_index_sum_two();
        String[] ans=obj.findRestaurant(l1,l2);
        for (String s:ans) {
            System.out.println(s);
        }
    }
}

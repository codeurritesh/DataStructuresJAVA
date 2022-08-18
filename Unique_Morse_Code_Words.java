import java.util.HashSet;
import java.util.Locale;

public class Unique_Morse_Code_Words {
    public int uniqueMorseRepresentations(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {

                if(words[i].charAt(j)=='a')
                    words[i]=words[i].replace("a",".-");
                if(words[i].charAt(j)=='b')
                    words[i]=words[i].replace("b","-...");
                if(words[i].charAt(j)=='c')
                    words[i]=words[i].replace("c","-.-.");
                if(words[i].charAt(j)=='d')
                    words[i]=words[i].replace("d","-..");
                if(words[i].charAt(j)=='e')
                    words[i]=words[i].replace("e",".");
                if(words[i].charAt(j)=='f')
                    words[i]=words[i].replace("f","..-.");
                if(words[i].charAt(j)=='g')
                    words[i]=words[i].replace("g","--.");
                if(words[i].charAt(j)=='h')
                    words[i]=words[i].replace("h","....");
                if(words[i].charAt(j)=='i')
                    words[i]=words[i].replace("i","..");
                if(words[i].charAt(j)=='j')
                    words[i]=words[i].replace("j",".---");
                if(words[i].charAt(j)=='k')
                    words[i]=words[i] .replace("k","-.-");
                if(words[i].charAt(j)=='l')
                    words[i]=words[i].replace("l",".-..");
                if(words[i].charAt(j)=='m')
                    words[i]=words[i].replace("m","--");
                if(words[i].charAt(j)=='n')
                    words[i]=words[i].replace("n","-.");
                if(words[i].charAt(j)=='o')
                    words[i]=words[i].replace("o","---");
                if(words[i].charAt(j)=='p')
                    words[i]=words[i].replace("p",".--.");
                if(words[i].charAt(j)=='q')
                    words[i]=words[i].replace("q","--.-");
                if(words[i].charAt(j)=='r')
                words[i]=words[i].replace("r",".-.");
                if(words[i].charAt(j)=='s')
                    words[i]=words[i].replace("s","...");
                if(words[i].charAt(j)=='t')
                    words[i]=words[i].replace("t","-");
                if(words[i].charAt(j)=='u')
                    words[i]=words[i].replace("u","..-");
                if(words[i].charAt(j)=='v')
                    words[i]=words[i].replace("v","...-");
                if(words[i].charAt(j)=='w')
                    words[i]=words[i].replace("w",".--");
                if(words[i].charAt(j)=='x')
                    words[i]=words[i].replace("x","-..-");
                if(words[i].charAt(j)=='y')
                    words[i]=words[i].replace("y","-.--");
                if(words[i].charAt(j)=='z')
                    words[i]=words[i].replace("z","--..");
            }
        }
        HashSet<String> remove=new HashSet<>();

        for (String s:words )
            remove.add(s);

            return remove.size();


    }

    public static void main(String[] args) {
        Unique_Morse_Code_Words obj=new Unique_Morse_Code_Words();
        String arr[]={"gin","zen","gig","msg"};
       // arr[2]=arr[2].replace("g","---.-");
        System.out.println(obj.uniqueMorseRepresentations(arr));
    }
}

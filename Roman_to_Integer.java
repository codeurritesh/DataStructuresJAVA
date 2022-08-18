public class Roman_to_Integer {
    public int romanToInt(String s) {
        int ans = 0;
        while(!s.contentEquals("")){
        if (s.contains("IV")) {
            ans += 4;
            s = s.replaceFirst("IV", "");
            System.out.println(s);
        }
        if (s.contains("IX")) {
            ans += 9;
            s = s.replaceFirst("IX", "");
            System.out.println(s);
        }
        if (s.contains("XL")) {
            ans += 40;
            s = s.replaceFirst("XL", "");
            System.out.println(s);
        }
        if (s.contains("XC")) {
            ans += 90;
            s = s.replaceFirst("XC", "");
            System.out.println(s);
        }
        if (s.contains("CD")) {
            ans += 400;
            s = s.replaceFirst("CD", "");
            System.out.println(s);
        }
        if (s.contains("CM")) {
            ans += 900;
            s = s.replaceFirst("CM", "");
            System.out.println(s);
        }
        if (s.contains("I")) {
            ans += 1;
            s = s.replaceFirst("I", "");
            System.out.println(s);
        }
        if (s.contains("V")) {
            ans += 5;
            s = s.replaceFirst("V", "");
            System.out.println(s);
        }
        if (s.contains("X")) {
            ans += 10;
            s = s.replaceFirst("X", "");
            System.out.println(s);
        }
        if (s.contains("L")) {
            ans += 50;
            s = s.replaceFirst("L", "");
            System.out.println(s);
        }
        if (s.contains("C")) {
            ans += 100;
            s = s.replaceFirst("C", "");
            System.out.println(s);
        }
        if (s.contains("D")) {
            ans += 500;
            s = s.replaceFirst("D", "");
            System.out.println(s);
        }
        if (s.contains("M")) {
            ans += 1000;
            s = s.replaceFirst("M", "");
            System.out.println(s);
        }
    }
        return ans;
    }

    public static void main(String[] args) {
        String  s ="LVIII";
        Roman_to_Integer obj=new Roman_to_Integer();
        System.out.println(obj.romanToInt(s));
    }
}

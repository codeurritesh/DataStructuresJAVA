import java.util.*;
public class Strings_Toggle_Case{
    public static void main(String args[]) {
       Scanner s=new Scanner (System.in);
	   String str=s.next();
	   String ss="";
	   for(int i=0;i<str.length();i++)
	   {
		   int k=(int)str.charAt(i);
		   if(k>=65 && k<=74)
		   {
			   char ch=Character. toLowerCase(str.charAt(i));
			   ss+=ch;
		   }
		   else
		   {
			   
			   char ch=Character. toUpperCase(str.charAt(i));
			   ss+=ch;
		   }
	   }
	   System.out.print(ss);
    }
}
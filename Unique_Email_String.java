public class Unique_Email_String {
    public int numUniqueEmails(String[] emails) {
int pl_ind=0;

        for (int i = 0; i < emails.length; i++) {
            int at=emails[i].indexOf('@');
            pl_ind=0;
            for (int j = 0; j < at; j++) {
                if (emails[i].charAt(j) == '.')
                    emails[i]=emails[i].replaceFirst(".", "");
                if (emails[i].charAt(j) == '+' && pl_ind == 0) {
                    pl_ind = j;
                    emails[i]=emails[i].replace(emails[i].substring(j,at),"");


                }

            }
            System.out.println(emails[i]);

        }
return 0;
    }

    public static void main(String[] args) {
        Unique_Email_String obj=new Unique_Email_String();
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(obj.numUniqueEmails(emails));
        System.out.println();
    }
}

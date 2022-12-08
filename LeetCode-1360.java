class Solution {
    final static int[] daysUpToMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    final static int[] daysUpToMonthLeapYear = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
    
    public int GetDaysOffsetFromOrigin(int year, int month, int day) {
        if (isLeapYear(year)) {
            year--;
            int numOfLeapsYear = year / 4 - year / 100 + year / 400;
            return year * 365 + numOfLeapsYear + daysUpToMonthLeapYear[month - 1] + day - 1;
        } else {
            year--;
            int numOfLeapsYear = year / 4 - year / 100 + year / 400;
            return year * 365 + numOfLeapsYear + daysUpToMonth[month - 1] + day - 1;
        }
    }    
    
    public int daysBetweenDates(String date1, String date2) {
        int y1 = Integer.parseInt(date1.substring(0, 4));
        int m1 = Integer.parseInt(date1.substring(5, 7));
        int d1 = Integer.parseInt(date1.substring(8, 10));

        int y2 = Integer.parseInt(date2.substring(0, 4));
        int m2 = Integer.parseInt(date2.substring(5, 7));
        int d2 = Integer.parseInt(date2.substring(8, 10));

        int daysOffset = GetDaysOffsetFromOrigin(y1, m1, d1);
        int daysOffset2 = GetDaysOffsetFromOrigin(y2, m2, d2);

        int diff = daysOffset2 - daysOffset;

        return diff >= 0 ? diff : -diff;        
    }
}

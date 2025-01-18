class Solution {
    public int getDaysTill(String date) {
        String[] values = date.split("-");
        int year = Integer.parseInt(values[0]);
        int month = Integer.parseInt(values[1]);
        int day = Integer.parseInt(values[2]);
        int n_days = 0;
        for (int i = 1900; i < year; i++) {
            n_days += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 1; i < month; i++) {
            switch(i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: n_days += 31; break;
                case 2: n_days += (isLeapYear(year) ? 29 : 28); break;
                default : n_days += 30;
            }
        }

        n_days += day - 1;
        return n_days;
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int daysBetweenDates(String date1, String date2) {
        int days1 = getDaysTill(date1);
        int days2 = getDaysTill(date2);
        System.out.println(Math.abs(days2 - days1) - 1);
        int result = Math.abs(days2 - days1) ;
        return result;
    }
}
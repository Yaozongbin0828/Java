import java.util.Scanner;
public class Page261_test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //第一个年月日
        System.out.println("请输入第一个日期");
        System.out.print("年份：");
        int year1 = input.nextInt();
        System.out.print("月份：");
        int month1 = input.nextInt();
        System.out.print("日：");
        int day1 = input.nextInt();
        //第二个年月日
        System.out.println("请输入第二个日期");
        System.out.print("年份：");
        int year2 = input.nextInt();
        System.out.print("月份：");
        int month2 = input.nextInt();
        System.out.print("日：");
        int day2 = input.nextInt();
        // 计算两个日期距离的天数
        int days1 = getDaysFromOrigin(year1, month1, day1);
        int days2 = getDaysFromOrigin(year2, month2, day2);

        // 计算两个日期之间的天数间隔 Math.abs:返回给定参数的绝对值。如果参数不为负,则返回参数。如果参数为负,则返回参数的取反
        int interval = Math.abs(days2 - days1);
        System.out.println("两个日期之间的天数间隔为：" + interval);
    }
    // 计算某个日期距离公元元年1月1日的天数
    public static int getDaysFromOrigin(int year, int month, int day) {
        int days = 0;
        for (int i = 1; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 1; i < month; i++) {
            days += getDaysOfMonth(year, i);
        }
        days += day;
        return days;
    }
    // 计算某年某月的天数
    public static int getDaysOfMonth(int year, int month) {
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        return days;
    }

    // 判断某年是否为闰年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}




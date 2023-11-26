import java.util.Scanner;
public class Page261_test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        // 计算该月的天数
        int days = getDaysOfMonth(year, month);
        // 计算该月的第一天是星期几
        int firstDayOfWeek = getFirstDayOfWeek(year, month);
        // 输出日历页 \t为制表符，作用是对齐
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= days; i++) {
            System.out.print(i + "\t");
            if ((i + firstDayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
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
    // 计算某年某月的第一天是星期几
    public static int getFirstDayOfWeek(int year, int month) {
        int century = year / 100;
        int yearInCentury = year % 100;
        if (month == 1 || month == 2) {
            month += 12;
            yearInCentury--;
        }
        int dayOfWeek = (yearInCentury + yearInCentury / 4 + century / 4 - 2 * century + 26 * (month + 1) / 10) % 7;
        if (dayOfWeek < 0) {
            dayOfWeek += 7;
        }
        return dayOfWeek;
    }
}



import java.util.Scanner;

public class Demonstrate {

    public static int[] dayCount = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // 윤년 계산기
    public static boolean isleapYear(int year) {
        if (year <= 0) {
            System.out.println("0년은 기원전 1년으로 해당년도부터 이전의 년도는 윤년판별이 불가합니다.");
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }

        return false;
    }

    public static String dateCalculatorIf(int number, boolean isleapYear) {
        //윤년 프로그램 < 일 경우 2월 0일인 문제점이 생기며 이것을 해결하고자 >= 바꾼다하더라도 모든 if문을 거치기 때문에 잘못된 출력이 나온다.
        if(number > 365){
            throw new IllegalArgumentException("365일 넘을 수 없습니다.");
        }

        String month = "January";

        if (number >= 31) {
            month = "February";
            number -= 31;
        }

        if (number >= (isleapYear ? 29 : 28)) {
            month = "March";
            number -= 28;
        }

        if (number >= 31) {
            month = "Apil";
            number -= 31;
        }

        if (number >= 30) {
            month = "May";
            number -= 30;
        }

        if (number >= 31) {
            month = "June";
            number -= 31;
        }
        if (number >= 31) {
            month = "Junly";
            number -= 31;
        }
        if (number >= 31) {
            month = "August";
            number -= 31;
        }
        if (number >= 31) {
            month = "September";
            number -= 31;
        }
        if (number >= 30) {
            month = "October";
            number -= 30;
        }
        if (number >= 31) {
            month = "November";
            number -= 31;
        }
        if (number >= 30) {
            month = "December";
            number -= 30;
        }
        return month + "/" + number;
    }

    public static String dateCalculator(int number, boolean isleapYear) {

        if (isleapYear) {
            dayCount[1] = 29;
        }

        for (int i = 0; i < dayCount.length; i++) {
            if (number > dayCount[i]) {
                number -= dayCount[i];
            } else {
                return (i + 1) + "월, " + number + "일 입니다.";
            }
        }
        return "365일을 초과합니다.";
    }

    public static void main(String[] args) {
        // int i = 5;
        // int j = 6;

        // if (i > j) {
        //     System.out.println("I bigger than J");
        // } else {
        //     System.out.println("J bigger than I");
        // }

        // leapYear : 윤년
        // commonYear : 평년
        Scanner scanner = new Scanner(System.in);
        System.out.print("지금 몇년입니까? : ");
        int year = scanner.nextInt();

        if (isleapYear(year)) {
            System.out.println(year + "은 윤년입니다.");
        } else {
            System.out.println(year + "은 평년입니다.");
        }

        // 숫자를 입력받고
        // 몇월 몇일인지 계산
        // 30 -> 1월 30일
        System.out.print("1년 중 몇일 입니까? : ");
        int date = scanner.nextInt();
        System.out.println(dateCalculatorIf(date, isleapYear(year)));// if문
        System.out.println(dateCalculator(date, isleapYear(year))); // for문
        scanner.close();

    }

}
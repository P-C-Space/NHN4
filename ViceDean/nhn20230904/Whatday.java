import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    static String[] monthNames = { "January", "Feburary", "March", "April", "May", "June", "July", "August",
            "Sepetember", "October", "November", "December" };

    public static void main(String[] args) {

        try {
            System.out.println("Enter year number: ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            int yearNum = Integer.parseInt(line);

            System.out.print("Enter a digit 1 between 365: ");
            line = scanner.nextLine();
            int dayNum = Integer.parseInt(line);

            boolean isLeapYear = (yearNum % 4 == 0) && (yearNum % 100 != 0 || yearNum % 400 == 0);

            if(isLeapYear){
                System.out.println("it's Leap Year");
            }
            
            else{
                System.out.println("it's Common Year");
            }

            if (dayNum < 1 || dayNum > 365) {
                throw new IllegalArgumentException("Out of Date");
            }

            /*
             * try (Scanner scanner2 = new Scanner(System.in) // 무조건 닫아줌 try resource
             * ){
             * int i = scanner2.nextInt();
             * int j = scanner2.nextInt();
             * 
             * int k = i / j;
             * } catch (Exception e) {
             * e.printStackTrace();
             * }
             */

            // System.out.println(dayNum);

            /*
             * if (dayNum <= 0) {
             * System.out.println("out of date!");
             * return;
             * }
             * 
             * if (dayNum > 365) {
             * System.out.println("out of date!");
             * return;
             * }
             */

            int monthNum = 0;
            
            if(isLeapYear){
                daysInMonth[1] = 29;
            }
            for (int days : daysInMonth) {
                if (dayNum <= days) {
                    break;
                } else {
                    dayNum -= days;
                    monthNum++;
                }
            }

            /*
             * if (dayNum >= 31) { // January
             * monthNum++;
             * dayNum -= 31;
             * }
             * 
             * if (dayNum >= 28) { // Feburary
             * monthNum++;
             * dayNum -= 28;
             * }
             * 
             * if (dayNum >= 31) { // March
             * monthNum++;
             * dayNum -= 31;
             * }
             * 
             * if (dayNum >= 30) { // April
             * monthNum++;
             * dayNum -= 30;
             * }
             * 
             * if (dayNum >= 31) { // May
             * monthNum++;
             * dayNum -= 31;
             * }
             * 
             * if (dayNum >= 30) { // June
             * monthNum++;
             * dayNum -= 30;
             * }
             * 
             * if (dayNum >= 31) { // July
             * monthNum++;
             * dayNum -= 31;
             * }
             * 
             * if (dayNum >= 31) { // August
             * monthNum++;
             * dayNum -= 31;
             * }
             * 
             * if (dayNum >= 30) { // September
             * monthNum++;
             * dayNum -= 30;
             * }
             * 
             * if (dayNum >= 31) { // October
             * monthNum++;
             * dayNum -= 31;
             * }
             * 
             * if (dayNum >= 30) { // November
             * monthNum++;
             * dayNum -= 30;
             * }
             * 
             * if (dayNum >= 32) { // December
             * monthNum++;
             * dayNum -= 31;
             * }
             */

            String monthName = "";

            switch (monthNum) {
                case 0:
                    monthName = "January";
                    break;
                case 1:
                    monthName = "Feburary";
                    break;
                case 2:
                    monthName = "March";
                    break;
                case 3:
                    monthName = "April";
                    break;
                case 4:
                    monthName = "May";
                    break;
                case 5:
                    monthName = "June";
                    break;
                case 6:
                    monthName = "July";
                    break;
                case 7:
                    monthName = "August";
                    break;
                case 8:
                    monthName = "September";
                    break;
                case 9:
                    monthName = "October";
                    break;
                case 10:
                    monthName = "November";
                    break;
                case 11:
                    monthName = "December";
                    break;
                default:
                    monthName = "Not Set";
                    break;
            }

            System.out.println(monthName + ", " + dayNum);
            scanner.close();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
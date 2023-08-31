package ViceDean.p20230829;

import java.util.Scanner;

public class Demonstrate {

    public static double fahrenheitToCelsius(int f) {
        double result = (f - 32) * 5 / 9;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 6 + 9 + 8;
        int i2 = scanner.nextInt();
        System.out.println(i);
        System.out.println(i2);

        // 화씨를 입력하세요
        System.out.print("화씨를 입력해주세요(\u2109) : ");
        int f = scanner.nextInt();

        // 화씨 몇도는 썹시 몇도입니다. 출력
        System.out.println("화씨 : " + f + "\u2109 는 썹씨 : " + fahrenheitToCelsius(f) + "\u2103 입니다.");

        System.out.println("The rating of the movie is");
        System.out.println(6+8+9);
        scanner.close();
    }
}

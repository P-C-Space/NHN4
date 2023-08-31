import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        printNumber();

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int num = 10;

        System.out.println("num = " + num);
        num++;
        num--;

        num += 1;
        num *= 1;

        int i = 1;

        String abc = "";
    }

    private static void printNumber() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }
}

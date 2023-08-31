/*
 * Main 클래스입니다.
 * */

import java.util.Random;

public class Main {

    /*
     * main 메서드입니다.
     *
     * @param args input인자
     * */

    public static void main(String[] args) {

        Random random = new Random();
        int random1 = (int) (Math.random() * 6) + 1;
        int random2 = (int) (Math.random() * 6) + 1;

        Dice dice1 = new Dice(random1);
        Dice dice2 = new Dice(random2);
        System.out.println("주사위 합 = " + DiceCalculator.addDice(dice1, dice2));

        String str = "abcdefg";

        /*
         * random 값의 인덱스만큼 문자열 출력
         * 0 -> "a"
         * 1 -> "ab"
         * 2 -> "abc"
         * */

        int val = (int) (Math.random() * str.length());
        System.out.println(DiceCalculator.getIndexOf(str, val));

        int random4 = (int) (Math.random() * 6) + 1;
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈이 홀수 : " + DiceCalculator.odd(dice));

        /*
         * 주사위 합 = ?
         * ???
         * 주사위 눈이 홀수 : true or false
         * */

        // 도서관 생성
        // 생성자 (size)
        // 음수가 들어올 경우 예외 발생

        String testStart = "\n==========Test Code==========";
        String testEnd = "==========Test 종료===========\n";

        System.out.println(testStart);
        try {
            new Library(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(testEnd);
        Library library = new Library(5);

        // add book(책 이름 중복 불가능)
        library.add("노르웨이의 숲");
        library.add("스티브 잡스");
        library.add("마이크로소프트의 모든것");
        library.add("NHN의 역사");

        System.out.println(testStart);
        try {
            library.add("NHN의 역사");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(testEnd);


        System.out.println(testStart);
        try {
            library.add("NHN와 함께");
            library.add("NHN는 무슨기업인가?");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(testEnd);

        // 책 삭제(없는 책인 경우 예외)
        library.delete("스티브 잡스");

        System.out.println(testStart);
        try {
            library.delete("안녕하세요");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(testEnd);


        // 책 출력(없는 책인 경우 "없는 책" 출력 예외 발는생 x)
        library.find("NHN Academy Study");

        // 모든 책 출력
        library.findAll();
    }
}

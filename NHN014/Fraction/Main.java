import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static class Fraction {
        private int numerator; // 분자
        private int denominator; // 분모

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void normalize() {
            int gcdValue = GCD(this.getDenominator(), this.getNumerator());
            this.setNumerator(this.getNumerator() / gcdValue);
            this.setDenominator(this.getDenominator() / gcdValue);

        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        private int GCD(int a, int b) {
            if (a % b == 0) {
                return b;
            }
            return GCD(b, a % b);
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }

    }

    /**
     * 소수점 값에 대해 자리 수 계산 하는 메서드. <br/>
     * ex) <br/>
     * 0.01 -> 100을 곱하기 위해 2를 return <br/>
     * 0.1 -> 10을 곱하기 위해 1을 return
     *
     *
     * @param num 소수 값
     * @return 소수점 이하 자리 수 값
     */
    public static int getDecimalNumber(BigDecimal num) {
        String str = num.toPlainString();

        // 1 아래의 수 보장
        str = str.substring(2, str.length());
        return str.length();
    }

    public static String solution(String input) {
        BigDecimal number = new BigDecimal(input);

        int decimalNumber = getDecimalNumber(number);

        double denominator = Math.pow(10, decimalNumber);
        int numerator = (int) (number.doubleValue() * Math.pow(10, decimalNumber));
        return new Fraction(numerator, (int) denominator).toString();
    }

    private static String test(String input) {
        return solution(input);
    }

    private static String[] TEST_CASE = { "0.1", "0.25", "0.5", };
    private static String[] TEST_CASE_ANSWER = { "1/10", "1/4", "1/2", };

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < TEST_CASE.length; i++) {
            if (test(TEST_CASE[i]).equals(TEST_CASE_ANSWER[i])) {
                count++;
            }
            System.out.println("TEST CASE " + (i + 1) + " : " + test(TEST_CASE[i]).equals(TEST_CASE_ANSWER[i]));
        }
        System.out.println(
                "적중률 : " + (count == 0 ? "0" : ((double) count / (double) TEST_CASE_ANSWER.length) * 100) + "%");

        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(3, 5);


        List<Integer> list2 = new LinkedList<>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(3, 5);


        for (Integer integer : list1) {
            System.out.println(integer);
        }

    }

}
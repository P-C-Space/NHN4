package Test;

public class Main {
    public static void main(String[] args) {
        boolean nothingInCommon;
        nothingInCommon = true; // s1과 s2가 공통된 문자가 없다고 가정.
        int i, j; // s1과 s2의 문자들을 반복하는 변수들.

        String s1 = "hi";
        String s2 = "hello";
        i = 0;
        hi: while (true) {
            i = 0;
            System.out.println("나왔다 히히");

            while (i < 100) {
                i++;
                System.out.println("break 전");
               
               
                if (i > 10) {
                    break hi; // 양 루프를 *모두* 중단
                }
            }
            // s2의 다음 문자로 이동.
            System.out.println("나왔다 히히");
        }
        // s1의 다음 문자로 이동.
        System.out.println(i);
    }

}

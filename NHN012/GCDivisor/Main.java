package GCDivisor;

public class Main {
    // {10,20,30,40} = 20
    // {5,7,12} = 1

    private static int[][] TEST_CASE = { { 10, 20, 30, 40 }, { 5, 7, 12 } };
    private static int[] TEST_CASE_ANSWER = { 20, 1 };
    private static boolean[] IsTrue = new boolean[TEST_CASE.length];

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < TEST_CASE.length; i++) {
            if ((solution(TEST_CASE[i]) == TEST_CASE_ANSWER[i])) {
                IsTrue[i] = true;
                count++;
            }
            System.out.println("TESTCASE " + (i + 1) + " : " + IsTrue[i]);
        }
        System.out.println("정답률 : " + (count == 0 ? "0" : ((double)count / (double)TEST_CASE_ANSWER.length) * 100) + "%");

    }

    public static int solution(int[] input) {
        int max = 0;
        for(int i = 0;i < input.length - 1;i++){
            for(int j = i + 1;j < input.length;j++){
                max = Math.max(max,GCD(input[j],input[i]));
            }
        }
        return max;
    }

    public static int GCD(int a,int b){
        if(a % b == 0){
            return b;
        }

        return GCD(b, a%b);
        
    }
}
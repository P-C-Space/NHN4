public class Main {

    private static double correctCount = 0;

    private static final String[][] TESTCASES = new String[][] {
            {"123", "123", "246"},
            {"1000", "1", "2"},
            {"456", "789", "1461"},
            {"5", "5", "1"},
            {"11112", "54321", "65433"},
            {"3829", "1300", "4139"}
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(String input, String input2, String answer) {
        int first = Integer.parseInt(input);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    // solution
    public static int solution(int a, int b) {
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);

        String aReverseString = "";
        String bReverseString = "";
        int result = 0;
        String resultString;
        String resultReverseString = "";

        for(int i = 0;i<aString.length();i++){
            aReverseString = aString.charAt(i) + aReverseString;
        }

        for(int j = 0;j<bString.length();j++){
            bReverseString = bString.charAt(j) + bReverseString;
        }

        result = Integer.valueOf(aReverseString) + Integer.valueOf(bReverseString);
        resultString = String.valueOf(result);
        for(int k = 0;k<resultString.length();k++){
            resultReverseString = resultString.charAt(k) + resultReverseString;
        }

        return Integer.valueOf(resultReverseString);
    }

    // 강사 코드
    public static int solution2(int a, int b){
        return reverse(reverse(a) + reverse(b));
    }

    public static int reverse(int n){
        char[] arr = String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1;i >= 0; i--){
            sb.append(arr[i]);
        }

        return Integer.parseInt(sb.toString());
    }
}
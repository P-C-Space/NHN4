public class Main {

    private static double correctCount = 0;
    private static final String[][] TESTCASES = new String[][] {
            { "abciwkabc", "abc", "2" },
            { "aciwcosck", "c", "3" },
            { "banana", "na", "2" },
            { "alhorithmtest", "th", "1"},
    };

    public static void main(String[] args) {

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));

        System.out.println("정답률 = " + (int)(correctCount / TESTCASES.length * 100) + "%");
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }

    private static boolean test(String input, String input2, String answer) {
        boolean res = String.valueOf(solution(input, input2)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    // solution
    private static int solution(String str, String specificStr) {
        int count = 0;
        boolean checkString;


        for(int i = 0;i < str.length() - specificStr.length() + 1; i++){
            checkString = true;

            for(int j = 0;j<specificStr.length();j++){
                if(str.charAt(i+j) != specificStr.charAt(j)){
                    checkString = false;
                    break;
                }
            }


            if(checkString){
                count++;
            }

        }
        return count;
    }

}
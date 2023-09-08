public class Main {

    static boolean[] isNotPrime = new boolean[100000 + 1];

    public static int solution(int start, int end) {
        return isPrimeSolution(start, end);
    }

    public static int solution2(int start,int end){
        return isPrimeSolution2(start,end);
    }

    private static int isPrimeSolution(int start, int end) {
        int count = 0;
        for(int i = start; i < end;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    private static int isPrimeSolution2(int start, int end) {
        int count = 0;
        storeIsPrime();
        for(int i = start; i < end;i++){
            if(!isNotPrime[i]){
                count++;
            }
        }
        return count;
    }


    private static void storeIsPrime(){
        isNotPrime[0] = isNotPrime[1] = true;
        for(int i = 2;i < Math.sqrt(isNotPrime.length);i++){
            if(!isNotPrime[i]){
                for(int j = i * i;j<isNotPrime.length;j += i)
                    isNotPrime[j] = true;
            }
        }
    }

    private static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = " + test2(TEST_CASES[i][0], TEST_CASES[i][1], TEST_CASES_RESULTS[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }




    private static boolean test(int start, int end, int result) {
        if (solution(start, end) == result) {
            correct++;
            return true;
        }

        return false;
    }

    private static boolean test2(int start, int end, int result) {
        if (solution2(start, end) == result) {
            correct++;
            return true;
        }

        return false;
    }


    private static double correct = 0;

    private static final int[][] TEST_CASES = {
            {1, 10},
            {1, 50},
            {1, 1000},
            {1, 100000},
            {5, 20},
            {11, 123},
            {55, 5555},
            {1000, 100000}
    };

    private static final int[] TEST_CASES_RESULTS = {
            4,
            15,
            168,
            9592,
            6,
            26,
            716,
            9424
    };

}
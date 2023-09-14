package LeastCommonMultiple;

public class Main {

    private static int TEST_CASE[][] = {{1,1},{98,49},{2,81},{3,7},{19,87},{1,40}};
    private static int TEST_CASE_ANSWER[] = {1,98,162,21,1653,40};


    public static void main(String[] args) {
        int count = 0;
        for(int i =0 ;i<TEST_CASE_ANSWER.length;i++){
            if (test(TEST_CASE[i]) == TEST_CASE_ANSWER[i]){
                count++;
            }
            System.out.println("TEST CASE " + (i+1) + " : " + (test(TEST_CASE[i]) == TEST_CASE_ANSWER[i]));
        }

        System.out.println("정답률 : " + (count == 0 ? "0": (((double)count / (double)TEST_CASE_ANSWER.length)) * 100.0) + "%");
    }

    private static int test(int []values){
        return solution(values[0], values[1]);
    }


    // solution
    private static int solution(int first, int second) {
        return (first * second) / GCD(first,second);
    }

    private static int GCD(int first,int second){
        if(first % second == 0){
            return second;
        }

        return GCD(second,first%second);
    }

}
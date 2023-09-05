package nhn20230905;

public class recursion {

    public static int sigma(int start, int end, int step) {
        return calc(new Adder(),start,end,step,0);
        // int result = 0;
        // for (int i = start; i <= end; i += step) {
        //     result += i;
        // }

        // return result;
    }

    public static int sigmaPi(int start, int end, int step) {
        int result = 1;
        for (int i = start; i <= end; i += step) {
            result *= i;
        }

        return result;
    }

    public static int add(int n) {
        if (n == 1) {
            return 1;
        }
        return n + add(n - 1);
    }

    public static int calc(Adder binder, int start,int end,int step,int init){
        int result =  init;
        for (int i = start; i <= end; i += step) {
           result = binder.apply(result,i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(10));

        System.out.println(sigma(1, 10, 1));
        System.out.println(sigmaPi(1,10,2));

    }
}

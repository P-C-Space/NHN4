package nhn20230905;

public class Sample {
    public static int add(int n){
        if(n == 1){
            return 1;
        }

        return n + add(n-1);
    }

    public static int calc(BinaryOp binder, int start, int end, int step, int init){
        int result = init;
        for(int i = start; i <= end; i += step){
            result = binder.apply(result, i);
        }

        return result;
    }

    public static int sigma(int start,int end, int step){
        return calc(new Adder(), start, end, step, 0);
    }

    public static int pi(int start,int end, int step){
        return calc(new Multiplier(), start, end, step, 1);
    }


    public static void main(String[] args) {
        System.out.println(add(10));

        System.out.println(sigma(1,10,1));
        System.out.println(pi(1,10,1));
        
        
        System.out.println(calc(new BinaryOp() {
            @Override
            public int apply(int i, int j) {
                return i + j;
            }
            
        }, 1, 10, 1, 0));

        System.out.println(calc((x,y) -> x * y, 1, 10, 1, 1));
    }
}

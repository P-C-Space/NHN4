public class Sample {
    static boolean compare(int i, int j){
        if(i % j == 0){
            return true;
        }
        return false;
    }

    public static void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public static void addOne(int i){
        i = i + 1;
    }

    public static void addOne(int[] array){
        array[0] = array[0] + 1;
    }

    static int add(int i ,int j){
        return i + j;
    }
    

    public static void main(String[] args) {
        int i = 1;
        int k = 2;

        swap(i,k);

        int[] j ={1,2};
        addOne(j);
        System.out.println(j[0]);

        System.out.println("i : " + i + ", k : " + k);
        // Sample sample = new Sample();
        // sample.compare -> instance 메서드
        
        // static compare -> class 메서드

        if(compare(i,k)){
            System.out.println("Escape");
        }


        if (i == k) {
            System.out.println("escape");
        }
        else{
            System.out.println("Stay");
        }

        i = 5;
        k = 9;
        if (i == k) {
            System.out.println("Escape");
        }
        else{
            System.out.println("Stay");
        }

        i = 5;
        k = 10;

        if (i == k) {
            System.out.println("Escape");
        }
        else{
            System.out.println("Stay");
        }
    }
}

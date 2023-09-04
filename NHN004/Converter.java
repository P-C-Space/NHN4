package nhn20230831;

public class Converter {
    // public static int max(int i, int j){
    // if(i > j){
    // return i;
    // }
    // else{
    // return j;
    // }
    // }

    // public static int max3(int i,int j,int k){
    // return max(i, max(j, k));
    // }

    public static int binaryToDecimal(String binary) {

        int result = 0;
        int n = 1;
        for (int i = binary.length(); i > 0; i--) {
            // System.out.println(Integer.valueOf(binary.substring(i - 1, i)));
            if(binary.substring(i-1, i).equals("1")){
                result += 1*n;
            }
            n *= 2;
        }
        return result;
    }

    public static String DecimalToBinary(int decimal){
        String result = "";
        while(decimal > 0){
            if(decimal % 2 == 0){
                result = "0" + result;
            }
            else{
                result = "1" + result;
            }
            decimal /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal("0101001"));
        System.out.println(DecimalToBinary(binaryToDecimal("0101001")));
    }
}
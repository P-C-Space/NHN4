package com.nhnacademy.converter;
// 2진수 : binary number      0b
// 8진수 : octal number       0
// 10진수 : decimal number
// 16진수 : hexadecimal       0x

public class Converter {


    public static int numberToDecimal(String number){
        String []alpha = {"A","B","C","D","E","F"};
        String numberCheck = number.substring(0,2); // 진수 체크
        int multinumber;
        int count = 1;
        int result = 0;

        if(numberCheck.equals("0b")){ // 2 진수
            number = number.substring(2,number.length());
            multinumber = 2;
        }
        else if(numberCheck.equals("0x")){ // 16 진수
            number = number.substring(2,number.length());
            multinumber = 16;
        }
        else{ // 8 진수
            number = number.substring(1,number.length());
            multinumber = 8;
        }

        for(int i = number.length()-1;i >= 0;i--){
            char c = number.charAt(i);

            // 아스키 코드값
            // 48 : 0
            // 65 : A
            int n = c >= 65 ? c-55 : c-48;
            result += n * count;
            count *= multinumber;
        }



        return result;
    }

    public static String decimalToNumber(int number, int numberCheck){
        String result = "";

        // 2진수 변환
        while(number > 0){
            if(number % 2 == 0){
                result = "0" + result;
            }
            else{
                result = "1" + result;
            }
            number/=2;
        }

        // return
        result = "0b" + result;
        if(numberCheck == 8){
            return binaryToOctal(result);
        }
        else if(numberCheck == 16){
            return binaryToHex(result);
        }
        return result;
    }

    // 2 -> 8
    public static String binaryToOctal(String binary){
        String result = ""; // 반환값
        binary = binary.substring(2,binary.length()); // ob 잘라냄
        // System.out.println(binary);
        int size = binary.length();

        if(size % 3 != 0){
            for(int i = 0;i < 3 - (size % 3);i++){
                binary = "0" + binary; // 3자리 단위로 맞춤
            }
        }
        // System.out.println(binary);
        size = binary.length();

        while(size >= 3){
            int count = 1;
            int sum = 0;

            String subBinary = binary.substring(size-3,size);
            for(int i = 3;i > 0;i--)
            {
                sum += Integer.valueOf(subBinary.substring(i-1,i)) * count;
                count *= 2;
            }

            result = sum + result;
            size -= 3;

        }

        return "0" + result;
    }

    // 8 -> 2
    public static String octalToBinary(String octal){
        return decimalToNumber(numberToDecimal(octal),2);
//        String result = "";
//
//        int size = octal.length();
//        octal = octal.substring(1,size); // 0 잘라냄
//        size = octal.length();
//
//        for(int i = 0;i<size;i++){
//            int n = Integer.valueOf(octal.substring(i, i+1));
//
//            String subResult = "";
//            while(n > 0){
//                if(n % 2 == 0){
//                    subResult = "0" + subResult;
//                }
//                else{
//                    subResult = "1" + subResult;
//                }
//                n/=2;
//            }
//
//            // 첫 번째 경우를 제외 나머지 경우에 대해 3자리를 맞춤
//            if(i > 0){
//                if(subResult.length() % 3 != 0){
//                    for(int j = 0;j < 3 - subResult.length(); j++){
//                        subResult = "0" + subResult;
//                    }
//                }
//            }
//            result += subResult;
//
//        }
    }

    // 2 -> 16
    public static String binaryToHex(String binary){
        String []alpha = {"A","B","C","D","E","F"};
        String result = "";
        binary = binary.substring(2,binary.length());
        int size = binary.length();

        if(size % 4 != 0){ // count check
            for(int i = 0;i<4 - (size % 4);i++){
                binary = "0" + binary;
            }
        }

        size = binary.length(); // size update

        while(size >= 4){
            int count = 1;
            int sum = 0;

            String subBinary = binary.substring(size-4,size);
            for(int i = 4;i > 0;i--)
            {
                sum += Integer.valueOf(subBinary.substring(i-1,i)) * count;
                count *= 2;
            }

            // 10 이상의 수 체크
            result = sum >= 10 ? alpha[sum - 10] + result : sum + result;

            size -= 4;

        }

        return "0x" + result;
    }

    // 16 -> 2
    public static String hexToBinary(String hex){
        return decimalToNumber(numberToDecimal(hex),2);
//        String result = "";
//        hex = hex.substring(2,hex.length()); // 0x 잘라냄
//        int size = hex.length();
//
//
//        for(int i = 0;i<size;i++){
//            char c = hex.charAt(i);
//
//            // 아스키 코드값
//            // 48 : 0
//            // 65 : A
//            int n = c >= 65 ? c-55 : c-48;
//
//            String subResult = ""; // 임시로 저장할 값
//            while(n > 0){
//                if(n % 2 == 0){
//                    subResult = "0" + subResult;
//                }
//                else{
//                    subResult = "1" + subResult;
//                }
//                n/=2;
//            }
//
//            // 첫 번째 경우를 제외 나머지 경우에 대해 4자리를 맞춤
//            if(i > 0){
//                if(subResult.length() % 4 != 0){
//                    for(int j = 0;j < 4 - subResult.length(); j++){
//                        subResult = "0" + subResult;
//                    }
//                }
//            }
//            result += subResult;
//        }
//
//
//
//        return "0b" + result;
    }

    public static String octalToHex(String octal){
        return binaryToHex(octalToBinary(octal));
    }

    public static String hexToOctal(String hex){
        return binaryToOctal(hexToBinary(hex));
    }

}

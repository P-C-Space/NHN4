package com.nhnacademy.app;

import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.random.RandomDataGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 실습 1
        java.util.Random r = new java.util.Random();
        int value = r.nextInt(100) + 1;
        System.out.println(value);

        RandomDataGenerator random = new RandomDataGenerator();
        int value2 = random.nextInt(1, 100);
        System.out.println(value2);
        // 실습 2
        String testString = "";

        isEmpty(testString);
        stringIsEmpty(testString);
    }

    public static boolean isEmpty(String str){
        if(Objects.isNull(str) || str.isEmpty()) {
            System.out.println("빈 문자열 입니다!");
            return true;
        }else{
            System.out.println("빈 문자열 아닙니다!");
            return false;
        }
    }

    public static boolean stringIsEmpty(String str){
        if(StringUtils.isEmpty(str)){
            System.out.println("빈 문자열 입니다!");
            return true;
        }else{
            System.out.println("빈 문자열 아닙니다!");
            return false;
        }
    }


}

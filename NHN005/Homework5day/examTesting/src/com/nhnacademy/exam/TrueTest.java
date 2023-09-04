package com.nhnacademy.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TrueTest {
    public static boolean twoMoreTrue(String... args) {

        // assert args.length > 3;
        switch (args.length){
            case 0:
            case 1:
            case 2:
                throw new IllegalArgumentException("인자의 수 부족 세 개이상 필요");
        }
//        if(args.length < 3){
//            throw new IllegalArgumentException("인자의 수 부족 세 개이상 필요");
//        }


        int trueCount = 0;

        for(int i = 0;i<3;i++){
            trueCount += Boolean.valueOf(args[i]) ? 1 : 0;
        }


        return trueCount >= 2;
    }

    @Test
    @DisplayName("TrueTest1")
    void TrueTest1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> twoMoreTrue("true","true"));
    }

    @Test
    @DisplayName("TrueTest2")
    void TrueTest2(){
        Assertions.assertEquals(true,twoMoreTrue("true","True","AnythingButTrueIsFalse"));
    }

    @Test
    @DisplayName("TrueTest3")
    void TrueTest3(){
        Assertions.assertEquals(false,twoMoreTrue("0","x","true","true","true"));
    }

}

// $ java TrueTest true True AnythingButTrueIsFalse
// true
// $ java TrueTest 0 x true true true
// false
// $ java TrueTest true true
// Exception in thread "main" java.lang.IllegalArgumentException: TrueTest: three boolean arguments
// required
// ...
